package com.example.DockerJavaWebApp;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/MyServlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Resposta do servlet a sua requisição http - GET request";
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        request.setAttribute("message",message);
        RequestDispatcher rd = request.getRequestDispatcher("/output.jsp");

        rd.forward(request,response);
    }

    public void destroy() {
    }
}