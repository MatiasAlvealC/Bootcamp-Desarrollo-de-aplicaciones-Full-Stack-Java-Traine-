<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<link rel="stylesheet"
	href="https://unpkg.com/@picocss/pico@latest/css/pico.min.css" />
    <title>Inicio</title>
    <meta charset="UTF-8">
</head>
<body>
    <h1>Bienvenido al Sistema de la Escuela</h1>
    <a role="button" th:href="@{/estudiante}" class="contrast">Ver Estudiantes</a>
    <a role="button" th:href="@{/curso}" class="contrast">Ver Cursos</a>
</body>
</html>
