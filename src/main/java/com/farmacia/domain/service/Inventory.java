package com.farmacia.domain.service;

import com.farmacia.domain.exception.OutOfStockException;


public class Inventory {
    
    public void checkAvailableStocke(int availableStock, int requiredAmount){
        if(availableStock < requiredAmount){
            throw new OutOfStockException(
                "Operación rechazada: stock insuficiente."
            );

            
        }
    }

}
