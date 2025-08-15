<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="br.com.carstore.model.Carro" %>
<%
    Carro newCar = (Carro) request.getAttribute("newCar");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Resposta</title>
</head>
<body>
    <pre>{"name":"<%= newCar.getName() %>","color":"<%= newCar.getColor() %>"}</pre>
    <br>
</body>
</html>