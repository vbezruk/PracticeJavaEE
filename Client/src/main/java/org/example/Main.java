package org.example;

import javax.swing.plaf.TableHeaderUI;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ConnectInputMessage connectWithServer = new ConnectInputMessage();

        Thread threadConnectInputMessage = new Thread(connectWithServer);
        threadConnectInputMessage.start();

        ReceiveMessageFromServer receiveMessage = new ReceiveMessageFromServer(connectWithServer.getInputStreamServer());

        Thread threadReceiveMessage = new Thread(receiveMessage);
        threadReceiveMessage.start();
    }
}