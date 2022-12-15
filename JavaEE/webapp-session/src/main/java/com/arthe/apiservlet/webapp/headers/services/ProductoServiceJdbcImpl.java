package com.arthe.apiservlet.webapp.headers.services;

import com.arthe.apiservlet.webapp.headers.models.Categoria;
import com.arthe.apiservlet.webapp.headers.models.Producto;
import com.arthe.apiservlet.webapp.headers.repositories.CategoriaRespositoryJdbcImpl;
import com.arthe.apiservlet.webapp.headers.repositories.ProductoRepositoryJdbcImpl;
import com.arthe.apiservlet.webapp.headers.repositories.Repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class  ProductoServiceJdbcImpl implements ProductoService{
    private Repository<Producto> productoRepositoryJdbc;
    private Repository<Categoria> categoriaRepositoryJdbc;


    public ProductoServiceJdbcImpl(Connection connection) {
        this.productoRepositoryJdbc =  new ProductoRepositoryJdbcImpl(connection);
        this.categoriaRepositoryJdbc =  new CategoriaRespositoryJdbcImpl(connection);

    }

    @Override
    public List<Producto> findAll() {
        try {
            return this.productoRepositoryJdbc.findAll();
        } catch (SQLException e) {
            throw new ServiceJdbcException(e.getMessage(), e.getCause());
        }
    }

    @Override
    public Optional<Producto> findById(Long id) {
        try {
            return Optional.ofNullable(this.productoRepositoryJdbc.findById(id));
        } catch (SQLException e) {
            throw new ServiceJdbcException(e.getMessage(), e.getCause());
        }
    }

    @Override
    public void save(Producto producto) {
        try {
            this.productoRepositoryJdbc.save(producto);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void eleminar(Long id) {

    }

    @Override
    public List<Categoria> findAllCategoria() {
        return null;
    }

    @Override
    public Optional<Categoria> findByIdCategoria(Long id) {
        return Optional.empty();
    }
}
