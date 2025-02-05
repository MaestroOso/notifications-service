package org.example.notifications;

import org.example.model.NotificationInput;

public class PushNotification extends Notification{
    @Override
    public void sendNotification(NotificationInput notificationInput) {
        System.out.println(String.format("PushNotification %s", notificationInput.message()));
    }
}
