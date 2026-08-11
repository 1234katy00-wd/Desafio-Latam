package com.farmacia.application.usecase;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.farmacia.domain.entity.Medication;
import com.farmacia.domain.repository.MedicationRepository;

public class MedicationUseCaseTest {
    @Test 
    public void shouldresgisterMedicationWhenNotExists(){
        MedicationRepository repositoryMock = Mockito.mock(MedicationRepository.class);
        MedicationUseCase useCase = new MedicationUseCase(repositoryMock);

        Medication medication = new Medication ("M-001", "Paracetamol", "útil en dolores y fiebre.", "500 mg", "LaboratorioChile", "pastillas", "acetaminofén", 950);
        
        when(repositoryMock.findById("M-001")).thenReturn(Optional.empty());

        useCase.execute(medication);

        verify(repositoryMock, times(1)).save(medication);
    }

    @Test
    public void shouldThrowExceptionWhenMedicationAlreadyExists(){
        MedicationRepository repositoryMock = Mockito.mock(MedicationRepository.class);
        MedicationUseCase useCase = new MedicationUseCase(repositoryMock);

        Medication medication = new Medication ("M-001", "Paracetamol", "útil en dolores y fiebre.", "500 mg", "LaboratorioChile", "pastillas", "acetaminofén", 950);
        
        when(repositoryMock.findById("M-001")).thenReturn(Optional.of(medication));

        assertThrows(IllegalArgumentException.class, () -> {
            useCase.execute(medication);
        });

        verify(repositoryMock, never()).save(any());
        
    }

}