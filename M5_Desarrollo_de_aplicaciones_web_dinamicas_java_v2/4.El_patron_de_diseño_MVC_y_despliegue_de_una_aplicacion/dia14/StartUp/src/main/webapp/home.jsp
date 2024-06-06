<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="cl.model.Usuario"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://unpkg.com/@picocss/pico@latest/css/pico.min.css"/>
<title>Respuesta login</title>
<style>
    .center-container {
        display: flex;
        flex-direction: column;
        justify-content: center;
        align-items: center;
        height: 100vh;
        text-align: center;
    }
    .mensaje {
        font-size: 2em; /* Larger font size for "Bienvenido" */
        margin-bottom: 20px;
    }
</style>
</head>
<body>
<%
	Usuario usuario = (Usuario) request.getAttribute("usuario");
%>
<div class="center-container">
    <div class="mensaje">
        Bienvenido
    </div>
    <div>
        <%= usuario.getNombre() %><br> (<%= usuario.getCorreo() %>)
    </div>
</div>
</body>
</html>