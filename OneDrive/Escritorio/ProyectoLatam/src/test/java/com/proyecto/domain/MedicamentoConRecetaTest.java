package com.proyecto.domain;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.proyecto.domain.exception.RecetaInvalidaExcepcion;


public class MedicamentoConRecetaTest {
    
    @Test 
    void deberaFallarCuandoMedicamentoNoTengaReceta(){
        Receta recetaInvalida = new Receta("", "Dr Pérez", "Juan",LocalDate.parse("2026-07-18") , 2);
        MedicamentoConReceta medicamento = new MedicamentoConReceta(recetaInvalida);

        assertThrows(RecetaInvalidaExcepcion.class,() ->{
            medicamento.validar();
        });
    }

}


