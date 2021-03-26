<%--
  Created by IntelliJ IDEA.
  User: rober
  Date: 26/03/21
  Time: 20:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Servlet Output</title>
</head>
<body>
<%
    String message = (String) request.getAttribute("message");
%>

<h1>
    <%=message%>
</h1>

</body>
</html>
