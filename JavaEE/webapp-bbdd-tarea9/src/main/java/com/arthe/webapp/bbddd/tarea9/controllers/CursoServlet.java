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

@WebServlet({"/","/cursos"})
public class CursoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Connection conn = (Connection) req.getAttribute("conn");
        CursoService service = new CursoServiceJdbcImpl(conn);
        List<Curso>  cursos = service.findAll();
        req.setAttribute("cursos",cursos);
        getServletContext().getRequestDispatcher("/listar.jsp").forward(req,resp);
    }
}
