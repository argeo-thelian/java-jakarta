package org.arthe.java.jdbc.service;

import org.arthe.java.jdbc.models.Categoria;
import org.arthe.java.jdbc.models.Producto;
import org.arthe.java.jdbc.repository.CategoriaRepositorioImpl;
import org.arthe.java.jdbc.repository.ProductoRepositorioImpl;
import org.arthe.java.jdbc.repository.Repositorio;
import org.arthe.java.jdbc.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class CatalogoServicio implements Service{

    private Repositorio<Producto> productoRepositorio;
    private Repositorio<Categoria> categoriaRepositorio;

    public CatalogoServicio() {
        this.productoRepositorio = new ProductoRepositorioImpl();
        this.categoriaRepositorio = new CategoriaRepositorioImpl();
    }

    @Override
    public List<Producto> findAllProductos() throws SQLException {
        try (Connection conn = ConexionBaseDatos.getConnection()){
            productoRepositorio.setConn(conn);
            return productoRepositorio.findAll();
        }
    }

    @Override
    public Producto getIdProducto(Long id) throws SQLException {
        try (Connection conn = ConexionBaseDatos.getConnection()){
            productoRepositorio.setConn(conn);
            return productoRepositorio.getId(id);
        }
    }

    @Override
    public Producto saveProducto(Producto producto) throws SQLException {
        try (Connection conn = ConexionBaseDatos.getConnection()){
            productoRepositorio.setConn(conn);
            if (conn.getAutoCommit()) {
                conn.setAutoCommit(false);
            }
            Producto nuevoProducto = null;
            try {
                nuevoProducto = productoRepositorio.save(producto);
                conn.commit();
            }catch (SQLException e){
                conn.rollback();
                e.printStackTrace();
            }
            return nuevoProducto;
        }
    }

    @Override
    public void deleteProducto(Long id) throws SQLException {
        try (Connection conn = ConexionBaseDatos.getConnection()){
            productoRepositorio.setConn(conn);
            if (conn.getAutoCommit()) {
                conn.setAutoCommit(false);
            }
            try {
                productoRepositorio.delete(id);
                conn.commit();
            }catch (SQLException e){
                conn.rollback();
                e.printStackTrace();
            }
        }
    }

    @Override
    public List<Categoria> findAllCategorias() throws SQLException {
        try (Connection conn = ConexionBaseDatos.getConnection()){
            categoriaRepositorio.setConn(conn);
            return categoriaRepositorio.findAll();
        }
    }

    @Override
    public Categoria getIdCategoria(Long id) throws SQLException {
        try (Connection conn = ConexionBaseDatos.getConnection()){
            categoriaRepositorio.setConn(conn);
            return categoriaRepositorio.getId(id);
        }
    }

    @Override
    public Categoria saveCategoria(Categoria categoria) throws SQLException {
        try (Connection conn = ConexionBaseDatos.getConnection()){
            categoriaRepositorio.setConn(conn);
            if (conn.getAutoCommit()) {
                conn.setAutoCommit(false);
            }
            Categoria nuevaCategoria = null;
            try {
                nuevaCategoria = categoriaRepositorio.save(categoria);
                conn.commit();
            }catch (SQLException e){
                conn.rollback();
                e.printStackTrace();
            }
            return nuevaCategoria;
        }
    }

    @Override
    public void deleteCategoria(Long id) throws SQLException {
        try (Connection conn = ConexionBaseDatos.getConnection()){
            categoriaRepositorio.setConn(conn);
            if (conn.getAutoCommit()) {
                conn.setAutoCommit(false);
            }
            try {
                categoriaRepositorio.delete(id);
                conn.commit();
            }catch (SQLException e){
                conn.rollback();
                e.printStackTrace();
            }
        }
    }

    @Override
    public void saveProductoWithCategoria(Producto producto, Categoria categoria) throws SQLException {
        try (Connection conn = ConexionBaseDatos.getConnection()){
            productoRepositorio.setConn(conn);
            categoriaRepositorio.setConn(conn);
            if (conn.getAutoCommit()) {
                conn.setAutoCommit(false);
            }
            try {
                Categoria nuevaCategoria = categoriaRepositorio.save(categoria);
                producto.setCategoria(nuevaCategoria);
                productoRepositorio.save(producto);
                conn.commit();
            }catch (SQLException e){
                conn.rollback();
                e.printStackTrace();
            }
        }
    }
}
