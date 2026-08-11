package com.farmacia.application.service;

import com.farmacia.application.port.SMSNotification;

public class PurchasingService {
    private final SMSNotification notification;

    public PurchasingService(SMSNotification notification){
        this.notification = notification;
    }

    public void processPurchase(String phoneNumber, String information){
        notification.sendMessage(phoneNumber, information);
    }
}
