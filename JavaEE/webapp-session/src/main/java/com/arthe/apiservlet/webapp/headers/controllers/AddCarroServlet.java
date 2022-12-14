package com.arthe.apiservlet.webapp.headers.controllers;

import com.arthe.apiservlet.webapp.headers.models.Carro;
import com.arthe.apiservlet.webapp.headers.models.ItemCarro;
import com.arthe.apiservlet.webapp.headers.models.Producto;
import com.arthe.apiservlet.webapp.headers.services.ProductoServiceImpl;
import com.arthe.apiservlet.webapp.headers.services.ProductoService;
import com.arthe.apiservlet.webapp.headers.services.ProductoServiceJdbcImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Connection;
import java.util.Optional;

@WebServlet("/carro/agregar")
public class AddCarroServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id = Long.parseLong(req.getParameter("id"));
        Connection conn = (Connection) req.getAttribute("conn");
        ProductoService service = new ProductoServiceJdbcImpl(conn);

        Optional<Producto> producto = service.findById(id);
        if (producto.isPresent()){
              ItemCarro item = new ItemCarro(1, producto.get());
            HttpSession session = req.getSession();
            Carro carro  = (Carro) session.getAttribute("carro");

            carro.addItemCarro(item);
        }
        resp.sendRedirect(req.getContextPath() + "/carro/ver");
    }
}
