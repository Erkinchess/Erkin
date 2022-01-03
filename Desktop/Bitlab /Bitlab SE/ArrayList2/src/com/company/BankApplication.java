package com.company;

import java.util.ArrayList;

public class BankApplication {
    String name;
    ArrayList<Account> accounts = new ArrayList();

    public BankApplication() {
        this.name = "no name";
        this.accounts = null;
    }

    public BankApplication(String name, ArrayList<Account> accounts) {
        this.name = name;
        this.accounts = accounts;
    }

    public void addAccount(Account a) {
        accounts.add(a);
    }

    public void removeAccount(int i) {
        accounts.remove(i);
    }

    public Account getMaxAccount() {
        Account maxBalanceAccount = new Account();
        double maxBalance = 0;
        for (int i = 0; i < accounts.size(); i++) {
            if (maxBalance < accounts.get(i).getBalance()) ;
            maxBalance = accounts.get(i).getBalance();
            maxBalanceAccount = accounts.get(i);
        }
        return maxBalanceAccount;
    }

    public double getAverageBalance() {
        double sum = 0;
        double avg = 0;
        for (int i = 0; i < accounts.size(); i++) {
            sum += accounts.get(i).getBalance();
            avg = sum / accounts.size();
        }
        return avg;
    }

    public double getTotalBalance() {
        double sum = 0;
        for (int i = 0; i < accounts.size(); i++) {
            sum = sum + accounts.get(i).getBalance();
        }
        return sum;
    }

    public int totalAccounts() {
        return accounts.size();
    }

    public String getBankData() {
        return "name" + name + "accounts" + accounts;
    }
}


