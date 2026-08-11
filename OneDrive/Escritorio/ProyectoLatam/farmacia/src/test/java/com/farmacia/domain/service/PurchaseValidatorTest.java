package com.farmacia.domain.service;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.farmacia.domain.exception.InvalidQuantityException;

public class PurchaseValidatorTest {
    
    @ParameterizedTest
    @ValueSource (ints = { -10, 0, -1 })

    public void throwOutOfStockExceptionWhenQuantityIsLessThanOrEqualToZero( int inventoryQuantity){
        PurchaseValidator validation = new PurchaseValidator();

        assertThrows(InvalidQuantityException.class, ()->{
            validation.processQuantity(inventoryQuantity);
        });
    }
}
