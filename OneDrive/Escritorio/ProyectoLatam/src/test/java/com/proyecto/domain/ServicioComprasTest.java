package com.proyecto.domain;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
public class ServicioComprasTest {
    
    @Test
    public void DeberaLlamarANotidicadorUnaVezFinalizadaCompraExitosa(){
    
    SMSNotificacion notificacion = Mockito.mock(SMSNotificacion.class);
    ServicioCompras servicioCompras = new ServicioCompras(notificacion);
    
    servicioCompras.procesarCompra("+5698978978", "Boleta 01");
    
    Mockito.verify(notificacion, Mockito.times(1)).enviarMensaje("+5698978978", "Boleta 01");
    }

}
