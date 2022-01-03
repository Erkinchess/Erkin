package com.company;

public class Main {
    public static void main(String[] args) {
        Operation operation1 = new Operation("Add Client to Bank:", 1);
        Operation operation2 = new Operation("Add Client to Bank:", 2);
        Operation operation3 = new Operation("Add Client to Bank:", 3);
        Operation operation4 = new Operation("Add Client to Bank:", 4);
        Operation operation5 = new Operation("Add Client to Bank:", 5);

        operation1.start();
        operation2.start();
        operation3.start();
        operation4.start();
        operation5.start();
    }
}
