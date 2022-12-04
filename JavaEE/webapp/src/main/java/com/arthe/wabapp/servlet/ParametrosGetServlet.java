package com.arthe.wabapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/paramtros/url-get")
public class ParametrosGetServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String saludo = req.getParameter("saludo");
        String nombre = req.getParameter("nombre");
        Integer codigo = Integer.parseInt(req.getParameter("codigo") == null ? "0" : req.getParameter("codigo"));
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("     <head>");
        out.println("         <meta charset=\"UTF-8\">");
        out.println("         <title>Parámetros Get de la url</title>");
        out.println("     </head>");
        out.println("     <body>");
        out.println("         <h1>Parámetros Get de la url!</h1>");
        if (saludo != null && nombre != null) {
            out.println("         <h2>El saludo enviado es: " + saludo + " " + nombre + " </h2>");
        }else if (saludo != null) {
            out.println("         <h2>El saludo enviado es: "+ saludo +  " </h2>");
        }else if (nombre != null ){
            out.println("         <h2>El nombre enviado es: "+ nombre +  " </h2>");
        }else {
            out.println("         <h2>No se han pasado parámetros.</h2>");
        }
        if (codigo != 0){
            out.println("         <h3>El codigo enviado es " + codigo + ".</h2>");
        }else{
            out.println("         <h3>No hay codigo.</h2>");
        }


        out.println("     </body>");
        out.println("     </head>");
        out.println("</html>");
        out.close();
    }
}
