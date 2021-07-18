<%@ page import="com.example.DockerJavaWebApp.model.Consultant" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: rober
  Date: 19/04/21
  Time: 17:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lista Consultores</title>
</head>
<body>

    Lista de consultores: <br />

    <ul>
        <%
            List<Consultant> lista = (List<Consultant>)request.getAttribute("consultores");
            for (Consultant consultant : lista) {
        %>
            <li><%= consultant.getName() %></li>
        <%
            }
        %>

    </ul>
</body>
</html>
