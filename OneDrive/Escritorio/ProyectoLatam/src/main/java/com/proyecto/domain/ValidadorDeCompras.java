package com.proyecto.domain;

import com.proyecto.domain.exception.CantidadInvalidaExcepcion;

public class ValidadorDeCompras {
    public void procesarCantidad(int cantidad){
        if(cantidad <= 0){
            throw new CantidadInvalidaExcepcion();
        }
    }
}
