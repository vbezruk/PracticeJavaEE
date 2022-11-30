package org.example;

import java.io.*;
import java.net.Socket;

public class ConnectInputMessage implements Runnable {
    private Socket serverConnect;
    private InputStream inputStreamServer;

    public ConnectInputMessage() {
        try {
            serverConnect = new Socket("localhost", 8887);

            inputStreamServer = serverConnect.getInputStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public InputStream getInputStreamServer() {
        return inputStreamServer;
    }

    @Override
    public void run() {
        BufferedReader in = new BufferedReader(new InputStreamReader(inputStreamServer));
        String serverMessage;

        while (true) {
            try {
                serverMessage = in.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            if (serverMessage != null) {
                System.out.println(serverMessage);

                break;
            }
        }

        PrintWriter out = null;
        BufferedReader inputUser = new BufferedReader(new InputStreamReader(System.in));
        String userMessage = null;

        do {
            System.out.println("Enter message: ");

            try {
                userMessage = inputUser.readLine();

                out = new PrintWriter(serverConnect.getOutputStream(), true);

                out.println(userMessage);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } while (!"exit".equals(userMessage));
    }
}