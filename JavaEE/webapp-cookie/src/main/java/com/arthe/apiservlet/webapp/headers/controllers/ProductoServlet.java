package com.arthe.apiservlet.webapp.headers.controllers;

import com.arthe.apiservlet.webapp.headers.models.Producto;
import com.arthe.apiservlet.webapp.headers.services.LoginService;
import com.arthe.apiservlet.webapp.headers.services.LoginSeviceImp;
import com.arthe.apiservlet.webapp.headers.services.ProductoServiceImpl;
import com.arthe.apiservlet.webapp.headers.services.ProductoSrevice;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Optional;

@WebServlet({"/productos.html", "/productos"})
public class ProductoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductoSrevice service = new ProductoServiceImpl();
        List<Producto> productos = service.findAll();

        LoginService auth = new LoginSeviceImp();
        Optional<String> cookieOptional = auth.getUsername(req);

        resp.setContentType("text/html; charset=UTF-8");

        String servletPath = req.getServletPath();
        boolean isXls = servletPath.contains(".xls");
        if (isXls) {
            resp.setContentType("application/vnd.ms-excel");
            resp.setHeader("Content-Disposition", "attachment;filename=productos.xls");
        }

        try (PrintWriter out = resp.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("    <head>");
            out.println("       <meta chaset=\"UTF-8\"/>");
            out.println("       <title>Listado de Productos</title>");
            out.println("    </head>");
            out.println("    <body>");
            out.println("        <h1>Listado de Productos!</h1>");
            cookieOptional.ifPresent(s -> out.println("<div>Hola " + s + "</div>"));
            out.println("   <table>");
            out.println("       <tr>");
            out.println("           <th>id</th>");
            out.println("           <th>nombre</th>");
            out.println("           <th>tipo</th>");
            cookieOptional.ifPresent(s -> out.println("           <th>precio</th>"));
            out.println("       </tr>");
            productos.forEach(p -> {
                out.println("       <tr>");
                out.println("           <td>" + p.getId() + "</td>");
                out.println("           <td>" + p.getNombre() + "</td>");
                out.println("           <td>" + p.getTipo() + "</td>");
                cookieOptional.ifPresent(s -> out.println("           <td>" + p.getPrecio() + "</td>"));
                out.println("       </tr>");
            });
            out.println("   </table>");
            out.println("    </body>");
            out.println("</html>");
        }


    }
}
