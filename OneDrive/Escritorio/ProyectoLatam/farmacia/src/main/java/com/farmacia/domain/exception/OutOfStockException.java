package com.farmacia.domain.exception;

public class OutOfStockException extends  RuntimeException {
    public OutOfStockException(String mensaje){
        super(mensaje);
    }
}
