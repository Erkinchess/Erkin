package com.company;

// === ClientHandler === //

import java.io.ObjectInputStream;
import java.net.Socket;

public class ClientHandler extends Thread {
    Socket socket;
    int id;

    public ClientHandler(Socket socket, int id) {
        this.socket = socket;
        this.id = id;
    }

    public void run() {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            String text = "";
            while ((text = (String) inputStream.readObject()) != null) {
                System.out.println(text);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
