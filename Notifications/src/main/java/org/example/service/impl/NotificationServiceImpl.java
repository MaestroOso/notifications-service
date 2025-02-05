package org.example.service.impl;

import org.example.enumeration.NotificationType;
import org.example.notifications.NotificationFactory;
import org.example.model.NotificationInput;
import org.example.notifications.Notification;
import org.example.service.NotificationService;

public class NotificationServiceImpl implements NotificationService {

    private final NotificationFactory notificationFactory;

    public NotificationServiceImpl(){
        notificationFactory = new NotificationFactory();
    }

    @Override
    public void sendNotification(NotificationType type, NotificationInput message) {
        Notification notification = notificationFactory.getNotification(type);
        notification.sendNotification(message);
    }
}
