package org.example.service;

import org.example.enumeration.NotificationType;
import org.example.model.NotificationInput;

public interface NotificationService {
    void sendNotification(NotificationType type, NotificationInput message);
}
