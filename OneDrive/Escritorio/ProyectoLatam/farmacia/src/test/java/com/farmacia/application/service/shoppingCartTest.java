package com.farmacia.application.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.farmacia.application.service.ShoppingCart;

public class shoppingCartTest {
    
    @Test
    public void carritoDebeInicializarVacioYListaVacia(){
        ShoppingCart compras = new ShoppingCart();

        int totalActual = compras.getTotal();
        boolean listaVacia = compras.getItems().isEmpty();

        assertEquals(0, totalActual, "El total inicial del carrito debe ser 0.");
        assertTrue(listaVacia, "El carrito debe iniciar vacío.");

    }
}
