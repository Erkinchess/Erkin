package com.company;

public class User {
    protected int id;
    protected String login;
    protected int password;
    protected String name;
    protected String surname;


    public User(int id, String login, int password, String name, String surname) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }

    public User() {
        this.id = 0;
        this.login = "no login";
        this.password = 0;
        this.name = "no name";
        this.surname = " no surname";
    }

    public void getData() {
        System.out.println("id" + id + "login" + login + "password" + password + "name" + name + "surname" + surname);
    }
}