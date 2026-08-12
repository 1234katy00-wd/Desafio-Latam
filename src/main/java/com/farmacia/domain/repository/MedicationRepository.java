package com.farmacia.domain.repository;

import java.util.Optional;

import com.farmacia.domain.entity.Medication;

public interface MedicationRepository {

    void save (Medication medication);
    Optional<Medication> findById(String id);
}
