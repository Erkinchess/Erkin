package com.company;

import java.io.Serializable;

public class Subject implements Serializable {
    private String name;
    private int credits;

    public Subject() {
    }

    public Subject(int credits, String name) {
        this.name = name;
        this.credits = credits;

    }

    public String getSurname() {
        return name;
    }

    public void setSurname(String surname) {
        this.name = surname;
    }

    public int id() {
        return credits;
    }

    public void setName(int name) {
        this.credits = name;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", credits=" + credits +
                '}';
    }
}

