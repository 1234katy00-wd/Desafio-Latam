package com.proyecto.domain;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.proyecto.domain.exception.CantidadInvalidaExcepcion;

public class ValidadorDeComprasTest {
    
    @ParameterizedTest
    @ValueSource (ints = { -10, 0, -1 })

    public void lanzameInventarioAgotadoExcepcionCuandoCantidadSeaMenorOIgualACero( int cantidadEnInventario ){
        ValidadorDeCompras validacion = new ValidadorDeCompras();

        assertThrows(CantidadInvalidaExcepcion.class, ()->{
            validacion.procesarCantidad(cantidadEnInventario);
        });
    }
}
