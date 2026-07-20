package com.proyecto.domain;

public class ServicioCompras {
    private final SMSNotificacion notificacion;

    public ServicioCompras(SMSNotificacion notificacion){
        this.notificacion = notificacion;
    }

    public void procesarCompra(String numeroTelefono, String informacion){
        notificacion.enviarMensaje(numeroTelefono, informacion);
    }
}
