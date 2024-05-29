<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario de Login</title>
<link rel="stylesheet"
	href="https://unpkg.com/@picocss/pico@latest/css/pico.min.css">
</head>
<body>
	<main class="container">
		<h1>Soy un formulario de Login</h1>
		<div class="grid">
			<form name="formulario" action="/UserLoginServlet/Servlet"
				method="post">
				<div class="field">
					<label for="username">Nombre de usuario</label> <input type="text" name="username">
				</div>
				<div class="field">
					<label for="password">Contraseña</label> <input type="password" name="password">
				</div>
				<div class="actions">
					<input type="submit" value="Enviar">
				</div>
			</form>
		</div>
	</main>
</body>
</html>