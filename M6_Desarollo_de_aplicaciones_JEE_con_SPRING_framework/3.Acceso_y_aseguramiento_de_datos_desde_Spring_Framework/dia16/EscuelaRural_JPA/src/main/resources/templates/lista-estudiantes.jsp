<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<link rel="stylesheet"
	href="https://unpkg.com/@picocss/pico@latest/css/pico.min.css" />
    <title>Lista de Estudiantes</title>
    <meta charset="UTF-8">
</head>
<body>
    <h1>Lista de Estudiantes</h1>
       <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Curso</th>
            </tr>
        </thead>
        <tbody>
            <tr th:each="estudiante : ${estudiantes}">
                <td th:text="${estudiante.id}">ID</td>
                <td th:text="${estudiante.nombre}">Nombre</td>
                <td th:text="${estudiante.curso.nombre}">Curso</td>
                <td>
                  	<a th:href="@{'/estudiante/edit/' + ${estudiante.id}}">Editar</a>
                    <a th:href="@{'/estudiante/delete/' + ${estudiante.id}}">Eliminar</a>
                </td>
            </tr>
        </tbody>
    </table>
    <a th:href="@{/estudiante/new}">Agregar Nuevo Estudiante</a><br>
	<a th:href="@{/}">Volver al menu anterior</a>
</body>
</html>