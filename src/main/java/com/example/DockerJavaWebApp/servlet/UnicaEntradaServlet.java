package com.example.DockerJavaWebApp.servlet;

import com.example.DockerJavaWebApp.acao.ListaConsultores;
import com.example.DockerJavaWebApp.model.Consultant;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;


@WebServlet(name = "UnicaEntradaServlet", value = "/entrada")
public class UnicaEntradaServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // A idéia é ter um único servlet de entrada, que recebe um parametro "acao"
        // e a partir daí, o código abaixo direciona para a ação discriminada na requisição

        String paramAcao = request.getParameter("acao");

        if(paramAcao.equals("ListaConsultores")){
            System.out.println("listando consultores");
            ListaConsultores lista = new ListaConsultores();

            lista.executa(request,response);


        } else if(paramAcao.equals("AdicionandoConsultor")){
            System.out.println(request.getParameter("nome"));
            RequestDispatcher rd = request.getRequestDispatcher("/output.jsp");
            rd.forward(request,response);
        }
    }


}
