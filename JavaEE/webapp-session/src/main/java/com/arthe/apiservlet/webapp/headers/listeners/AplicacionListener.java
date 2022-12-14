package com.arthe.apiservlet.webapp.headers.listeners;

import com.arthe.apiservlet.webapp.headers.models.Carro;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSession;
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
        servletContext.setAttribute("mensaje","algun valor global de la app.");
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
        sre.getServletRequest().setAttribute("mensaje","guardar algun valor en el request.");
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
        Carro carro = new Carro();
        HttpSession session = se.getSession();
        session.setAttribute("carro",carro);
    }

    //HttpSessionEvent
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        servletContext.log("Destrutendo la sesión http.");
    }
}
