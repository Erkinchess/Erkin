package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        System.out.println(" +  -  * / ");
        String choice = in.next();
        if (choice.equals("+")) {
            getSum(a, b);
        } else if (choice.equals("-")) {
            getMin(a, b);
        } else if (choice.equals("*")) {
            getMulti(a,b)
        } else if (choice.equals("/")) {
            grt
        }

        public static void getSum ( double a, double b){
            System.out.println(a + b);
        }

        public static void getMin ( double a, double b){
            System.out.println(a - b);
        }

        public static double getMulti ( double a, double b){
            return a * b;
        }

        public static double getDiv ( double a, double b){
            return a / b;
        }
    }
