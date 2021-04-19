package com.example.DockerJavaWebApp.servlet;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {
    private String nome;

    public void init() {
        nome = "Meryl Hawkins";
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        request.setAttribute("nome",nome);
        RequestDispatcher rd = request.getRequestDispatcher("/output.jsp");

        rd.forward(request,response);
    }

    public void destroy() {
    }
}