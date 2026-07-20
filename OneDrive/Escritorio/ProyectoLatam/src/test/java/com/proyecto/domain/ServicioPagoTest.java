package com.proyecto.domain;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ServicioPagoTest {
    private static class DobleDeNotificacion implements MensajeNotificacion{
        @Override
        public void enviarNotificacion (String destino, String mensaje){

        }
    }

    @Test
    public void deberiaFallarCuandoCompraIdEsInvalido(){
        MensajeNotificacion dobleDeNotificacion = new DobleDeNotificacion ();
        ServicioPago servicioPago = new ServicioPago(dobleDeNotificacion);

        assertThrows( IllegalArgumentException.class, () ->{
            servicioPago.procesarPago("", "987878787");
        }, "Debería fallar si la compra es incorrecta.");
    }


}
