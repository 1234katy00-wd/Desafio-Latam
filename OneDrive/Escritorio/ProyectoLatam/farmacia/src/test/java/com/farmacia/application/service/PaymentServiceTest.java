package com.farmacia.application.service;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.farmacia.application.port.NotificationMessage;

public class PaymentServiceTest {
    private static class NotificationCopy implements NotificationMessage{
        @Override
        public void sendNotification (String destination, String message){

        }
    }

    @Test
    public void deberiaFallarCuandoCompraIdEsInvalido(){
        NotificationMessage notificationCopy = new NotificationCopy ();
        PaymentService paymentService = new PaymentService(notificationCopy);

        assertThrows( IllegalArgumentException.class, () ->{
            paymentService.processPayment("", "987878787");
        }, "Debería fallar si la compra es incorrecta.");
    }


}
