package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Account> a2 = new ArrayList<>();
        Account a1 = new Account(1, "name", "surname", 2300);
        BankApplication b1 = new BankApplication("bankApplication", a2);
        b1.addAccount(a1);
    }
}


