package com.arthe.mockito.ejemplos.repositories;

import com.arthe.mockito.ejemplos.models.Examen;

import java.util.List;

public interface ExamenRepository {
    List<Examen> findAll();
}
