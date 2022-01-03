package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        while (true) {
            System.out.println("[1] ADD STUDENT:");
            System.out.println("[2] LIST STUDENTS:");
            System.out.println("[0] EXIT:");
            int choice = in.nextInt();
            if (choice == 1) {
                System.out.println("NAME:");
                String name = in.next();
                System.out.println("SURNAME:");
                String surname = in.next();

                Student new_student = new Student(name, surname); // создал нового студента


                ArrayList<Subject> new_subjects = new ArrayList<>(); // создал пустой список предметов
                while (true) {
                    System.out.println("[1] ADD SUBJECT:");
                    System.out.println("[0] MAIN MENU:");
                    int choice2 = in.nextInt();
                    if (choice2 == 1) {
                        System.out.println("NAME OF SUBJECT:");
                        String name_Of_Subject = in.next();
                        System.out.println("CREDITS:");
                        int credits = in.nextInt();
                        Subject new_subject = new Subject(credits, name_Of_Subject); // создал новый предмет
                        new_subjects.add(new_subject); // создал новый предмет и добавляется в список предметов
                    } else if (choice2 == 0) {
                        break;

                    } else {
                        System.out.println("wrong input!");

                    }
                }

                new_student.setSubjects(new_subjects); // присвоение нового предмета к новому студенту

                students = readStudents(); // считывание предыдущего списка студентов
                students.add(new_student);
                writeStudents(students); // запись студентов в файл уже с новым добавленным студентом

            } else if (choice == 2) {
                students = readStudents();
              for (int i=0; i< students.size(); i++){
                  System.out.println(students.get(i));
              }
                writeStudents(students);

            } else if (choice == 0) {
                System.exit(0);
            }
        }
    }

    public static void writeStudents(ArrayList<Student> students) {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("text.txt"));
            outputStream.writeObject(students);
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Student> readStudents() {
        ArrayList<Student> students = new ArrayList<>();
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("text.txt"));
            students = (ArrayList) inputStream.readObject();
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }
}

