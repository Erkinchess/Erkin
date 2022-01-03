package com.company;

// === MessagePage === //

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectOutputStream;

public class MessagePage extends JPanel {
    MainFrame parent;
    String message;
    ObjectOutputStream objectOutputStream;

    public MessagePage(MainFrame parent) {
        this.parent = parent;
        setSize(500, 500);
        setLayout(null);

        JLabel label = new JLabel("Send message to Server:");
        label.setSize(200, 30);
        label.setLocation(170, 80);
        add(label);

        JTextField textMessage = new JTextField();
        textMessage.setSize(200, 30);
        textMessage.setLocation(155, 120);
        add(textMessage);

        JButton c_button = new JButton("Send");
        c_button.setSize(90, 30);
        c_button.setLocation(165, 160);
        add(c_button);

        c_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    message = textMessage.getText();
                    objectOutputStream.writeObject(message);
                    textMessage.setText("");
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });

        JButton e_button = new JButton("Exit");
        e_button.setSize(90, 30);
        e_button.setLocation(250, 160);
        add(e_button);
        e_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}