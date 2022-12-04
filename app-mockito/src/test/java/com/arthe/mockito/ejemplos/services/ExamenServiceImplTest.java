package com.arthe.mockito.ejemplos.services;

import com.arthe.mockito.ejemplos.models.Examen;
import com.arthe.mockito.ejemplos.repositories.ExamenRepository;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

class ExamenServiceImplTest {

    @Test
    void findExamenPorNombre() {
//        ExamenRepository repository = new ExamenRepositoryImpl();
        ExamenRepository repository = mock(ExamenRepository.class);
        ExamenService service = new ExamenServiceImpl(repository);
        List<Examen> datos = Arrays.asList(
                new Examen(5L, "Matemática"),
                new Examen(6L, "Historia"),
                new Examen(7L, "Español"),
                new Examen(8L, "Lenguaje")
        );
        when(repository.findAll()).thenReturn(datos);
        Optional<Examen> examen = service.findExamenPorNombre("Matemática");

        assertTrue(examen.isPresent());
        assertEquals(5L,examen.get().getId());
        assertEquals("Matemática", examen.get().getNombre());

    }
}