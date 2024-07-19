package Project.server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

import Project.common.Payload;
import Project.common.PayloadType;
import Project.common.RoomResultPayload;
import Project.common.ClientPayload;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;  

/**
 * A server-side representation of a single client
 */
public class ServerThread extends Thread {
    private Socket client;
    private String clientName;
    private boolean isRunning = false;
    private ObjectOutputStream out;// exposed here for send()
    // private Server server;// ref to our server so we can call methods on it
    
    // more easily
    private Room currentRoom;
    private static Logger logger = Logger.getLogger(ServerThread.class.getName());
    private long myId;
    private String formattedName;
    private boolean fullAge;
    ArrayList<String> mute = new ArrayList<String>();

    public void setClientId(long id) {
        myId = id;
    }

    public long getClientId() {
        return myId;
    }

    public boolean isRunning() {
        return isRunning;
    }
    public void setFormattedName(String name) {
        formattedName = name;
    }

    public String getFormattedName() {
        return formattedName;
    }

    protected void setAddList(String name) {
        mute.add(name);
    }
   
    //returns clients list
    protected String getSize() {
        String s = String.valueOf(mute.size());
        return s;
    }

 
    //removes list from client
    protected void setRemoveList(String name) {
        mute.remove(name);
    }

    //checks if cllient is muted with sender
    protected synchronized boolean isMuted(String str2) {
        // String findUser;
        // boolean yes = false;
        if (mute.size() == 0) {
            fullAge = false;
        }
 
        else if (mute.size() > 0) {
            fullAge = false;
            for (String mutes : mute) {
 
                String findUser = mutes;
                if (findUser.equals(str2)) {
                    fullAge = true;
                }
 
            }
        }
 
        return fullAge;
        // fullAge = false;
    }
 
    
    protected synchronized void writeLog2(String client) {
 
        String filename = client + ".txt";
 
     
        File New_File = new File(filename);
 
        // mute is the name for my arraylist
        StringBuilder str = new StringBuilder();
 
        for (String mutes : mute) {
            str.append(mutes + "\n");
        }
        String mutedFile = str.toString();
 
        try {
            FileWriter Overwritten_File = new FileWriter(New_File, false);
            Overwritten_File.write(mutedFile);
 
            Overwritten_File.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    
    
   
   

    private void info(String message) {
        System.out.println(String.format("Thread[%s]: %s", getId(), message));
    }

    public ServerThread(Socket myClient, Room room) {
        info("Thread created");
        // get communication channels to single client
        this.client = myClient;
        this.currentRoom = room;

    }

    protected void setClientName(String name) {
        if (name == null || name.isBlank()) {
            System.err.println("Invalid client name being set");
            return;
        }
        clientName = name;
    }

    protected String getClientName() {
        return clientName;
    }

    protected synchronized Room getCurrentRoom() {
        return currentRoom;
    }



    protected synchronized void setCurrentRoom(Room room) {
        if (room != null) {
            currentRoom = room;
        } else {
            info("Passed in room was null, this shouldn't happen");
        }
    }

    public void disconnect() {
        sendConnectionStatus(myId, getClientName(), false);
        info("Thread being disconnected by server");
        isRunning = false;
        cleanup();
    }

    // send methods
    public boolean sendRoomName(String name) {
        Payload p = new Payload();
        p.setPayloadType(PayloadType.JOIN_ROOM);
        p.setMessage(name);
        return send(p);
    }

    public boolean sendRoomsList(String[] rooms, String message) {
        RoomResultPayload payload = new RoomResultPayload();
        payload.setRooms(rooms);
        //Fixed in Module7.Part9
        if(message != null){
            payload.setMessage(message);
        }
        return send(payload);
    }

    public boolean sendExistingClient(long clientId, String clientName) {
        Payload p = new Payload();
        p.setPayloadType(PayloadType.SYNC_CLIENT);
        p.setClientId(clientId);
        p.setClientName(clientName);
        return send(p);
    }

    public boolean sendResetUserList() {
        Payload p = new Payload();
        p.setPayloadType(PayloadType.RESET_USER_LIST);
        return send(p);
    }

    public boolean sendClientId(long id) {
        Payload p = new Payload();
        p.setPayloadType(PayloadType.CLIENT_ID);
        p.setClientId(id);
        return send(p);
    }

    public boolean sendExistingClient(long clientId, String clientName, String formattedName) {
        ClientPayload p = new ClientPayload();
        p.setPayloadType(PayloadType.SYNC_CLIENT);
        p.setClientId(clientId);
        p.setFormattedName(formattedName);
        p.setClientName(clientName);
        return send(p);
    }

    public boolean sendConnectionStatus(long clientId, String who, String formattedName, boolean isConnected) {
        ClientPayload p = new ClientPayload();
        p.setPayloadType(isConnected ? PayloadType.CONNECT : PayloadType.DISCONNECT);
        p.setClientId(clientId);
        p.setFormattedName(formattedName);
        p.setClientName(who);
        p.setMessage(isConnected ? "connected" : "disconnected");
        return send(p);
    }


    public boolean sendMessage(long clientId, String message) {
        Payload p = new Payload();
        p.setPayloadType(PayloadType.MESSAGE);
        p.setClientId(clientId);
        p.setMessage(message);
        return send(p);
    }

    public boolean sendConnectionStatus(long clientId, String who, boolean isConnected) {
        Payload p = new Payload();
        p.setPayloadType(isConnected ? PayloadType.CONNECT : PayloadType.DISCONNECT);
        p.setClientId(clientId);
        p.setClientName(who);
        p.setMessage(isConnected ? "connected" : "disconnected");
        return send(p);
    }

    private boolean send(Payload payload) {
        // added a boolean so we can see if the send was successful
        try {
            // TODO add logger
            logger.log(Level.FINE, "Outgoing payload: " + payload);
            out.writeObject(payload);
            logger.log(Level.INFO, "Sent payload: " + payload);
            return true;
        } catch (IOException e) {
            info("Error sending message to client (most likely disconnected)");
            // comment this out to inspect the stack trace
            // e.printStackTrace();
            cleanup();
            return false;
        } catch (NullPointerException ne) {
            info("Message was attempted to be sent before outbound stream was opened: " + payload);
            return true;// true since it's likely pending being opened
        }
    }

    // end send methods
    @Override
    public void run() {
        info("Thread starting");
        try (ObjectOutputStream out = new ObjectOutputStream(client.getOutputStream());
                ObjectInputStream in = new ObjectInputStream(client.getInputStream());) {
            this.out = out;
            isRunning = true;
            Payload fromClient;
            while (isRunning && // flag to let us easily control the loop
                    (fromClient = (Payload) in.readObject()) != null // reads an object from inputStream (null would
                                                                     // likely mean a disconnect)
            ) {

                info("Received from client: " + fromClient);
                processPayload(fromClient);

            } // close while loop
        } catch (Exception e) {
            // happens when client disconnects
            e.printStackTrace();
            info("Client disconnected");
        } finally {
            isRunning = false;
            info("Exited thread loop. Cleaning up connection");
            cleanup();
        }
    }

    void processPayload(Payload p) {
        switch (p.getPayloadType()) {
            case CONNECT:
                setClientName(p.getClientName());
                break;
            case DISCONNECT:
                Room.disconnectClient(this, getCurrentRoom());
                break;
            case MESSAGE:
                if (currentRoom != null) {
                    currentRoom.sendMessage(this, p.getMessage());
                } else {
                    // TODO migrate to lobby
                    logger.log(Level.INFO, "Migrating to lobby on message with null room");
                    Room.joinRoom("lobby", this);
                }
                break;
            case GET_ROOMS:
                Room.getRooms(p.getMessage().trim(), this);
                break;
            case CREATE_ROOM:
                Room.createRoom(p.getMessage().trim(), this);
                break;
            case JOIN_ROOM:
                Room.joinRoom(p.getMessage().trim(), this);
                break;
            default:
                break;

        }

    }

    private void cleanup() {
        info("Thread cleanup() start");
        try {
            client.close();
        } catch (IOException e) {
            info("Client already closed");
        }
        info("Thread cleanup() complete");
    }
}