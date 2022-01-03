//package com.company;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class FirstPage extends Container {
//    private String[] faculty = {"", "Math", "Economics", "Business"};
//
//    public FirstPage() {
//        for (int i = 0; i < faculty.length; i++) {
//        }
//        setSize(500, 500);
//        setLayout(null);
//
//        JLabel labelName = new JLabel("NAME:");
//        labelName.setSize(300, 30);
//        labelName.setLocation(85, 120);
//        add(labelName);
//
//        JTextField fieldName = new JTextField();
//        fieldName.setSize(200, 30);
//        fieldName.setLocation(180, 120);
//        add(fieldName);
//
//        JLabel labelSurname = new JLabel("SURNAME:");
//        labelSurname.setSize(300, 30);
//        labelSurname.setLocation(85, 150);
//        add(labelSurname);
//
//        JTextField fieldSurname = new JTextField();
//        fieldSurname.setSize(200, 30);
//        fieldSurname.setLocation(180, 150);
//        add(fieldSurname);
//
//        JLabel labelFaculty = new JLabel("FACULTY:");
//        labelFaculty.setSize(300, 30);
//        labelFaculty.setLocation(85, 180);
//        add(labelFaculty);
//
//        JComboBox comboBox = new JComboBox(faculty);
//        comboBox.setSize(200, 30);
//        comboBox.setLocation(180, 180);
//        add(comboBox);
//
//        JLabel labelGroup = new JLabel("GROUP:");
//        labelGroup.setSize(300, 30);
//        labelGroup.setLocation(85, 210);
//        add(labelGroup);
//
//        JTextField fieldGroup = new JTextField();
//        fieldGroup.setSize(200, 30);
//        fieldGroup.setLocation(180, 210);
//        add(fieldGroup);
//
//        JButton button = new JButton("Add");
//        button.setSize(80, 30);
//        button.setLocation(180, 250);
//        add(button);
//
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                Student new_student = new Student();
//                new_student.setName(fieldName.getText());
//                new_student.setSurname(fieldSurname.getText());
//                new_student.setFaculty((String) comboBox.getSelectedItem());
//                new_student.setGroup(fieldGroup.getText());
//                fieldName.setText("");
//                fieldSurname.setText("");
//                comboBox.setSelectedIndex (0);
//                fieldGroup.setText("");
//                Main.frame.addStudent(new_student);
//            }
//        });
//        JButton back = new JButton("Back");
//        back.setSize(80, 30);
//        back.setLocation(270, 250);
//        add(back);
//        back.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                Main.frame.showMenu();
//            }
//        });
//    }
//}
//
//
