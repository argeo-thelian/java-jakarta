package com.arthe.webapp.bbddd.tarea9.services;

import com.arthe.webapp.bbddd.tarea9.models.Curso;
import com.arthe.webapp.bbddd.tarea9.repositories.CursoRepositoryImpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class CursoServiceJdbcImpl implements CursoService{
    private CursoRepositoryImpl repositoryJdbc;

    public CursoServiceJdbcImpl(Connection connection) {
        this.repositoryJdbc = new CursoRepositoryImpl(connection);
    }

    @Override
    public List<Curso> findAll() {
        try {
            return this.repositoryJdbc.findAll();
        } catch (SQLException e) {
            throw new ServiceJdbcExecption(e.getMessage(),e.getCause());
        }
    }

    @Override
    public List<Curso> findByNombre(String nombre) {
        try {
            return this.repositoryJdbc.findByNombre(nombre);
        } catch (SQLException e) {
            throw new ServiceJdbcExecption(e.getMessage(),e.getCause());
        }
    }
}
