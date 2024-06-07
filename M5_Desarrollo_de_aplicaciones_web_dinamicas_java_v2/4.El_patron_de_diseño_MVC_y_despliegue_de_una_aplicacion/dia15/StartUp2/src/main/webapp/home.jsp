<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="cl.model.Usuario"%>
<%@ page import="java.util.List"%>
<%@ page import="javax.servlet.http.HttpSession"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://unpkg.com/@picocss/pico@latest/css/pico.min.css" />
<title>Lista usuarios</title>
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
HttpSession currentSession = request.getSession(false);
Usuario usuario0 = (currentSession != null) ? (Usuario) currentSession.getAttribute("usuario") : null;
if (usuario0 == null) {
    response.sendRedirect("login.jsp");
    return;
}
%>
	<div class="center-container">
		<div class="mensaje">Bienvenido</div>
		<div>
			<%= usuario0.getNombre() %><br> (<%= usuario0.getCorreo() %>)
		</div>
	</div>
	<h2>Lista de Usuario</h2>
	<a href="registros.jsp">Nuevo Usuario</a>
	<table border="1">
		<thead>
			<tr>
				<th>ID</th>
				<th>Correo</th>
				<th>Nick</th>
				<th>Nombre</th>
				<th>Peso</th>
		
			</tr>
		</thead>
		<tbody>
			<%
			List<Usuario>  listUsuario = (List<Usuario>) request.getAttribute("listUsuario");
                for (Usuario usuario : listUsuario) {
            %>
			<tr>
				<td><%= usuario.getId() %></td>
				<td><%= usuario.getCorreo() %></td>
				<td><%= usuario.getNick() %></td>
				<td><%= usuario.getNombre() %></td>
				<td><%= usuario.getPeso() %></td>
				<td><a href="edit?correo=<%= usuario.getCorreo() %>">Editar</a> <a
					href="delete?id=<%= usuario.getId() %>"
					onclick="return confirm('¿Estás seguro de que quieres eliminar este proveedor?');">Eliminar</a>
				</td>
			</tr>
			<%
                }
            %>
		</tbody>
	</table>
</body>
</html>