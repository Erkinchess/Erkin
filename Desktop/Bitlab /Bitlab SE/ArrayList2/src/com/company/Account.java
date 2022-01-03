package com.company;

public class Account {
    int id;
    String name;
    String surname;
    double balance;

    public Account() {
        this.id = 0;
        this.name = "no name";
        this.surname = "no surname";
        this.balance = 0.0;
    }

    public Account(int id, String name, String surname, double balance) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    String getBankData() {
        return "id" + id + "name" + name + "surname" + surname + "balance " + balance;
    }
}