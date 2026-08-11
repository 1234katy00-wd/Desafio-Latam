package com.farmacia.domain.entity;

public class Medication {

    private final String id;
    private final String title;
    private final String description;
    private final String dose;
    private final String laboratory;
    private final String presentation;
    private final String activeIngredient;
    private final double medicationPrice;
    
    
    public Medication(String id, String title, String description, String dose, String laboratory, String presentation, String activeIngredient, double medicationPrice) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dose = dose;
        this.laboratory = laboratory;
        this.presentation = presentation;
        this.activeIngredient = activeIngredient;
        this.medicationPrice =medicationPrice;
    }


    public String getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }


    public String getDescription() {
        return description;
    }


    public String getDose() {
        return dose;
    }


    public String getLaboratory() {
        return laboratory;
    }


    public String getPresentation() {
        return presentation;
    }


    public String getActiveIngredient() {
        return activeIngredient;
    }


    public double getMedicationPrice() {
        return medicationPrice;
    }
    
}
