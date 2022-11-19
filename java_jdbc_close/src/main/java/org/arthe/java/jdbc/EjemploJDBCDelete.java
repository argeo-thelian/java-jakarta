package org.arthe.java.jdbc;

import org.arthe.java.jdbc.models.Producto;
import org.arthe.java.jdbc.repository.ProductoRepositorioImpl;
import org.arthe.java.jdbc.repository.Repositorio;
import org.arthe.java.jdbc.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;

public class EjemploJDBCDelete {
    public static void main(String[] args) {

        Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
        System.out.println("============ Listar ============");
        repositorio.findAll().forEach(System.out::println);

        System.out.println("============ GetId ============");
        System.out.println(repositorio.getId(1L));

        System.out.println("============ Delete producto ============");
        repositorio.delete(7L);
        System.out.println("Producto eliminado con éxito");

        System.out.println("============ Listar ============");
        repositorio.findAll().forEach(System.out::println);

    }
}
