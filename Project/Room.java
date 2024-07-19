package Project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Room implements AutoCloseable{
	protected static Server server;// used to refer to accessible server functions
	private String name;
	private List<ServerThread> clients = new ArrayList<ServerThread>();
	private boolean isRunning = false;
	// Commands
	private final static String COMMAND_TRIGGER = "/";
	private final static String CREATE_ROOM = "createroom";
	private final static String JOIN_ROOM = "joinroom";
	private final static String DISCONNECT = "disconnect";
	private final static String LOGOUT = "logout";
	private final static String LOGOFF = "logoff";

	public Room(String name) {
		this.name = name;
		isRunning = true;
	}

	private void info(String message) {
		System.out.println(String.format("Room[%s]: %s", name, message));
	}

	public String getName() {
		return name;
	}

	protected synchronized void addClient(ServerThread client) {
		if (!isRunning) {
			return;
		}
		client.setCurrentRoom(this);
		if (clients.indexOf(client) > -1) {
			info("Attempting to add a client that already exists");
		} else {
			clients.add(client);
			new Thread() {
				@Override
				public void run() {
					// slight delay to let potentially new client to finish
					// binding input/output streams
					// comment out the Thread.sleep to see what happens
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//sendMessage(client, "joined the room " + getName());
					sendConnectionStatus(client, true);
				}
			}.start();

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
			//sendMessage(client, "left the room");
			sendConnectionStatus(client, false);
		}
		checkClients();
	}

	/***
	 * Checks the number of clients.
	 * If zero, begins the cleanup process to dispose of the room
	 */
	private void checkClients() {
		// Cleanup if room is empty and not lobby
		if (!name.equalsIgnoreCase("lobby") && clients.size() == 0) {
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
                        //Diceroll could only choose from 0 or 1. 0 is Heads and 1 is Tails
                        String rev;
                       
                        if(diceroll == 0) {
                           
                       
                            rev = "Heads";
                        }
                        else {
                            rev = "Tails";
                        }
                       
                        sendMessage(null,  client.getClientName() + " flipped a coin and got " + rev);
					
                        wasCommand = true;
                        break;
                        //out.writeObject(rev);
                    case "roll":
						Random rand1 = new Random();
						int upperlimit1 = 21;
				
						//You can roll a number between 0 and 20
						int roll = rand1.nextInt(upperlimit1);
					
					
					
                        String result1 = Integer.toString(roll);
                        sendMessage(null, "You can roll a number between 0 and 20. The Client: " + client.getClientName() + " got " + result1);
                        wasCommand = true;
                        break;
					default:
						wasCommand = false;
						break;
				}
				
   
   	  
	}	
	char symbol = '*'; //bold
	char symbol1 = '%'; //italics
	char symbol2 = '&'; //color
	char symbol3 = '@'; //underline
   
	if(message.charAt(0) == symbol && message.charAt(1) == symbol && message.charAt(message.length()-2) == symbol && message.charAt(message.length()-1) == symbol ) {
		String str = message.substring(2, message.length()-2);
		String str1 = "<b>" + str + "</b>";
		sendMessage(null, client.getClientName() + " - " + str1);
		wasCommand = true;
		if(message.charAt(2) == symbol1 && message.charAt(3) == symbol1 && message.charAt(message.length()-4) == symbol1 && message.charAt(message.length()-3) == symbol1 ) {
		String str2 = message.substring(4, message.length()-4);
		String str3 = "<b><i>" + str2 + "</i></b>";
		sendMessage(null, client.getClientName() + " - " + str3);
		wasCommand = true;

		}
		else if(message.charAt(2) == symbol2 && message.charAt(3) == symbol2 && message.charAt(message.length()-4) == symbol2 && message.charAt(message.length()-3) == symbol2 ) {
			String str2 = message.substring(4, message.length()-4);
			String str3 = "<b><font>" + str2 + "</font></b>";
			sendMessage(null, client.getClientName() + " - " + str3);
			wasCommand = true;
	
		}
		else if(message.charAt(2) == symbol3 && message.charAt(3) == symbol3 && message.charAt(message.length()-4) == symbol3 && message.charAt(message.length()-3) == symbol3 ) {
		String str2 = message.substring(4, message.length()-4);
		String str3 = "<b><u>" + str2 + "</u></b>";
		sendMessage(null, client.getClientName() + " - " + str3);
		wasCommand = true;

		}

	}

	if(message.charAt(0) == symbol1 && message.charAt(1) == symbol1 && message.charAt(message.length()-2) == symbol1 && message.charAt(message.length()-1) == symbol1 ) {
		String str = message.substring(2, message.length()-2);
		String str1 = "<i>" + str + "</i>";
		sendMessage(null, client.getClientName() + " - " + str1);
		wasCommand = true;
		if(message.charAt(2) == symbol && message.charAt(3) == symbol && message.charAt(message.length()-4) == symbol && message.charAt(message.length()-3) == symbol ) {
		String str2 = message.substring(4, message.length()-4);
		String str3 = "<i><b>" + str2 + "</b></i>";
		sendMessage(null, client.getClientName() + " - " + str3);
		wasCommand = true;

		}
		else if(message.charAt(2) == symbol2 && message.charAt(3) == symbol2 && message.charAt(message.length()-4) == symbol2 && message.charAt(message.length()-3) == symbol2 ) {
			String str2 = message.substring(4, message.length()-4);
			String str3 = "<i><font>" + str2 + "</font></i>";
			sendMessage(null, client.getClientName() + " - " + str3);
			wasCommand = true;
	
		}
		else if(message.charAt(2) == symbol3 && message.charAt(3) == symbol3 && message.charAt(message.length()-4) == symbol3 && message.charAt(message.length()-3) == symbol3 ) {
		String str2 = message.substring(4, message.length()-4);
		String str3 = "<i><u>" + str2 + "</u></i>";
		sendMessage(null, client.getClientName() + " - " + str3);
		wasCommand = true;

		}

	}
	if(message.charAt(0) == symbol2 && message.charAt(1) == symbol2 && message.charAt(message.length()-2) == symbol2 && message.charAt(message.length()-1) == symbol2 ) {
		String str = message.substring(2, message.length()-2);
		String str1 = "<font>" + str + "</font>";
		sendMessage(null, client.getClientName() + " - " + str1);
		wasCommand = true;
		if(message.charAt(2) == symbol1 && message.charAt(3) == symbol1 && message.charAt(message.length()-4) == symbol1 && message.charAt(message.length()-3) == symbol1 ) {
		String str2 = message.substring(4, message.length()-4);
		String str3 = "<font><i>" + str2 + "</i></font>";
		sendMessage(null, client.getClientName() + " - " + str3);
		wasCommand = true;

		}
		else if(message.charAt(2) == symbol && message.charAt(3) == symbol && message.charAt(message.length()-4) == symbol && message.charAt(message.length()-3) == symbol ) {
			String str2 = message.substring(4, message.length()-4);
			String str3 = "<font><b>" + str2 + "</b></font>";
			sendMessage(null, client.getClientName() + " - " + str3);
			wasCommand = true;
	
		}
		else if(message.charAt(2) == symbol3 && message.charAt(3) == symbol3 && message.charAt(message.length()-4) == symbol3 && message.charAt(message.length()-3) == symbol3 ) {
		String str2 = message.substring(4, message.length()-4);
		String str3 = "<font><u>" + str2 + "</u></font>";
		sendMessage(null, client.getClientName() + " - " + str3);
		wasCommand = true;

		}

	}
	if(message.charAt(0) == symbol3 && message.charAt(1) == symbol3 && message.charAt(message.length()-2) == symbol3 && message.charAt(message.length()-1) == symbol3 ) {
		String str = message.substring(2, message.length()-2);
		String str1 = "<u>" + str + "</u>";
		sendMessage(null, client.getClientName() + " - " + str1);
		wasCommand = true;
		if(message.charAt(2) == symbol1 && message.charAt(3) == symbol1 && message.charAt(message.length()-4) == symbol1 && message.charAt(message.length()-3) == symbol1 ) {
		String str2 = message.substring(4, message.length()-4);
		String str3 = "<u><i>" + str2 + "</i></u>";
		sendMessage(null, client.getClientName() + " - " + str3);
		wasCommand = true;

		}
		else if(message.charAt(2) == symbol2 && message.charAt(3) == symbol2 && message.charAt(message.length()-4) == symbol2 && message.charAt(message.length()-3) == symbol2 ) {
			String str2 = message.substring(4, message.length()-4);
			String str3 = "<u><font>" + str2 + "</font></u>";
			sendMessage(null, client.getClientName() + " - " + str3);
			wasCommand = true;
	
		}
		else if(message.charAt(2) == symbol && message.charAt(3) == symbol && message.charAt(message.length()-4) == symbol && message.charAt(message.length()-3) == symbol ) {
		String str2 = message.substring(4, message.length()-4);
		String str3 = "<u><b>" + str2 + "</b></u>";
		sendMessage(null, client.getClientName() + " - " + str3);
		wasCommand = true;

		}

	}
	
	  else {
	  
	  }	
      
   
		}
		catch(Exception e)  {
			e.printStackTrace();
		}
		return wasCommand;
	}

	// Command helper methods
	protected static void createRoom(String roomName, ServerThread client) {
		if (server.createNewRoom(roomName)) {
			server.joinRoom(roomName, client);
		} else {
			client.sendMessage("Server", String.format("Room %s already exists", roomName));
		}
	}

	protected static void joinRoom(String roomName, ServerThread client) {
		if (!server.joinRoom(roomName, client)) {
			client.sendMessage("Server", String.format("Room %s doesn't exist", roomName));
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
		
		String from = (sender == null ? "Room" : sender.getClientName());
		Iterator<ServerThread> iter = clients.iterator();
		while (iter.hasNext()) {
			ServerThread client = iter.next();
			boolean messageSent = client.sendMessage(from, message);
			if (!messageSent) {
				handleDisconnect(iter, client);
			}
		}
	}
	protected synchronized void sendConnectionStatus(ServerThread sender, boolean isConnected){
		Iterator<ServerThread> iter = clients.iterator();
		while (iter.hasNext()) {
			ServerThread client = iter.next();
			boolean messageSent = client.sendConnectionStatus(sender.getClientName(), isConnected);
			if (!messageSent) {
				handleDisconnect(iter, client);
			}
		}
	}
	private void handleDisconnect(Iterator<ServerThread> iter, ServerThread client){
		iter.remove();
		info("Removed client " + client.getId());
		checkClients();
		sendMessage(null, client.getId() + " disconnected");
	}
	public void close() {
		server.removeRoom(this);
		server = null;
		isRunning = false;
		clients = null;
	}
}