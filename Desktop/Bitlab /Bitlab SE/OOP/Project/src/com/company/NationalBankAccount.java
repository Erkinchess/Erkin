package com.company;

public class NationalBankAccount implements BankAccount {
    String fullName;
    int balance;
    String accountNumber;
    String pinCode;


    public String getAccountNumber() {
        return accountNumber;
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
        this.balance = balance - credit ;
    }

    public void addBalance(int add) {
        this.balance = balance + add;
    }

    public String accountData() {
        return fullName + " " + balance + " " + accountNumber + " " + pinCode;
    }

    public NationalBankAccount(String fullName, int balance, String accountNumber, String pinCode) {
        this.fullName = fullName;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }

    public NationalBankAccount() {
        this.fullName = "no fullName";
        this.balance = 0;
        this.accountNumber = "accountNumber";
        this.pinCode = "pinCode";
    }

    public String getFullName() {
        return fullName;
    }
}
