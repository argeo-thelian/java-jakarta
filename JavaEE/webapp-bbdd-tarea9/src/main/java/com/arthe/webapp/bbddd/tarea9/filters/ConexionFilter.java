package com.arthe.webapp.bbddd.tarea9.filters;

import com.arthe.webapp.bbddd.tarea9.services.ServiceJdbcExecption;
import com.arthe.webapp.bbddd.tarea9.utils.ConexionBaseDatos;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

@WebFilter("/*")
public class ConexionFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        try (Connection conn = ConexionBaseDatos.getConnection()) {
            if (conn.getAutoCommit()){
                conn.setAutoCommit(false);
            }
            try {
                request.setAttribute("conn",conn);
                chain.doFilter(request,response);
                conn.commit();
            }catch (SQLException | ServiceJdbcExecption e){
                conn.rollback();
                ((HttpServletResponse)response).sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, e.getMessage());
                e.getStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
