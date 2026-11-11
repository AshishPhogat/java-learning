package com.ashish.lld.factory.notification;

public class EmailNotificationCreator extends NotificationCreator {
    
    @Override 
    public Notification createNotification(){
        return new EmailNotification();
    }
}
