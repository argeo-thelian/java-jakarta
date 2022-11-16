package org.arthe.java.jdbc.repository;

import org.arthe.java.jdbc.models.Producto;
import org.arthe.java.jdbc.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductoRepositorioImpl implements Repositorio<Producto>{
    private Connection getConnection() throws SQLException {
        return ConexionBaseDatos.getInstance();
    }

    @Override
    public List<Producto> findAll() {
        List<Producto> productos = new ArrayList<>();
        try (
            Statement stmt = getConnection().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM productos")
            )
        {
            while (rs.next()){
                Producto p = new Producto();
                p.setId(rs.getLong("id"));
                p.setNombre(rs.getString("nombre"));
                p.setPrecio(rs.getInt("precio"));
                p.setFechaRegisto(rs.getDate("fecha_registro"));
                productos.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Producto getId(Long id) {
        return null;
    }

    @Override
    public void save(Producto producto) {

    }

    @Override
    public void delete(Long id) {

    }
}
