package com.arthe.mockito.ejemplos.services;

import com.arthe.mockito.ejemplos.models.Examen;

import java.util.Optional;

public interface ExamenService {
    Optional<Examen> findExamenPorNombre(String nombre);
}
