package com.farmacia.infrastructure.persistence;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.farmacia.domain.entity.Medication;

    
@DisplayName("In memory medication repository")
public class InMemoryMedicationRepositoryTest {
    @Test
    @DisplayName("should save and find medication by Id successfullly")
    void shouldSaveAndFindMedicationById() {
        InMemoryMedicationRepository repository = new InMemoryMedicationRepository();
        Medication medication = new Medication("M-001", "Paracetamol", "útil en dolores y fiebre.", "500 mg", "LaboratorioChile", "pastillas", "acetaminofén", 950);
    
        repository.save(medication);
        Optional<Medication> found = repository.findById("M-001");
        
        assertThat(found).isPresent();
        assertThat(found.get().getTitle()).isEqualTo("Paracetamol");
        assertThat(found.get().getDescription()).isEqualTo("útil en dolores y fiebre.");
        assertThat(found.get().getDose()).isEqualTo("500 mg");
        assertThat(found.get().getLaboratory()).isEqualTo("LaboratorioChile");
        assertThat(found.get().getPresentation()).isEqualTo("pastillas");
        assertThat(found.get().getActiveIngredient()).isEqualTo("acetaminofén");
        assertThat(found.get().getMedicationPrice()).isEqualTo(950);
    }

    @Test
    @DisplayName("Should return empty optional when medication ID is not found")
    void shouldReturnEmptyOptionalWhenNotFound() {
        InMemoryMedicationRepository repository = new InMemoryMedicationRepository();

        Optional<Medication> found = repository.findById("No existe");
        assertThat(found).isEmpty();
    }

}
