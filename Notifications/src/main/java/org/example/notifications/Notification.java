package org.example.notifications;

import org.example.model.NotificationInput;

public abstract class Notification {

    public abstract void sendNotification(NotificationInput notificationInput);

}