package com.ashish.lld.factory.notification;

public abstract class NotificationCreator {
    public abstract Notification createNotification();

    public void send(String message){
        Notification notification = createNotification();
        notification.send(message);
    }
}
