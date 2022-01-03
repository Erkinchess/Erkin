package com.company;

// === Main.java === //

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Connection cn;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Students> listStudents = new ArrayList<>();
        ConnectToDb();
        while (true) {
            System.out.println("PRESS [1] TO ADD STUDENT\nPRESS [2] TO LIST STUDENTS\nPRESS [3] TO DELETE STUDENT\nPRESS [0] TO EXIT");
            int choice = in.nextInt();
            if (choice == 1) {
                System.out.println("Insert name:");
                String name = in.next();
                System.out.println("Insert surname:");
                String surname = in.next();
                System.out.println("Insert age:");
                int age = in.nextInt();
                Students new_student = new Students(null,name,surname,age);
                addStudent(new_student);
            } else if (choice == 2) {
                listStudents = getAllStudents();
                for (Students i : listStudents) {
                    System.out.println(i);
                }
            } else if (choice == 3) {
                System.out.println("Insert id:");
                int id = in.nextInt();
                deleteStudent(id);
            } else if (choice == 0) {
                System.exit(0);
            }
        }
    }

    public static void ConnectToDb() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC?useUnicode=true&serverTimezone=UTC", "root", "");
            System.out.println("Connected");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Students> getAllStudents() {
        ArrayList<Students> allStudents = new ArrayList<>();
        try {
            PreparedStatement ps = cn.prepareStatement("select * from Students");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Long id = rs.getLong("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                int age = rs.getInt("age");
                allStudents.add(new Students(null,name,surname,age));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return allStudents;
    }

    public static void addStudent(Students i) {
        try {
            PreparedStatement ps = cn.prepareStatement("insert into Students(name,surname,age) value (?,?,?)");
            ps.setString(1, i.getName());
            ps.setString(2, i.getSurname());
            ps.setInt(3, (int) i.getAge());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteStudent(int id) {
        try {
            PreparedStatement ps = cn.prepareStatement("DELETE FROM Students where id=?");
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


