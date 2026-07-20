package com.proyecto.domain;

public class MedicamentoConReceta {
    private final Receta receta;

    public MedicamentoConReceta(Receta receta){
        this.receta = receta;
    }

    public void validar(){
        receta.validarReceta();
    }


}
