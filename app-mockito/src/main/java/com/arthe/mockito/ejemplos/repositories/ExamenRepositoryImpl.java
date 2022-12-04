package com.arthe.mockito.ejemplos.repositories;

import com.arthe.mockito.ejemplos.models.Examen;

import java.util.Arrays;
import java.util.List;

public class ExamenRepositoryImpl implements ExamenRepository{
    @Override
    public List<Examen> findAll() {
        return Arrays.asList(
                new Examen(5L, "Matemática"),
                new Examen(6L, "Historia"),
                new Examen(7L, "Español"),
                new Examen(8L, "Lenguaje")
        );
    }
}
