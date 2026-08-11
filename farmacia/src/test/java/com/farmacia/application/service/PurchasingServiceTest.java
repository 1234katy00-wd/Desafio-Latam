package com.farmacia.application.service;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.farmacia.application.port.SMSNotification;
import com.farmacia.application.service.PurchasingService;
public class PurchasingServiceTest {
    
    @Test
    public void shouldCallTheNotifierOnceThePurchaseIsSuccessfullyCompleted (){
    
    SMSNotification notification = Mockito.mock(SMSNotification.class);
    PurchasingService purchasingService = new PurchasingService(notification);
    
    purchasingService.processPurchase("+5698978978", "Boleta 01");
    
    Mockito.verify(notification, Mockito.times(1)).sendMessage("+5698978978", "Boleta 01");
    }

}
