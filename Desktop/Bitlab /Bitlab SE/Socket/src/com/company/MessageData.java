package com.company;

import java.io.Serializable;
import java.util.Date;

public class MessageData implements Serializable {
    String userName;
    String messageText;
    Date sentDate;

    public MessageData(String userName, String messageText) {
        this.userName = userName;
        this.messageText = messageText;
        this.sentDate = new Date();
    }

    public MessageData() {
        this.userName = "no userName";
        this.messageText = " no userName";
    }

    @Override
    public String toString() {
        return userName + ": " + messageText + "| " + sentDate;
    }
}

