//package com.company;
//
//// === MainFrame === //
//
//import javax.swing.*;
//
//public class MainFrame extends JFrame {
//    protected MainMenu menu;
//    protected FirstPage first;
//    protected SecondPage second;
//    Student[] students = new Student[10];
//    int index = 0;
//
//    public MainFrame() {
//        setSize(500, 500);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setTitle("App");
//        setLayout(null);
//
//        menu = new MainMenu();
//        menu.setVisible(true);
//        add(menu);
//
//        first = new FirstPage();
//        first.setVisible(false);
//        add(first);
//
//        second = new SecondPage();
//        second.setVisible(false);
//        add(second);
//    }
//
//    public void showFirst() {
//        menu.setVisible(false);
//        second.setVisible(false);
//        first.setVisible(true);
//    }
//
//    public void showSecond() {
//        menu.setVisible(false);
//        first.setVisible(false);
//        second.setVisible(true);
//    }
//
//    public void showMenu() {
//        menu.setVisible(true);
//        first.setVisible(false);
//        second.setVisible(false);
//    }
//
//    public Student[] getStudent() {
//        return students;
//    }
//
//
//    public void addStudent(Student s) {
//        students[index] = s;
//        index++;
//    }
//}