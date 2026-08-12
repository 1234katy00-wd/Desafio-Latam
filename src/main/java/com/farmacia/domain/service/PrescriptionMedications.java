package com.farmacia.domain.service;

public class PrescriptionMedications {
    private final Prescription prescription;

    public PrescriptionMedications(Prescription prescription){
        this.prescription= prescription;
    }

    public void validate(){
        prescription.validatePrescription();
    }


}
