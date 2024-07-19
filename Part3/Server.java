package Part3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Server {
    int port = 3001;
    // connected clients
    private List<ServerThread> clients = new ArrayList<ServerThread>();

    private void start(int port) {
        this.port = port;
        // server listening
        try (ServerSocket serverSocket = new ServerSocket(port);) {
            Socket incoming_client = null;
            System.out.println("Server is listening on port " + port);
            do {
                System.out.println("waiting for next client");
                if (incoming_client != null) {
                    System.out.println("Client connected");
                    ServerThread sClient = new ServerThread(incoming_client, this);
                    
                    clients.add(sClient);
                    sClient.start();
                    incoming_client = null;
                    
                }
            } while ((incoming_client = serverSocket.accept()) != null);
        } catch (IOException e) {
            System.err.println("Error accepting connection");
            e.printStackTrace();
        } finally {
            System.out.println("closing server socket");
        }
    }
    protected synchronized void disconnect(ServerThread client) {
		long id = client.getId();
        client.disconnect();
		broadcast("Disconnected", id);
	}
    
    protected synchronized void broadcast(String message, long id) {
        if(processCommand(message, id)){

            return;
        }
        // let's temporarily use the thread id as the client identifier to
        // show in all client's chat. This isn't good practice since it's subject to
        // change as clients connect/disconnect
        message = String.format("User[%d]: %s", id, message);
        // end temp identifier
        
        // loop over clients and send out the message
        Iterator<ServerThread> it = clients.iterator();
        while (it.hasNext()) {
            ServerThread client = it.next();
            boolean wasSuccessful = client.send(message);
            if (!wasSuccessful) {
                System.out.println(String.format("Removing disconnected client[%s] from list", client.getId()));
                it.remove();
                broadcast("Disconnected", id);
            }
        }
    }

    private boolean processCommand(String message, long clientId){
        System.out.println("Checking command: " + message);
        if(message.equalsIgnoreCase("disconnect")){
            Iterator<ServerThread> it = clients.iterator();
            while (it.hasNext()) {
                ServerThread client = it.next();
                if(client.getId() == clientId){
                    it.remove();
                    disconnect(client);
                    
                    break;
                }
            }
            return true;
        }
        else if(message.equalsIgnoreCase("rolldice")) {
            System.out.println("From Client: " + message);
            
            
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

            
            System.out.println("To client: " + rev);
            //out.writeObject(rev);
            broadcast(rev, clientId);
            //out.writeObject(rev);
        }
        
        else if(message.startsWith("roll")){
            System.out.println("From Client: " + message);
            StringBuilder sb = new StringBuilder(message.replace("roll ", ""));
            String rev1 = sb.toString();
          
        
            int char1 = rev1.indexOf("d");
            String rev2 = rev1.substring(char1+1);
            String rev3 = rev1.substring(0, char1);
            //The number of dice they want
            int firstnum = Integer.parseInt(rev2);
            //The number of sides of a dice the user wants. Doesnt have to be just 6
            int secondnum = Integer.parseInt(rev3);
            Random rand1 = new Random();
            int equation = firstnum * secondnum;
            
            //For example 2d6, the result function would generate a number between 2 and 12. 
            int result = rand1.nextInt(equation - firstnum) + firstnum;
            String result1 = Integer.toString(result);
           
            broadcast(result1, clientId);
            
        }
            
        else {
            System.out.println("From client: " + message);
            //out.println(message);
        }

        return false;
    }
    public static void main(String[] args) {
        System.out.println("Starting Server");
        Server server = new Server();
        int port = 3000;
        try {
            port = Integer.parseInt(args[0]);
        } catch (Exception e) {
            // can ignore, will either be index out of bounds or type mismatch
            // will default to the defined value prior to the try/catch
        }
        server.start(port);
        System.out.println("Server Stopped");
    }
}