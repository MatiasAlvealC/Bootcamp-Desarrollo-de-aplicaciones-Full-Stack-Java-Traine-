<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="cl.model.Proveedor"%>
<%@ page import="java.util.List"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://unpkg.com/@picocss/pico@latest/css/pico.min.css">
<title>Lista de Proveedores</title>
</head>
<body>
	<h2>Lista de Proveedores</h2>
	<a href="new">Nuevo Proveedor</a>
	<table border="1">
		<thead>
			<tr>
				<th>ID</th>
				<th>Nombre</th>
				<th>rut</th>
				<th>direccion</th>
				<th>correo</th>
				<th>telefono</th>
				<th>Contacto</th>
				<th>Telefono contacto</th>
			</tr>
		</thead>
		<tbody>
			<%
                List<Proveedor> listProveedor = (List<Proveedor>) request.getAttribute("listProveedor");
                for (Proveedor proveedor : listProveedor) {
            %>
			<tr>
				<td><%= proveedor.getId() %></td>
				<td><%= proveedor.getNombre() %></td>
				<td><%= proveedor.getRut() %></td>
				<td><%= proveedor.getDireccion() %></td>
				<td><%= proveedor.getCorreo() %></td>
				<td><%= proveedor.getTelefono() %></td>
				<td><%= proveedor.getContacto() %></td>
				<td><%= proveedor.getTelefono_contacto() %></td>
				<td>
                    <a href="edit?id=<%= proveedor.getId() %>">Editar</a>
                    <a href="delete?id=<%= proveedor.getId() %>" onclick="return confirm('¿Estás seguro de que quieres eliminar este proveedor?');">Eliminar</a>
                </td>
			</tr>
			<%
                }
            %>
		</tbody>
	</table>
</body>
</html>