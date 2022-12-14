package com.arthe.webapp.bbddd.tarea9.services;

import com.arthe.webapp.bbddd.tarea9.models.Curso;

import java.util.List;

public interface CursoService {
    List<Curso> findAll();
    List<Curso> findByNombre(String nombre);
}
