package org.arthe.java.jdbc;

import org.arthe.java.jdbc.models.Categoria;
import org.arthe.java.jdbc.models.Producto;
import org.arthe.java.jdbc.repository.ProductoRepositorioImpl;
import org.arthe.java.jdbc.repository.Repositorio;
import org.arthe.java.jdbc.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class EjemploJDBCTrx {
    public static void main(String[] args) throws SQLException {

        try (Connection conn = ConexionBaseDatos.getInstance()) {
            //Conjunto de sentencias
            if (conn.getAutoCommit()){
                conn.setAutoCommit(false);
            }
            try {
                Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
                System.out.println("============ Listar ============");
                repositorio.findAll().forEach(System.out::println);

                System.out.println("============ GetId ============");
                System.out.println(repositorio.getId(1L));

                System.out.println("============ Insertar nuevo producto ============");
                Producto producto = new Producto();
                producto.setNombre("Teclado Green Dragron mecánico");
                producto.setPrecio(443);
                producto.setFechaRegisto(new Date());
                Categoria categoria = new Categoria();
                categoria.setId(3L);
                producto.setCategoria(categoria);
                producto.setSku("abcde12345");
                repositorio.save(producto);
                System.out.println("Producto guardado con éxito");

                System.out.println("============ Update producto ============");
                producto = new Producto();
                producto.setId(2L);
                producto.setNombre("Teclado Blue mecánico");
                producto.setPrecio(1300);
                producto.setSku("abcd12346");
                categoria = new Categoria();
                categoria.setId(3L);
                producto.setCategoria(categoria);
                repositorio.save(producto);
                System.out.println("Producto actualizado con éxito");

                conn.commit();
            }catch (SQLException ex){
                conn.rollback();
                ex.printStackTrace();
            }
        }
    }
}
