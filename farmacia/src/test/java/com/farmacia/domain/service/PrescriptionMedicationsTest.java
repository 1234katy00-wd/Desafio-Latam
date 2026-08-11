package com.farmacia.domain.service;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.farmacia.domain.exception.InvalidPrescriptionException;

public class PrescriptionMedicationsTest {
    
    @Test 
    void shouldFailWhenMedicineHasNoPrescription(){
        Prescription InvalidPrescription = new Prescription("", "Dr Pérez", "Juan",LocalDate.parse("2026-07-18") , 2);
        PrescriptionMedications medication = new PrescriptionMedications(InvalidPrescription);

        assertThrows(InvalidPrescriptionException.class,() ->{
            medication.validate();
        });
    }

}


