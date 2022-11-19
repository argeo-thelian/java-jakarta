package org.arthe.java.jdbc;

import org.arthe.java.jdbc.models.Categoria;
import org.arthe.java.jdbc.models.Producto;
import org.arthe.java.jdbc.repository.ProductoRepositorioImpl;
import org.arthe.java.jdbc.repository.Repositorio;
import org.arthe.java.jdbc.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class EjemploJDBCUpdate {
    public static void main(String[] args) {
        Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
        System.out.println("============ Listar ============");
        repositorio.findAll().forEach(System.out::println);

        System.out.println("============ GetId ============");
        System.out.println(repositorio.getId(1L));

        System.out.println("============ Update producto ============");
        Producto producto = new Producto();
        producto.setId(7L);
        producto.setNombre("Teclado dether mecánico");
        producto.setPrecio(340);
        Categoria categoria = new Categoria();
        categoria.setId(3L);
        producto.setCategoria(categoria);
        repositorio.save(producto);
        System.out.println("Producto actualizado con éxito");

        System.out.println("============ Listar ============");
        repositorio.findAll().forEach(System.out::println);

    }
}
