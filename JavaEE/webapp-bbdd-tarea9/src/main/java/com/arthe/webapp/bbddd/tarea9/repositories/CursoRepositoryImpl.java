package com.arthe.webapp.bbddd.tarea9.repositories;

import com.arthe.webapp.bbddd.tarea9.models.Curso;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CursoRepositoryImpl implements Repository<Curso>{

    public Connection conn;

    public CursoRepositoryImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public List<Curso> findAll() throws SQLException {
        List<Curso> cursos = new ArrayList<>();
        try (Statement stmt = conn.createStatement()){
            ResultSet rs = stmt.executeQuery("SELECT * FROM cursos");

            while (rs.next()){
                Curso c = getCursos(rs);
                cursos.add(c);
            }
        }
        return cursos;
    }

    @Override
    public List<Curso> findByNombre(String nombre) throws SQLException {
        List<Curso> cursos = new ArrayList<>();

        try (PreparedStatement stmt = conn.prepareStatement("SELECT * FROM cursos as c WHERE c.nombre like ?")){
            stmt.setString(1,"%" + nombre + "%");
            try (ResultSet rs = stmt.executeQuery()){
                while (rs.next()){
                    Curso c = getCursos(rs);
                    cursos.add(c);
                }
            }
        }
        return cursos;
    }

    private Curso getCursos(ResultSet rs) throws SQLException {
        Curso c = new Curso();
        c.setId(rs.getLong("id"));
        c.setNombre(rs.getString("nombre"));
        c.setDescripcion(rs.getString("descripcion"));
        c.setInstructor(rs.getString("instructor"));
        c.setDuracion(rs.getDouble("duracion"));
        return c;
    }
}
