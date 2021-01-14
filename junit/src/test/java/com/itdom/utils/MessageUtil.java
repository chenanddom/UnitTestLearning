package com.itdom.utils;

public class MessageUtil {

    private String message;

    //@param message to be printed
    public MessageUtil(String message){
        this.message = message;
    }

    public String printMessage(){
        System.out.println(message);
        return message;
    }
}