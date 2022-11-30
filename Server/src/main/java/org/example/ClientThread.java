package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.Buffer;

public class ClientThread implements Runnable {
    private Socket clientSocket;
    private ChatServer chatServer;
    private int numberClient;

    public ClientThread(Socket clientSocket, ChatServer chatServer, int numberClient) {
        this.clientSocket = clientSocket;
        this.chatServer = chatServer;
        this.numberClient = numberClient;
    }

    @Override
    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));;

            System.out.printf("Client %d is connected!\n", numberClient);


            new PrintWriter(clientSocket.getOutputStream(), true).printf("Client %d\n", numberClient);


            String clientMessage = null;

            while (true) {
                clientMessage = in.readLine();

                if (!"exit".equals(clientMessage)) {
                    System.out.printf("Client %d: %s\n", numberClient, clientMessage);

                    chatServer.sendMessageForAllClient(numberClient, clientMessage);
                } else {
                    in.close();
                    clientSocket.close();
                    break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
