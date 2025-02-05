package org.example;

import org.example.enumeration.NotificationType;
import org.example.model.NotificationInput;
import org.example.service.NotificationService;
import org.example.service.impl.NotificationServiceImpl;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationServiceImpl();

        NotificationInput notificationInput = new NotificationInput("Hola", new HashMap<>());

        notificationService.sendNotification(NotificationType.PUSH, notificationInput);

    }
}