package org.example;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.TreeMap;

public class ChatServer implements Runnable {
    private Map<Integer, Socket> mapClient = new TreeMap<Integer, Socket>();

    public void sendMessageForAllClient(int numberClient, String clientMessage) {
        for (Integer i : mapClient.keySet()) {
            if (i == numberClient) {
                continue;
            }

            System.out.printf("Sending message to client %d\n", i);

            BufferedWriter outputUser = null;

            try {
                outputUser = new BufferedWriter(new OutputStreamWriter(mapClient.get(i).getOutputStream()));
                outputUser.write(String.format("Client %d: %s\nInput message:", numberClient, clientMessage));
                outputUser.flush();
                outputUser.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void run() {

        ServerSocket server = null;
        try {
            server = new ServerSocket(8887);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Server started!");

        int numberClient = 1;

        Socket client = null;

        while (true) {
            try {
                client = server.accept();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            Thread clientThread = new Thread(new ClientThread(client, this, numberClient));
            clientThread.setDaemon(true);
            clientThread.start();
            mapClient.put(numberClient, client);
            numberClient++;
        }
    }
}
