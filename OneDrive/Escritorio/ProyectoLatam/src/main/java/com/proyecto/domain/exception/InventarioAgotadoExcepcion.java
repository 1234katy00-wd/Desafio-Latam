package com.proyecto.domain.exception;

public class InventarioAgotadoExcepcion extends  RuntimeException {
    public InventarioAgotadoExcepcion(String mensaje){
        super(mensaje);
    }
}
