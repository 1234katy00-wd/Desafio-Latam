package com.proyecto.domain;

import java.time.LocalDate;

import com.proyecto.domain.exception.RecetaInvalidaExcepcion;

public class Receta {

    private final String medicamento;
    private final String NombreMedico;
    private final String NombrePaciente;
    private final LocalDate fechaEmision;
    private final int DuracionTratamiento;

    public Receta(String medicamento, String NombreMedico, String NombrePaciente, LocalDate fechaEmision, int DuracionTratamiento) {
        this.medicamento = medicamento;
        this.NombreMedico = NombreMedico;
        this.NombrePaciente = NombrePaciente;
        this.fechaEmision = fechaEmision;
        this.DuracionTratamiento = DuracionTratamiento;
    }


    public void validarReceta() {
        if (medicamento == null || medicamento.isBlank()) {
            throw new RecetaInvalidaExcepcion("El medicamento requiere receta");
        }
    }

    
}
