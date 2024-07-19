package Project.server;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

import Project.common.Constants;
import Project.common.GeneralUtils;
import Project.common.MyLogger;


public class Room implements AutoCloseable {
	private String name;
	private List<ServerThread> clients = Collections.synchronizedList(new ArrayList<ServerThread>());
	private boolean isRunning = false;
	// Commands
	private final static String COMMAND_TRIGGER = "/";
	private final static String CREATE_ROOM = "createroom";
	private final static String JOIN_ROOM = "joinroom";
	private final static String DISCONNECT = "disconnect";
	private final static String LOGOUT = "logout";
	private final static String LOGOFF = "logoff";
	private static MyLogger logger = MyLogger.getLogger(Room.class.getName());
	private HashMap<String, String> converter = null;
	public Room(String name) {
		this.name = name;
		isRunning = true;
	}

	private void info(String message) {
		logger.info(String.format("Room[%s]: %s", name, message));
	}

	public String getName() {
		return name;
	}

	public boolean isRunning() {
		return isRunning;
	}

	protected synchronized void addClient(ServerThread client) {
		if (!isRunning) {
			return;
		}
		client.setCurrentRoom(this);
		if (clients.indexOf(client) > -1) {
			info("Attempting to add a client that already exists");
		} else {
			client.setFormattedName(String.format("<font color=\"%s\">%s</font>", GeneralUtils.getRandomHexColor(),
					client.getClientName()));
			clients.add(client);
			sendConnectionStatus(client, true);
			sendRoomJoined(client);
			sendUserListToClient(client);
			String name = client.getClientName() + ".txt";
            File f = new File(name);
            String line;
            try {
            if (f.length() > 1) {
                String s = String.valueOf(client.getSize());
                if (s.equals("0")) {
                    BufferedReader br = new BufferedReader(new FileReader(f));
                    while ((line = br.readLine()) != null) {
                        client.setAddList(line);
                        //String s = String.valueOf(client.getSize());
 
                    }
           
                }
            }
        }catch(Exception e) {
 
           
        }
    }

		}
	

	protected synchronized void removeClient(ServerThread client) {
		if (!isRunning) {
			return;
		}
		clients.remove(client);
		// we don't need to broadcast it to the server
		// only to our own Room
		if (clients.size() > 0) {
			// sendMessage(client, "left the room");
			sendConnectionStatus(client, false);
		}
		checkClients();
	}

	/***
	 * Checks the number of clients.
	 * If zero, begins the cleanup process to dispose of the room
	 */
	protected void checkClients() {
		// Cleanup if room is empty and not lobby
		if (!name.equalsIgnoreCase(Constants.LOBBY) && clients.size() == 0) {
			close();
		}
	}

