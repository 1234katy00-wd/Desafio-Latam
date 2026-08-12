package com.farmacia.domain.service;

import java.time.LocalDate;

import com.farmacia.domain.exception.InvalidPrescriptionException;

public class Prescription {

    private final String medication;
    private final String doctorName;
    private final String patientName;
    private final LocalDate issueDate;
    private final int treatmentDuration;

    

    public Prescription(String medication, String doctorName, String patientName, LocalDate issueDate,
            int treatmentDuration) {
        this.medication = medication;
        this.doctorName = doctorName;
        this.patientName = patientName;
        this.issueDate = issueDate;
        this.treatmentDuration = treatmentDuration;
    }

    


    public void validatePrescription() {
        if (medication == null || medication.isBlank()) {
            throw new InvalidPrescriptionException("El medicamento requiere receta");
        }
    }

    
}
