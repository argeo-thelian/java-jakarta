package org.arthe.java.jdbc.repository;

import java.sql.SQLException;
import java.util.List;

public interface Repositorio<T>{
    List<T> findAll() throws SQLException;

    T getId(Long id) throws SQLException;

    void save(T t) throws SQLException;

    void delete(Long id) throws SQLException;

}
