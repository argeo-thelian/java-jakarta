package com.arthe.apiservlet.webapp.headers.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

@WebServlet("/cabeceras-request")
public class CabecerasHttpRequest extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");

        String metodoHttp = req.getMethod();
        String requestUri = req.getRequestURI();
        String requestUrl = req.getRequestURL().toString();
        String contextPath = req.getContextPath();
        String servletPath = req.getServletPath();
        String ip = req.getLocalAddr();
        String port = String.valueOf(req.getLocalPort());
        String schema = req.getScheme();
        String locale = String.valueOf(req.getLocale());
        String locales = String.valueOf(req.getLocales());
        String host = req.getHeader("host");
        String url =  schema + "://" + host + contextPath + servletPath;
        String url2 =  schema + "://" + ip + ":" + port + contextPath + servletPath;
        String userCliente = req.getRemoteUser();
        String ipCliente = req.getRemoteAddr();
        String portCliente = String.valueOf(req.getRemotePort());
        String hostCliente = req.getRemoteHost();
        String serverName = req.getServerName();
        String serverPort = String.valueOf(req.getServerPort());

        Map<String,String>  datos = new TreeMap<>();

        datos.put("Addres-IP", ip);
        datos.put("Addres-Port", port);
        datos.put("Addres-Locale", locale);
        datos.put("Addres-Locales", locales);
        datos.put("Construida-URL", url);
        datos.put("Construida-URL2", url2);
        datos.put("Cliente-user", userCliente);
        datos.put("Cliente-ip", ipCliente);
        datos.put("Cliente-port", portCliente);
        datos.put("Cliente-host", hostCliente);
        datos.put("Context-Path", contextPath);
        datos.put("Metodo-Http", metodoHttp);
        datos.put("Request-URI", requestUri);
        datos.put("Request-URL", requestUrl);
        datos.put("Request-HOST", host);
        datos.put("Request-Schema", schema);
        datos.put("Servlet-Path", servletPath);
        datos.put("Server-Name", serverName);
        datos.put("Server-Port", serverPort);

        try (PrintWriter out = resp.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("    <head>");
            out.println("       <meta chaset=\"UTF-8\"/>");
            out.println("       <title>Cabeceras HTTP Request</title>");
            out.println("    </head>");
            out.println("    <body>");
            out.println("        <h1>Cabeceras HTTP Request!</h1>");

            out.println("<ul>");
            for (Map.Entry<String,String> dato: datos.entrySet()){
                String[] keys = dato.getKey().split("-");
                out.println("<li>");
                out.println( keys[0]+ " "+ keys[1] + ": " + dato.getValue());
                out.println("</li>");
            }
            Enumeration<String> headerNames = req.getHeaderNames();
            while (headerNames.hasMoreElements()){
                String cabecera = headerNames.nextElement();
                out.println("<li>" + cabecera + ": " + req.getHeader(cabecera) + "</li>");
            }
            out.println("</ul>");

            out.println("    </body>");
            out.println("</html>");
        }
    }
}
