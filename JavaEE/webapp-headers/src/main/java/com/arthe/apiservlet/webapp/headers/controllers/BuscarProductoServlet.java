package com.arthe.apiservlet.webapp.headers.controllers;

import com.arthe.apiservlet.webapp.headers.models.Producto;
import com.arthe.apiservlet.webapp.headers.services.ProductoServiceImpl;
import com.arthe.apiservlet.webapp.headers.services.ProductoSrevice;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

@WebServlet("/buscar-producto")
public class BuscarProductoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductoSrevice service = new ProductoServiceImpl();
        String nombre = req.getParameter("producto");
        Optional<Producto> encontrado = service.findAll().stream().filter(p -> {

            if (nombre == null || nombre.trim().isEmpty()){
                return false;
            }
            return  p.getNombre().contains(nombre);
        }).findFirst();

        if(encontrado.isPresent()){

            resp.setContentType("text/html; charset=UTF-8");
            try (PrintWriter out = resp.getWriter()) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("    <head>");
                out.println("       <meta chaset=\"UTF-8\"/>");
                out.println("       <title>Producto Encontrado</title>");
                out.println("    </head>");
                out.println("    <body>");
                out.println("        <h1>Producto Encontrado!</h1>");
                out.println("        <h3>Producto encontrado " + encontrado.get().getNombre() +
                                    " el precio es: " + encontrado.get().getPrecio() + " </h3>");
                out.println("    </body>");
                out.println("</html>");
            }
        }else {
            resp.sendError(HttpServletResponse.SC_NOT_FOUND, "Lo sentimos no se encontró el producto " + nombre);
        }
    }
}
