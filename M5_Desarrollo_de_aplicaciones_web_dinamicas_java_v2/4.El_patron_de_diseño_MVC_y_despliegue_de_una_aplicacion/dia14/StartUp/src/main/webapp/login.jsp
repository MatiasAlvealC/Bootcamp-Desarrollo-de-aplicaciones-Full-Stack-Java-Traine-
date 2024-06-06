<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="cl.model.Usuario"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://unpkg.com/@picocss/pico@latest/css/pico.min.css">
<title>Login</title>
</head>
<body>
	<h2>Iniciar sesión</h2>
	 <div class="container px-4 px-lg-5 mt-5">
	<form action="accion" method="post">
						<input type="hidden" name="action" id="action" value="">
            <div class="form-group">
                <label for="correo">Correo:</label>
                <input type="email" id="correo" name="correo" class="form-control"
                    value="<%=request.getAttribute("usuario") != null ? ((Usuario) request.getAttribute("usuario")).getCorreo() : ""%>">
            </div>
            <div class="form-group">
                <label for="password">Contraseña:</label>
                <input type="password" id="password" name="password" class="form-control"
                    value="<%=request.getAttribute("usuario") != null ? ((Usuario) request.getAttribute("usuario")).getPassword() : ""%>">
            </div>
            <button type="submit" value="loginUsuario"
			onclick="document.getElementById('action').value='loginUsuario';">Iniciar sesión</button>
            <div class="mt-3">
                <%
                String mensaje = (String) request.getAttribute("mensaje");
                if (mensaje != null) {
                    out.print("<p class='text-danger'>" + mensaje + "</p>");
                }
                %>
            </div>
        </form>
    </div>
</body>
</html>