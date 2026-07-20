package com.proyecto.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CarritoComprasTest {
    
    @Test
    public void carritoDebeInicializarVacioYListaVacia(){
        CarritoCompras compras = new CarritoCompras();

        int totalActual = compras.getTotal();
        boolean listaVacia = compras.getItems().isEmpty();

        assertEquals(0, totalActual, "El total inicial del carrito debe ser 0.");
        assertTrue(listaVacia, "El carrito debe iniciar vacío.");

    }
}
