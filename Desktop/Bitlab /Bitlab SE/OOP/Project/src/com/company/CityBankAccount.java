package com.company;

public class CityBankAccount implements BankAccount {
    String name;
    String surname;
    int balance;
    String accountNumber;
    String pinCode;


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public int totalBalance() {
        return balance;
    }

    public void creditBalance(int credit) {
        this.balance = balance - credit;
    }

    public void addBalance(int add) {
        this.balance = balance + add;
    }

    public String accountData() {
        return name + " " + surname + " " + balance + " " + accountNumber + " " + pinCode;
    }

    public CityBankAccount() {
        this.name = "no name";
        this.surname = " no surname";
        this.balance = 0;
        this.accountNumber = " no accountNumber";
        this.pinCode = "no pinCode";
    }


    public CityBankAccount(String name, String surname, int balance, String accountNumber, String pinCode) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }
}