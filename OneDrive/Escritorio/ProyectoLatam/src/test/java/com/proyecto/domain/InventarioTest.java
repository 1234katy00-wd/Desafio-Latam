package com.proyecto.domain;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.proyecto.domain.exception.InventarioAgotadoExcepcion;

public class InventarioTest {

    @Test
    public void AvisaCuandoInventarioEsteVacio(){

        int stockDisponible = 0;
        int cantidadRequerida = 1; 

        Inventario inventario = new Inventario();

        assertThrows(InventarioAgotadoExcepcion.class, () -> {
            inventario.verificarStockDisponible(stockDisponible, cantidadRequerida);
        });
    }

}
