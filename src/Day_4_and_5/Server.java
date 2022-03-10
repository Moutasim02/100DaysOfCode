package Day_4_and_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server implements Runnable {
    private ArrayList<ConnectionHandler> connections;
    private ServerSocket server;
    private boolean done;
    private ExecutorService pool; //To make the thread pool

    public Server() {
        connections = new ArrayList<>();
        done = false;
    }

    //override the run method in Runnable interface
    @Override
    public void run() {
        try {
            //server that listens to port 9999
            server = new ServerSocket(9999);
            pool = Executors.newCachedThreadPool();
            while (!done) {
                Socket client = server.accept();
                //when we connect to new client...
                ConnectionHandler handler = new ConnectionHandler(client);
                connections.add(handler); // add to the arraylist
                pool.execute(handler);
            }
        } catch (Exception e) {
            shutdown();
        }
    }

    // broadcast message to multiple clients...
    public void broadcast(String message) {
        for (ConnectionHandler ch : connections) {
            if (ch != null) {
                ch.sendMessage(message);
            } else {
                System.out.println("Message is null");
            }
        }
    }

    // shutdown : quit the messaging room
    public void shutdown() {
        try {
            done = true;
            if (!server.isClosed()) {
                server.close();
            }
            for (ConnectionHandler ch : connections) {
                ch.shutdown();
            }
        } catch (IOException e) {
            //ignore
        }
    }

    //handle individual client connections
    class ConnectionHandler implements Runnable {
        private Socket client;
        private BufferedReader in;
        private PrintWriter out;
        private String nickname;

        public ConnectionHandler(Socket client) {
            this.client = client;
        }

        @Override
        public void run() {
            try {
                out = new PrintWriter(client.getOutputStream(), true);
                in = new BufferedReader(new InputStreamReader(client.getInputStream()));
                out.println("please enter a nickname: ");
                nickname = in.readLine();
                System.out.println(nickname + "connected"); //shows who have connected recently
                broadcast(nickname + "joined the chat!");
                String message;
                while ((message = in.readLine()) != null) {
                    if (message.startsWith("/moutasim")) {
                        String[] messageSplit = message.split(" ", 2);
                        if (messageSplit.length == 2) {
                            System.out.println(nickname + " renamed themselves to " + messageSplit[1]);
                            nickname = messageSplit[1];
                            out.println("Successfully changed nickname to: " + nickname);
                        } else {
                            out.println("no nickname provided");
                        }
                    } else if (message.startsWith("/quit")) {
                        broadcast(nickname + "left the chat");
                        shutdown();
                    } else {
                        broadcast(nickname + ": " + message);
                    }
                }
            } catch (IOException e) {
                shutdown();
            }
        }

        // shutdown : quit the messaging room
        public void shutdown() {
            try {
                in.close();
                out.close();
                if (!client.isClosed()) {
                    client.close();
                }
            } catch (IOException e) {
                //ignore
            }
        }

        //Send message...
        public void sendMessage(String message) {
            out.println(message);
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.run();
    }
}
