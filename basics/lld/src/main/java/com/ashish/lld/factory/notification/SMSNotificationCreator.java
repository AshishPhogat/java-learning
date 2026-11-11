package com.ashish.lld.factory.notification;

public class SMSNotificationCreator extends NotificationCreator {
    
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
    
}
