package com.farmacia.domain.service;

import com.farmacia.domain.exception.InvalidQuantityException;

public class PurchaseValidator {
    public void processQuantity(int quantity ){
        if(quantity <= 0){
            throw new InvalidQuantityException();
        }
    }
}
