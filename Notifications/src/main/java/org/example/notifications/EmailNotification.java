package org.example.notifications;

import org.example.model.NotificationInput;

public class EmailNotification extends Notification {

    @Override
    public void sendNotification(NotificationInput notificationInput) {
        System.out.println(String.format("EmailNotification %s", notificationInput.message()));
    }

}