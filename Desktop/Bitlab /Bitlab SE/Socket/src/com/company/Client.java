package com.company;

import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert your name:");
        String n = in.next();
        try {
            Socket socket = new Socket("127.0.0.1", 6969);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            while (true) {
                MessageData md = new MessageData();
                System.out.println("[1] SEND MESSAGE:");
                System.out.println("[2] EXIT: ");
                int choice = in.nextInt();
                if (choice == (1)) {
                    System.out.println("Insert message text:");
                    String m = in.next();
                    md.messageText = m;
                    md.userName = n;
                    md.sentDate = new Date();
                    outputStream.writeObject(md);
                } else if (choice == (2)) {
                    System.exit(0);

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
