package com.proyecto.domain;

import com.proyecto.domain.exception.InventarioAgotadoExcepcion;

public class Inventario {
    
    public void verificarStockDisponible(int stock, int cantidad){
        if(stock < cantidad){
            throw new InventarioAgotadoExcepcion(
                "Operación rechazada: stock insuficiente."
            );

            
        }
    }
}
