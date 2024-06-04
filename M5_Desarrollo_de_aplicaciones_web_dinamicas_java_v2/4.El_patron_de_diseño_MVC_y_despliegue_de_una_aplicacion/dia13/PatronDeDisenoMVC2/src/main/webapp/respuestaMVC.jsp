<%@ page language="java" contentType="text/html;
charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="models.ModeloMVC"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MVC Respuesta</title>
</head>
<body>
	<%
	ModeloMVC testModelo = (ModeloMVC) request.getAttribute("modelo");
	out.print("Bienvenido, " + testModelo.getEmail());
	%>
</body>
</html>