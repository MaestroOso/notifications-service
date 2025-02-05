package org.example.model;

import java.util.Map;

public record NotificationInput (String message, Map<String, String> param) {
}