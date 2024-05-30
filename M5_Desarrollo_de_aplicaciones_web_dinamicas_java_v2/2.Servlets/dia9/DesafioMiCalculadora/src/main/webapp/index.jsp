<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculadora</title>
<link rel="stylesheet"
	href="https://unpkg.com/@picocss/pico@latest/css/pico.min.css">
</head>
<body>
	<main class="container">
		<h1>Calculadora</h1>
		<div class="grid">
			<form name="formulario" action="/DesafioMiCalculadora/Servlet"
				method="post">
				<div class="field">
					<input type="number" placeholder="Número 1" name="num1" required>
				</div>
				<div class="field">
					<input type="number" placeholder="Número 2" name="num2" required>
				</div>
				<div class="field">
					<select id="operacion" name="operacion">
						<option value="suma">Suma</option>
						<option value="resta">Resta</option>
						<option value="mult">Multiplicación</option>
						<option value="divi">División</option>
						<option value="ordenar">Ordenar el número</option>
						<option value="parImpar">Cuál es par e impar</option>
					</select>
				</div>
				<div class="actions">
					<input type="submit" value="Calcular">
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
		</div>
	</main>
</body>
</html>