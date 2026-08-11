package com.farmacia.application.usecase;

import com.farmacia.domain.entity.Medication;
import com.farmacia.domain.repository.MedicationRepository;

public class MedicationUseCase {
    private final MedicationRepository medicationRepository;

    public MedicationUseCase(MedicationRepository medicationRepository){
        this.medicationRepository = medicationRepository;
    }

    public void execute(Medication medication){
        if(medicationRepository.findById(medication.getId()).isPresent()){
            throw new IllegalArgumentException ("El ID del medicamento ya existe.");
        }

        medicationRepository.save(medication);

    }

    
}
