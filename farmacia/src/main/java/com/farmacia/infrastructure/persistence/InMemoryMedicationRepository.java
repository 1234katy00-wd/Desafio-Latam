package com.farmacia.infrastructure.persistence;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

import com.farmacia.domain.entity.Medication;
import com.farmacia.domain.repository.MedicationRepository;

public class InMemoryMedicationRepository implements MedicationRepository {

    private final Map<String, Medication> storage = new ConcurrentHashMap<>();

    @Override
    public void save(Medication medication){
        if (medication != null && medication.getId() != null){
            storage.put(medication.getId(), medication);
        }
    }

    @Override
    public Optional<Medication> findById(String id){
        return Optional.ofNullable((storage.get(id)));
    }
}
