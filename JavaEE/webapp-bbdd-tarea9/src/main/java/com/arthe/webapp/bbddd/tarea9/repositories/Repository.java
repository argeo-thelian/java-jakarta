package com.arthe.webapp.bbddd.tarea9.repositories;

import java.sql.SQLException;
import java.util.List;

public interface Repository<T> {
    List<T> findAll() throws SQLException;
    List<T> findByNombre(String nombre) throws SQLException;
}
