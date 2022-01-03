package com.company;

import java.util.Arrays;

public class Staff extends User {
    private double salary;
    private String[] subjects = new String[100];
    private int indexOfSubject = 0;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public int getIndexOfSubject() {
        return indexOfSubject;
    }

    public void setIndexOfSubject(int indexOfSubject) {
        this.indexOfSubject = indexOfSubject;
    }

    public void getData() {
        System.out.println("id" + id + "login" + login + "password" + password + "name" + name + "surname" + surname+"salary"+salary+"subjects"+ Arrays.toString(subjects) +"indexOfSubject"+indexOfSubject);
    }
}
