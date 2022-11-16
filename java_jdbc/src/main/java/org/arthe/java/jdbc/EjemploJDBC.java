package org.arthe.java.jdbc;

import org.arthe.java.jdbc.util.ConexionBaseDatos;

import java.sql.*;

public class EjemploJDBC {
    public static void main(String[] args) {


        try (
                Connection conn = ConexionBaseDatos.getInstance();
                Statement stmt = conn.createStatement();
                ResultSet resultado = stmt.executeQuery("SELECT * FROM productos")
            )
        {
            while (resultado.next()){
                System.out.print(resultado.getInt("id"));
                System.out.print(" | ");
                System.out.print(resultado.getString("nombre"));
                System.out.print(" | ");
                System.out.print(resultado.getDouble("precio"));
                System.out.print(" | ");
                System.out.println(resultado.getDate("fecha_registro"));
                System.out.println("-------------------------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
