package com.farmacia.application.port;

public interface SMSNotification {
    public void sendMessage(String phoneNumber, String information);
}
