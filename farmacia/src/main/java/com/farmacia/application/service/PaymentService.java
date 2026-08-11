package com.farmacia.application.service;

import com.farmacia.application.port.NotificationMessage;

public class PaymentService {
    private final NotificationMessage notificationMessage;

    public PaymentService(NotificationMessage notificationMessage){
        this.notificationMessage = notificationMessage;
    }

    public void processPayment (String purchaseId, String customerPhone){
        if(purchaseId == null || purchaseId.isBlank()){
            throw new IllegalArgumentException("La compra es invalida.");
        }
        this.notificationMessage.sendNotification(customerPhone, "procesando pago con purchaseId" + purchaseId);
    }
}
