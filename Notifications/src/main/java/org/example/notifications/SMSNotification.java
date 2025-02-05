package org.example.notifications;

import org.example.model.NotificationInput;

public class SMSNotification extends Notification{
    @Override
    public void sendNotification(NotificationInput notificationInput) {
        System.out.println(String.format("SMSNotification %s", notificationInput.message()));
    }
}
