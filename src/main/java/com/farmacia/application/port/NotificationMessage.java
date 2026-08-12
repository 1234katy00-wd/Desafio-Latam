package com.farmacia.application.port;

public interface NotificationMessage {
    void sendNotification(String destination, String message);
}