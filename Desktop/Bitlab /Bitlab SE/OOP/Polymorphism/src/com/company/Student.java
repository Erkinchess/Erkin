package com.company;

import java.util.Arrays;

public class Student extends User {
    private double gpa;
    private String [] courses = new String[100];
    private int indexOfCourses = 0;

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public int getIndexOfCourses() {
        return indexOfCourses;
    }

    public void setIndexOfCourses(int indexOfCourses) {
        this.indexOfCourses = indexOfCourses;
    }
    public void getData(){
        System.out.println("id" + id + "login" + login + "password" + password + "name" + name + "surname" + surname+"gpa"+gpa+"courses"+ Arrays.toString(courses) +"indexOfCourses"+indexOfCourses);

    }
}
