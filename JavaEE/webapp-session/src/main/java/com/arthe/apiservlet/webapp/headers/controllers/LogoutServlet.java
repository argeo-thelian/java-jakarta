package com.arthe.apiservlet.webapp.headers.controllers;

import com.arthe.apiservlet.webapp.headers.services.LoginService;
import com.arthe.apiservlet.webapp.headers.services.LoginServiceSessionImpl;
import com.arthe.apiservlet.webapp.headers.services.LoginSeviceCookieImpl;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.Optional;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        LoginService auth = new LoginServiceSessionImpl();
        Optional<String> username = auth.getUsername(req);
        if (username.isPresent()){
            HttpSession session = req.getSession();
            session.invalidate();
        }
        resp.sendRedirect(req.getContextPath() + "/login.html");
    }

    public void getdato(String op){
        Long c = new Long("34232");
        int b=757;
        Integer b4= new Integer(b);
        switch (5){
            default:
                System.out.println(3);
            case 4*2:
                System.out.println(2);
        }
    }
}
