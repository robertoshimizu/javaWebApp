package com.example.DockerJavaWebApp.servlet;

import com.example.DockerJavaWebApp.model.Consultant;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "ListaConsultoresServlet", value = "/listaConsultores")
public class ListaConsultoresServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        MockDataBase banco = new MockDataBase();
        List<Consultant> lista = banco.getConsultants();

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<ul>");

        for (Consultant consultant : lista) {
            out.println("<li> " + consultant.getName() + "</li>");
        }

        out.println("</ul>");
        out.println("</body></html>");

    }


}
