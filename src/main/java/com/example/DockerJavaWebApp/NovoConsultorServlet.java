package com.example.DockerJavaWebApp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "NovoConsultorServlet", value = "/novoConsultor")
public class NovoConsultorServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Cadastrando novo consultor");

        String nomeConsultor = request.getParameter("nome");
        Consultant consultant = new Consultant();
        consultant.setName(nomeConsultor);

        MockDataBase db = new MockDataBase();
        db.adiciona(consultant);

        PrintWriter out = response.getWriter();
        out.println("<html><body>Consultor " + nomeConsultor + " cadastrado com sucesso!</body></html>");
    }
}
