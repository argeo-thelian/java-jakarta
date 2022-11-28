package org.arthe.java.jdbc;

import org.arthe.java.jdbc.models.Categoria;
import org.arthe.java.jdbc.models.Producto;
import org.arthe.java.jdbc.repository.CategoriaRepositorioImpl;
import org.arthe.java.jdbc.repository.ProductoRepositorioImpl;
import org.arthe.java.jdbc.repository.Repositorio;
import org.arthe.java.jdbc.service.CatalogoServicio;
import org.arthe.java.jdbc.service.Service;
import org.arthe.java.jdbc.util.ConexionBaseDatos;

import java.sql.*;
import java.util.Date;

public class EjemploJDBC {
    public static void main(String[] args) throws SQLException {

        Service service = new CatalogoServicio();


        System.out.println("============ LISTAR CATEGORIA ============");
        service.findAllCategorias().forEach(System.out::println);
        System.out.println("============ LISTAR PRODUCTO ============");
        service.findAllProductos().forEach(System.out::println);


        System.out.println("============ INSERTAR NUEVA CATEGORIA  y PRODUCTO ============");
        Categoria categoria = new Categoria();
        categoria.setNombre("Iluminació");

        Producto producto = new Producto();
        producto.setNombre("Lámpara Led escritorio");
        producto.setPrecio(930);
        producto.setFechaRegisto(new Date());
        producto.setSku("asrse1234");
        service.saveProductoWithCategoria(producto, categoria);
        System.out.println("Producto guardado con éxito, id " + producto.getId());

        System.out.println("============ LISTAR CATEGORIA ============");
        service.findAllCategorias().forEach(System.out::println);
        System.out.println("============ LISTAR PRODUCTO ============");
        service.findAllProductos().forEach(System.out::println);
    }
}
