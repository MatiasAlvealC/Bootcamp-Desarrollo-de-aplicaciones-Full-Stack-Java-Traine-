<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="cl.model.Proveedor"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://unpkg.com/@picocss/pico@latest/css/pico.min.css">
<title>Formulario edición Proveedores</title>
</head>
<body>
	<h2>Cambios proveedor</h2>
	<form
		action="update" method="post">
		        <input type="hidden" id="id" name="id" value="<%= request.getAttribute("proveedor") != null ? ((Proveedor) request.getAttribute("proveedor")).getId() : "" %>">
		<label for="nombre">Nombre:</label> <input type="text" id="nombre"
			name="nombre"
			value="<%=request.getAttribute("proveedor") != null ? ((Proveedor) request.getAttribute("proveedor")).getNombre() : ""%>"><br> 
			<label for="rut">Rut:</label> <input type="text" id="rut"
			name="rut" value="<%=request.getAttribute("proveedor") != null ? ((Proveedor) request.getAttribute("proveedor")).getRut() : ""%>"><br>
		<label for="direccion">Direccion:</label> <input type="text"
			id="direccion" name="direccion"
			value="<%=request.getAttribute("proveedor") != null ? ((Proveedor) request.getAttribute("proveedor")).getDireccion(): ""%>"><br>
		<label for="correo">Correo:</label> <input type="email" id="correo"
			name="correo"
			value="<%=request.getAttribute("proveedor") != null ? ((Proveedor) request.getAttribute("proveedor")).getCorreo() : ""%>"><br>
		<label for="telefono">Telefono:</label> <input type="text"
			id="telefono" name="telefono"
			value="<%=request.getAttribute("proveedor") != null ? ((Proveedor) request.getAttribute("proveedor")).getTelefono() : ""%>"><br>
		<label for="contacto">Contacto:</label> <input type="text"
			id="contacto" name="contacto"
			value="<%=request.getAttribute("proveedor") != null ? ((Proveedor) request.getAttribute("proveedor")).getContacto() : ""%>"><br>
		<label for="telefono_contacto">Telefono del contacto:</label> <input
			type="text" id="telefono_contacto" name="telefono_contacto"
			value="<%=request.getAttribute("proveedor") != null ? ((Proveedor) request.getAttribute("proveedor")).getTelefono_contacto(): ""%>"><br>
		<input type="submit" value="Cambiar">
		<div>
			<%
			String mensaje = (String) request.getAttribute("mensaje");
			if (mensaje != null) {
				out.print("<p>" + mensaje + "</p>");
			}
			%>
		</div>
	</form>
</body>
</html>