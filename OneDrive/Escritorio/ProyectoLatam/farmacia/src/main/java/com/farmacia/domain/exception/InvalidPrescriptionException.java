package com.farmacia.domain.exception;

    public class InvalidPrescriptionException extends RuntimeException {
        public InvalidPrescriptionException (String mensaje){
            super(mensaje);
        }
    }



