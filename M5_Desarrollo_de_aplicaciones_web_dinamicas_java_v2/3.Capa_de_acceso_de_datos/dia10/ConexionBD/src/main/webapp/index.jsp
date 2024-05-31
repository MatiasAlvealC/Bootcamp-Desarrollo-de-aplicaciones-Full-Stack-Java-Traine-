<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Personas</title>
<link rel="stylesheet"
	href="https://unpkg.com/@picocss/pico@latest/css/pico.min.css">
</head>
<body>
	<main class="container">
		<h1>Personas</h1>
		<div class="grid">
			<form name="formulario" action="agregarPersona" method="post">
				<div class="field">
					<input type="text" placeholder="Rut" name="rutPersonas" required>
				</div>
				<div class="field">
					<input type="text" placeholder="Nombre" name="nombre">
				</div>
				<div class="field">
					<input type="text" placeholder="Apellido Paterno" name="apellidoPaterno">
				</div>
				<div class="field">
					<input type="text" placeholder="Apellido Materno" name="apellidoMaterno">
				</div>
				<div class="field">
					<input type="number" placeholder="Edad" name="edad">
				</div>
				<div class="actions">
					<input type="submit" value="Añadir">
				</div>
			</form>
		</div>
	</main>
</body>
</html>