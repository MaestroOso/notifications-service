package org.example.notifications;

import org.example.enumeration.NotificationType;

public class NotificationFactory {

    private final SMSNotification smsNotification;

    private final EmailNotification emailNotification;

    private final PushNotification pushNotification;

    public NotificationFactory() {
        smsNotification = new SMSNotification();
        emailNotification = new EmailNotification();
        pushNotification = new PushNotification();
    }

    public Notification getNotification(NotificationType type) {
        switch (type) {
            case SMS -> {
                return smsNotification;
            }
            case PUSH -> {
                return pushNotification;
            }
            case EMAIL -> {
                return emailNotification;
            }
        }
        return null;
    }

}
