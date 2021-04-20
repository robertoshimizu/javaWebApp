package com.example.DockerJavaWebApp.acao;

import com.example.DockerJavaWebApp.model.Consultant;
import com.example.DockerJavaWebApp.servlet.MockDataBase;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListaConsultores {

    public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MockDataBase banco = new MockDataBase();
        List<Consultant> lista = banco.getConsultants();

        request.setAttribute("consultores", lista);

        RequestDispatcher rd = request.getRequestDispatcher("/listaConsultores.jsp");
        rd.forward(request,response);
    }
}
