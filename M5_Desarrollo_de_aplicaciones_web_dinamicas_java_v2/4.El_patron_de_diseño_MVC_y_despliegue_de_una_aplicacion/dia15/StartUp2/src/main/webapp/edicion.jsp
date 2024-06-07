<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="cl.model.Usuario"%>
<%@ page import="cl.model.Direccion"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://unpkg.com/@picocss/pico@latest/css/pico.min.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css"
	rel="stylesheet" />
<title>Formulario Edición de Registro</title>
</head>
<body>
	<h2>Cambios en usuario</h2>
	<form action="update" method="post">
		<div class="container px-4 px-lg-5 mt-5">
			<div class="row g-3">		
				<div class="col-12">
						<label for="correo">Correo:</label> <input type="hidden"
							id="correo" name="correo" class="form-control"
							value="<%=request.getAttribute("usuario") != null ? ((Usuario) request.getAttribute("usuario")).getCorreo(): ""%>">
				</div>
				<div class="col-12">
						<label for="nick">Nick:</label> <input type="text" id="nick"
							name="nick" class="form-control"
							value="<%=request.getAttribute("usuario") != null ? ((Usuario) request.getAttribute("usuario")).getNick() : ""%>">
				</div>
				<div class="col-12">
						<label for="nombre">Nombre:</label> <input type="text" id="nombre"
							name="nombre" class="form-control"
							value="<%=request.getAttribute("usuario") != null ? ((Usuario) request.getAttribute("usuario")).getNombre() : ""%>">
				</div>
				<div class="col-12">
						<label for="password">Password:</label> <input type="password"
							id="password" name="password" class="form-control"
							value="<%=request.getAttribute("usuario") != null ? ((Usuario) request.getAttribute("usuario")).getPassword() : ""%>">
				</div>
				<div class="col-12">
						<label for="peso">Peso (Kg):</label> <input type="number" id="peso"
							name="peso" class="form-control"
							value="<%=request.getAttribute("usuario") != null ? ((Usuario) request.getAttribute("usuario")).getPeso() : ""%>">
				</div>
						<div class="col-6">
						<label for="direccion">Dirección</label>
								<label for="nombre_calle">Calle:</label> <input type="text"
									id="nombre_calle" name="nombre_calle" class="form-control"
									value="<%=request.getAttribute("direccion") != null ? ((Direccion) request.getAttribute("direccion")).getNombre() : ""%>">
						</div>
						<div class="col-6">
								<label for="numeracion">Numeración:</label> <input type="number"
									id="numeracion" name="numeracion" class="form-control"
									value="<%=request.getAttribute("direccion") != null ? ((Direccion) request.getAttribute("direccion")).getNumeracion(): ""%>">
							</div>
						</div>
			<div class="col-12">
					<input type="submit" value="cambiar">
			</div>
		</div>
			
		<div>
			<%
			String mensaje = (String) request.getAttribute("mensaje");
			if (mensaje != null) {
				out.print("<p>" + mensaje + "</p>");
			}
			%>
		</div>
	</form>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>