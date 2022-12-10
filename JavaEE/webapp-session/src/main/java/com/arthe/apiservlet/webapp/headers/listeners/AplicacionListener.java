package com.arthe.apiservlet.webapp.headers.listeners;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;


@WebListener
public class AplicacionListener implements ServletContextListener,
        ServletRequestListener, HttpSessionListener {


    private ServletContext servletContext;

    //ServletContextListener
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        sce.getServletContext().log("Inicializando la aplicación.");
        servletContext = sce.getServletContext();
    }

    //ServletContextListener
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        servletContext.log("Destruyendo la aplicación.");
    }

    //ServletRequestEvent
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        sre.getServletContext().log("Inicializando el request!");
    }

    //ServletRequestEvent
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        sre.getServletContext().log("Destruyendo el request!");
    }


       //HttpSessionEvent
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        servletContext.log("Inicialiazando la sesión http.");
    }

    //HttpSessionEvent
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        servletContext.log("Inicialiazando la sesión http.");
    }
}
