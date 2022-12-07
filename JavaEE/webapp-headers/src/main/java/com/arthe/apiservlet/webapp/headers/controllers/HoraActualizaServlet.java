package com.arthe.apiservlet.webapp.headers.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@WebServlet("/hora-actulizada")
public class HoraActualizaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        resp.setHeader("refresh","1");
        LocalTime hora = LocalTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ss");

        try (PrintWriter out = resp.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("    <head>");
            out.println("       <meta chaset=\"UTF-8\"/>");
            out.println("       <title>La hora actulizada</title>");
            out.println("    </head>");
            out.println("    <body>");
            out.println("        <h1>La hora actulizada!</h1>");
            out.println("<h3>" + hora.format(df) + "</h3>");
            out.println("    </body>");
            out.println("</html>");
        }
    }
}
