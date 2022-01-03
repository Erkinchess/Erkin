package com.company;

// === ConnectionPage === //

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ConnectionPage extends JPanel {
    MainFrame parent;
    JLabel labelIP;
    JTextField textIP;
    JLabel labelPORT;
    JTextField textPORT;
    JButton button;
    Socket socket;
    String localhostfield;
    String portfield;

    public ConnectionPage(MainFrame parent) {
        this.parent = parent;
        setSize(500, 500);
        setLayout(null);

        labelIP = new JLabel("IP:");
        labelIP.setSize(200, 30);
        labelIP.setLocation(90, 100);
        add(labelIP);

        textIP = new JTextField();
        textIP.setSize(200, 30);
        textIP.setLocation(155, 100);
        add(textIP);

        labelPORT = new JLabel("PORT:");
        labelPORT.setSize(200, 30);
        labelPORT.setLocation(90, 150);
        add(labelPORT);

        textPORT = new JTextField();
        textPORT.setSize(200, 30);
        textPORT.setLocation(155, 150);
        add(textPORT);

        button = new JButton("CONNECT");
        button.setSize(150, 30);
        button.setLocation(172, 200);
        add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                localhostfield = textIP.getText();
                portfield = textPORT.getText();
                try {
                    socket = new Socket(localhostfield, Integer.parseInt(portfield));
                    parent.MP.objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                }catch (Exception e1){
                    e1.printStackTrace();
                }
                parent.CP.setVisible(false);
                parent.MP.setVisible(true);
            }
        });
    }
}