package org.arthe.java.jdbc.repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface Repositorio<T>{
    void setConn(Connection conn);

    List<T> findAll() throws SQLException;

    T getId(Long id) throws SQLException;

    T save(T t) throws SQLException;

    void delete(Long id) throws SQLException;

}
