package com.arthe.apiservlet.webapp.headers.services;

import com.arthe.apiservlet.webapp.headers.models.Producto;
import com.arthe.apiservlet.webapp.headers.repositories.ProductoRepositoryJdbcImpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class ProductoServiceJdbcImpl implements ProductoService{
    private ProductoRepositoryJdbcImpl repositoryJdbc;

    public ProductoServiceJdbcImpl(Connection connection) {
        this.repositoryJdbc =  new ProductoRepositoryJdbcImpl(connection);
    }

    @Override
    public List<Producto> findAll() {
        try {
            return this.repositoryJdbc.findAll();
        } catch (SQLException e) {
            throw new ServiceJdbcException(e.getMessage(), e.getCause());
        }
    }

    @Override
    public Optional<Producto> findById(Long id) {
        try {
            return Optional.ofNullable(this.repositoryJdbc.findById(id));
        } catch (SQLException e) {
            throw new ServiceJdbcException(e.getMessage(), e.getCause());
        }
    }
}
