package com.company;

// === ClientHandler === //

import javax.swing.*;

public class MainFrame extends JFrame {
    ConnectionPage CP;
    MessagePage MP;

    public MainFrame() {
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Client-server application");
        setLayout(null);

        CP = new ConnectionPage(this);
        CP.setVisible(true);
        add(CP);

        MP = new MessagePage(this);
        MP.setVisible(false);
        add(MP);
    }
}

