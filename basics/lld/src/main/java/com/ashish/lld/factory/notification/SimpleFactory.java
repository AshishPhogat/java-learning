package com.ashish.lld.factory.notification;

public class SimpleFactory {
    
    public static Notification createNotification(String type){
        switch(type){
            case "SMS":
                return new SMSNotification();
            case "EMAIL":
                return new EmailNotification();
            default:
                throw new IllegalArgumentException("Unknown notification type");
        }
    }
}
