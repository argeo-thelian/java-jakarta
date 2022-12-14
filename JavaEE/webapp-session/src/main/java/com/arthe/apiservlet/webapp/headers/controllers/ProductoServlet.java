package com.arthe.apiservlet.webapp.headers.controllers;

import com.arthe.apiservlet.webapp.headers.models.Producto;
import com.arthe.apiservlet.webapp.headers.services.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;
import java.util.Optional;

@WebServlet({"/productos.html", "/productos"})
public class ProductoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Connection conn = (Connection) req.getAttribute("conn");
        ProductoService service = new ProductoServiceJdbcImpl(conn);
        List<Producto> productos = service.findAll();

        LoginService auth = new LoginServiceSessionImpl();
        Optional<String> usernameOptional = auth.getUsername(req);
        req.setAttribute("productos",productos);
        req.setAttribute("username", usernameOptional);

        getServletContext().getRequestDispatcher("/listar.jsp").forward(req,resp);
//        String mensajeRequest = (String) req.getAttribute("mensaje");
//        String mensajeGlobal = (String) getServletContext().getAttribute("mensaje");
//        resp.setContentType("text/html; charset=UTF-8");
//
//        String servletPath = req.getServletPath();
//        boolean isXls = servletPath.contains(".xls");
//        if (isXls) {
//            resp.setContentType("application/vnd.ms-excel");
//            resp.setHeader("Content-Disposition", "attachment;filename=productos.xls");
//        }
//
//        try (PrintWriter out = resp.getWriter()) {
//
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("    <head>");
//            out.println("       <meta chaset=\"UTF-8\"/>");
//            out.println("       <title>Listado de Productos</title>");
//            out.println("    </head>");
//            out.println("    <body>");
//            out.println("        <h1>Listado de Productos!</h1>");
//            usernameOptional.ifPresent(s -> out.println("<div>Hola " + s + "</div>"));
//            out.println("   <table>");
//            out.println("       <tr>");
//            out.println("           <th>id</th>");
//            out.println("           <th>nombre</th>");
//            out.println("           <th>tipo</th>");
//            usernameOptional.ifPresent(s -> {
//                        out.println("           <th>precio</th>");
//                        out.println("           <th>agregar</th>");
//            });
//            out.println("       </tr>");
//            productos.forEach(p -> {
//                out.println("       <tr>");
//                out.println("           <td>" + p.getId() + "</td>");
//                out.println("           <td>" + p.getNombre() + "</td>");
//                out.println("           <td>" + p.getTipo() + "</td>");
//                usernameOptional.ifPresent(s -> {
//                    out.println("           <td>$ " + p.getPrecio() + "</td>");
//                    out.println("           <td><a href=\""
//                            + req.getContextPath()
//                            + "/carro/agregar?id="
//                            + p.getId() + "\">agregar al carro</a></td>");
//                });
//                out.println("       </tr>");
//            });
//            out.println("   </table>");
//            out.println("   <p>" + mensajeGlobal + "</p>");
//            out.println("   <p>" + mensajeRequest + "</p>");
//            out.println("    </body>");
//            out.println("</html>");
//        }
//

    }
}
