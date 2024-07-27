<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<link rel="stylesheet"
	href="https://unpkg.com/@picocss/pico@latest/css/pico.min.css" />
    <title>Inicio</title>
    <meta charset="UTF-8">
</head>
<body>
    <h1>Bienvenido al Sistema de Reclamos del transporte</h1>
    <a role="button" th:href="@{/usuario/iniciarSesion}" class="contrast">Iniciar sesion</a><br><br>
    <a role="button" th:href="@{/usuario/registrarse}" class="contrast">Registrarse</a>
</body>
</html>