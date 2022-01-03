package com.company;

public class Operation extends Thread {
    String operationName;
    int operationTime; //время операции в секундах

    public Operation(String operationName, int operationTime) {
        this.operationName = operationName;
        this.operationTime = operationTime;
    }

    public void run() {
        try {
              System.out.println("Operation Add Client to Bank: started");
            for (int i = 0; i < 2; i++) {
                System.out.println(operationName + " " + operationTime);
                Thread.sleep(1000);
            }
            System.out.println("Operation Add Client to Bank: finished");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}







