package org.arthe.java.jdbc.service;

import org.arthe.java.jdbc.models.Categoria;
import org.arthe.java.jdbc.models.Producto;

import java.sql.SQLException;
import java.util.List;

public interface Service {
    List<Producto> findAllProductos() throws SQLException;

    Producto getIdProducto(Long id) throws SQLException;

    Producto saveProducto(Producto producto) throws SQLException;

    void deleteProducto(Long id) throws SQLException;

    List<Categoria> findAllCategorias() throws SQLException;

    Categoria getIdCategoria(Long id) throws SQLException;

    Categoria saveCategoria(Categoria categoria) throws SQLException;

    void deleteCategoria(Long id) throws SQLException;

    void saveProductoWithCategoria(Producto producto, Categoria categoria) throws SQLException;
}