	/***
	 * Helper function to process messages to trigger different functionality.
	 * 
	 * @param message The original message being sent
	 * @param client  The sender of the message (since they'll be the ones
	 *                triggering the actions)
	 */
	private boolean processCommands(String message, ServerThread client) {
		boolean wasCommand = false;
		try {
			if (message.startsWith(COMMAND_TRIGGER)) {
				String[] comm = message.split(COMMAND_TRIGGER);
				String part1 = comm[1];
				String[] comm2 = part1.split(" ");
				String command = comm2[0];
				String roomName;
				String command1;
				Iterator<ServerThread> iter = clients.iterator();
				long from = (client == null) ? Constants.DEFAULT_CLIENT_ID : client.getClientId();
				wasCommand = true;
				switch (command) {
					case CREATE_ROOM:
						roomName = comm2[1];
						Room.createRoom(roomName, client);
						break;
					case JOIN_ROOM:
						roomName = comm2[1];
						Room.joinRoom(roomName, client);
						break;
					case DISCONNECT:
					case LOGOUT:
					case LOGOFF:
						Room.disconnectClient(client, this);
						break;
						case "flip":
						Random rand = new Random();
						int upperlimit = 2;

						
						int diceroll = rand.nextInt(upperlimit);
						// Diceroll could only choose from 0 or 1. 0 is Heads and 1 is Tails
						String rev;

						if (diceroll == 0) {

							rev = "Heads";
						} else {
							rev = "Tails";
						}

						String rev2 = "The Coin Flipped the side: " + "<b>" + rev + "</b>";

						while (iter.hasNext()) {
						
						
						
							ServerThread client2 = iter.next();
							client2.sendMessage(from, rev2);
						}
						
						break;
			
					case "roll":
						command1 = comm2[1];
						Random rand1 = new Random();
						
						int upperlimit1 = Integer.parseInt(command1);
						

						

						// You can roll a number between 0 and any number you want. The code doesnt work unlesss a number is picked
						int roll = rand1.nextInt(upperlimit1);

						String result1 = Integer.toString(roll);
						String result2 = "Between 0 and " + upperlimit1 + ", the code generated the number: " + "<u>" + result1 + "</u>";
						while (iter.hasNext()) {
						
						
						
							ServerThread client2 = iter.next();
							client2.sendMessage(from, result2);
						}
						
						break;
					case "mute":
						command1 = comm2[1];
						while (iter.hasNext()) {
						
						
						
						ServerThread client2 = iter.next();
						if(command1.equals(client2.getClientName())) {
						client2.sendMessage(from, client.getClientName() + ": Muted You");
						}
					}
						// adds username to senders list
						
						
						client.setAddList(command1);
						client.writeLog2(client.getClientName());
						break;
					case "unmute":
						// removes username from senders lis
						command1 = comm2[1];
						while (iter.hasNext()) {
						
						
						
							ServerThread client2 = iter.next();
							if(command1.equals(client2.getClientName())) {
							client2.sendMessage(from, client.getClientName() + ": Does not Mute you");
							}
						}
						client.setRemoveList(command1);
						client.writeLog2(client.getClientName());
						break;
					default:
						wasCommand = false;
						break;
				}
			}
			if (message.startsWith("@")) {
				long from = (client == null) ? Constants.DEFAULT_CLIENT_ID : client.getClientId();
				String[] str = message.split("@");
				String str1 = str[1];

				client.sendMessage(from, message);
				Iterator<ServerThread> iter = clients.iterator();
				synchronized (clients) {
					while (iter.hasNext()) {

						ServerThread client2 = iter.next();
						// checks if client2 matches @Username and that client2 is not muted with client
						if (client2.getClientName().equals(str1) & !client2.isMuted(client.getClientName())) {
							client2.sendMessage(from, message);
						}

					}

				}
				wasCommand = true;

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return wasCommand;
	}

	// Command helper methods

	protected static void getRooms(String query, ServerThread client) {
		String[] rooms = Server.INSTANCE.getRooms(query).toArray(new String[0]);
		client.sendRoomsList(rooms,
				(rooms != null && rooms.length == 0) ? "No rooms found containing your query string" : null);
	}

	protected static void createRoom(String roomName, ServerThread client) {
		if (Server.INSTANCE.createNewRoom(roomName)) {
			Room.joinRoom(roomName, client);
		} else {
			client.sendMessage(Constants.DEFAULT_CLIENT_ID, String.format("Room %s already exists", roomName));
			client.sendRoomsList(null, String.format("Room %s already exists", roomName));
		}
	}

	protected static void joinRoom(String roomName, ServerThread client) {
		if (!Server.INSTANCE.joinRoom(roomName, client)) {
			client.sendMessage(Constants.DEFAULT_CLIENT_ID, String.format("Room %s doesn't exist", roomName));
			client.sendRoomsList(null, String.format("Room %s doesn't exist", roomName));
		}
	}

	protected static void disconnectClient(ServerThread client, Room room) {
		client.setCurrentRoom(null);
		client.disconnect();
		room.removeClient(client);
	}
	// end command helper methods

	/***
	 * Takes a sender and a message and broadcasts the message to all clients in
	 * this room. Client is mostly passed for command purposes but we can also use
	 * it to extract other client info.
	 * 
	 * @param sender  The client sending the message
	 * @param message The message to broadcast inside the room
	 */
	protected synchronized void sendMessage(ServerThread sender, String message) {
		if (!isRunning) {
			return;
		}
		info("Sending message to " + clients.size() + " clients");
		if (sender != null && processCommands(message, sender)) {
			// it was a command, don't broadcast
			return;
		}
		message = formatMessage(message);
		long from = (sender == null) ? Constants.DEFAULT_CLIENT_ID : sender.getClientId();
		synchronized (clients) {
			Iterator<ServerThread> iter = clients.iterator();
			boolean messageSent = true;
			while (iter.hasNext()) {
				ServerThread client = iter.next();

				// mutes(doesnt send message) if client is muted with the sender
				try {
					if (!client.isMuted(sender.getClientName())) {

						messageSent = client.sendMessage(from, message);
					}

				} catch (Exception e) {

				}
				if (!messageSent) {
					handleDisconnect(iter, client);
				}
			}
		}
	}

	protected String formatMessage(String message) {
		String alteredMessage = message;
		
		// expect pairs ** -- __
		if(converter == null){
			converter = new HashMap<String, String>();
			// user symbol => output text separated by |
			converter.put("\\*{2}", "<b>|</b>");
			converter.put("--", "<i>|</i>");
			converter.put("__", "<u>|</u>");
			converter.put("#r#", "<font color=\"red\">|</font>");
			converter.put("#g#", "<font color=\"green\">|</font>");
			converter.put("#b#", "<font color=\"blue\">|</font>");
		}
		for (Entry<String, String> kvp : converter.entrySet()) {
			if (GeneralUtils.countOccurencesInString(alteredMessage, kvp.getKey().toLowerCase()) >= 2) {
				String[] s1 = alteredMessage.split(kvp.getKey().toLowerCase());
				String m = "";
				for (int i = 0; i < s1.length; i++) {
					if (i % 2 == 0) {
						m += s1[i];
					} else {
						String[] wrapper = kvp.getValue().split("\\|");
						m += String.format("%s%s%s", wrapper[0], s1[i], wrapper[1]);
					}
				}
				alteredMessage = m;
			}
		}

		return alteredMessage;
	}

	protected synchronized void sendUserListToClient(ServerThread receiver) {
		info(String.format("Room[%s] Syncing client list of %s to %s", getName(), clients.size(),
				receiver.getClientName()));
		synchronized (clients) {
			Iterator<ServerThread> iter = clients.iterator();
			while (iter.hasNext()) {
				ServerThread clientInRoom = iter.next();
				if (clientInRoom.getClientId() != receiver.getClientId()) {
					boolean messageSent = receiver.sendExistingClient(clientInRoom.getClientId(),
							clientInRoom.getClientName(),
							clientInRoom.getFormattedName());
					// receiver somehow disconnected mid iteration
					if (!messageSent) {
						handleDisconnect(null, receiver);
						break;
					}
				}
			}
		}
	}

	protected synchronized void sendRoomJoined(ServerThread receiver) {
		boolean messageSent = receiver.sendRoomName(getName());
		if (!messageSent) {
			handleDisconnect(null, receiver);
		}
	}

	protected synchronized void sendConnectionStatus(ServerThread sender, boolean isConnected) {
		// converted to a backwards loop to help avoid concurrent list modification
		// due to the recursive sendConnectionStatus()
		// this should only be needed in this particular method due to the recusion
		if (clients == null) {
			return;
		}
		synchronized (clients) {
			for (int i = clients.size() - 1; i >= 0; i--) {
				ServerThread client = clients.get(i);
				boolean messageSent = client.sendConnectionStatus(sender.getClientId(), sender.getClientName(),
						sender.getFormattedName(),
						isConnected);
				if (!messageSent) {
					clients.remove(i);
					info("Removed client " + client.getClientName());
					checkClients();
					sendConnectionStatus(client, false);
				}
			}
		}
	}

	protected synchronized void handleDisconnect(Iterator<ServerThread> iter, ServerThread client) {
		if (iter != null) {
			iter.remove();
		}
		info("Removed client " + client.getClientName());
		checkClients();
		sendConnectionStatus(client, false);
		// sendMessage(null, client.getClientName() + " disconnected");
	}

	public void close() {
		logger.info(getName() + " closing");
		Server.INSTANCE.removeRoom(this);
		isRunning = false;
		clients = null;
	}
}