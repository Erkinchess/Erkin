//package com.company;
//
//import javax.swing.*;
//import javax.swing.table.DefaultTableModel;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class SecondPage extends Container {
//    JTable table;
//    String []Head = {"id", "name", "surname", "faculty", "group"};
//
//        public SecondPage() {
//        setSize(500, 500);
//        setLayout(null);
//
//
//        JLabel labelList = new JLabel("LIST STUDENT:");
//        labelList.setSize(300, 30);
//        labelList.setLocation(100, 100);
//        add(labelList);
//
//
//
//        JButton back = new JButton("Back");
//        back.setSize(300, 30);
//        back.setLocation(100, 150);
//        add(back);
//        back.addActionListener(new ActionListener() {
//
//       public void actionPerformed(ActionEvent e) {
//                Main.frame.showMenu();
//            }
//        });
//        table = new JTable();
//        table.setFont(new Font("Calibri", Font.PLAIN, 12));
//        table.setRowHeight(30);
//
//        JScrollPane scrollPane = new JScrollPane(table);
//        scrollPane.setSize(300, 200);
//        scrollPane.setLocation(100, 200);
//        add(scrollPane);
//    }
//
//    public void generateTable(Student[] students) {
//        Object data[][] = new Object[students.length][100];
//
//        for (int i = 0; i < students.length; i++) {
//            if (students[i] != null) {
//                data[i][0] = students[i].getId();
//                data[i][1] = students[i].getName();
//                data[i][2] = students[i].getSurname();
//                data[i][3] = students[i].getFaculty();
//                data[i][4] = students[i].getGroup();
//            }
//            DefaultTableModel model = new DefaultTableModel(data, Head);
//            table.setModel(model);
//        }
//    }
//}
