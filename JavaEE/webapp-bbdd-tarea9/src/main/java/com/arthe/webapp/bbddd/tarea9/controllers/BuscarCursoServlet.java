package com.arthe.webapp.bbddd.tarea9.controllers;

import com.arthe.webapp.bbddd.tarea9.models.Curso;
import com.arthe.webapp.bbddd.tarea9.services.CursoService;
import com.arthe.webapp.bbddd.tarea9.services.CursoServiceJdbcImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

@WebServlet("/buscar")
public class BuscarCursoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String anyword = req.getParameter("anyword");
        Connection conn = (Connection) req.getAttribute("conn");
        CursoService service = new CursoServiceJdbcImpl(conn);

        List<Curso> cursos = service.findByNombre(anyword);
        if (!cursos.isEmpty()){
            req.setAttribute("cursos",cursos);
            getServletContext().getRequestDispatcher("/listar.jsp").forward(req,resp);
        }
    }
}
