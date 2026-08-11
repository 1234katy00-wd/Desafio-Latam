package com.farmacia.domain.service;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.farmacia.domain.exception.OutOfStockException;

public class InventoryTest {

    @Test
    public void knowWhenInventoryIsEmpty(){

        int availableStock = 0;
        int requiredAmount = 1; 

        Inventory inventory = new Inventory();

        assertThrows(OutOfStockException.class, () -> {
            inventory.checkAvailableStocke(availableStock, requiredAmount);
        });
    }

}
