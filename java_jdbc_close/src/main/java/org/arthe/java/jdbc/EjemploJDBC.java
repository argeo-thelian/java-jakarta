package org.arthe.java.jdbc;

import org.arthe.java.jdbc.models.Categoria;
import org.arthe.java.jdbc.models.Producto;
import org.arthe.java.jdbc.repository.ProductoRepositorioImpl;
import org.arthe.java.jdbc.repository.Repositorio;
import org.arthe.java.jdbc.util.ConexionBaseDatos;

import java.sql.*;
import java.util.Date;

public class EjemploJDBC {
    public static void main(String[] args) {


        try (Connection conn = ConexionBaseDatos.getInstance()) {
            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
            System.out.println("============ Listar ============");
            repositorio.findAll().forEach(System.out::println);

            System.out.println("============ GetId ============");
            System.out.println(repositorio.getId(1L));

            System.out.println("============ Insertar nuevo producto ============");
            Producto producto = new Producto();
            producto.setNombre("Teclado Red Dragron mecánico");
            producto.setPrecio(450);
            producto.setFechaRegisto(new Date());
            Categoria categoria = new Categoria();
            categoria.setId(3L);
            producto.setCategoria(categoria);
            repositorio.save(producto);
            System.out.println("Producto guardado con éxito");

            System.out.println("============ Listar ============");
            repositorio.findAll().forEach(System.out::println);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
