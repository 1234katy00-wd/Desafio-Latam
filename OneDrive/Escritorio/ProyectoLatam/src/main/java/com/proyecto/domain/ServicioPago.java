package com.proyecto.domain;

public class ServicioPago {
    private final MensajeNotificacion mensajeNotificacion;

    public ServicioPago(MensajeNotificacion mensajeNotificacion){
        this.mensajeNotificacion = mensajeNotificacion;
    }

    public void procesarPago (String compraId, String telefonoCliente){
        if(compraId == null || compraId.isBlank()){
            throw new IllegalArgumentException("La compra es invalida.");
        }
        this.mensajeNotificacion.enviarNotificacion(telefonoCliente, "procesando pago con CompraId" + compraId);
    }
}
