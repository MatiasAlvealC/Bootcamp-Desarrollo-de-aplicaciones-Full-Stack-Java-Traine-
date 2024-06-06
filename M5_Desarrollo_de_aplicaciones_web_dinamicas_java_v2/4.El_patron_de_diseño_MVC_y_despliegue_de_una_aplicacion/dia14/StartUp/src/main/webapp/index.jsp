<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://unpkg.com/@picocss/pico@latest/css/pico.min.css">
<title>Inicio</title>
</head>
<body>
	<h2>Bienvenidos</h2>
	<p>Estamos emocionados de tenerte aquí. Por favor, elige una opción
		para continuar.</p>
	<form action="accion" method="post">
		<input type="hidden" name="action" id="action" value="">
		<button type="submit" value="register"
			onclick="document.getElementById('action').value='register';">Registro</button>
		<button type="submit" value="login"
			onclick="document.getElementById('action').value='login';">Iniciar sesión</button>
	</form>
	<script type="text/javascript">
    window.onload = function() {
        var urlParams = new URLSearchParams(window.location.search);
        var mensaje = urlParams.get('mensaje');
        if (mensaje) {
            alert(mensaje);
        }
    }
</script>
</body>
</html>