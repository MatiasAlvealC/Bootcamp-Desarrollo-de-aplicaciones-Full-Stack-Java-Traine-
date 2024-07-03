<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<link rel="stylesheet"
	href="https://unpkg.com/@picocss/pico@latest/css/pico.min.css" />
    <title>Lista de Pacientes</title>
    <meta charset="UTF-8">
</head>
<body>
    <h1>Lista de Pacientes</h1>
       <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Email</th>
                <th>Edad</th>
                <th>Fecha Ingreso</th>
                <th>Acciones</th>
            </tr>
        </thead>
        <tbody>
            <tr th:each="paciente : ${pacientes}">
                <td th:text="${paciente.id}">ID</td>
                <td th:text="${paciente.name}">Nombre</td>
                <td th:text="${paciente.email}">Email</td>
                <td th:text="${paciente.edad}">Edad</td>
                <td th:text="${paciente.fechaIngreso}">Fecha Ingreso</td>             
                <td>
                  	<a th:href="@{'/edit/' + ${paciente.id}}">Editar</a>
                    <a th:href="@{'/delete/' + ${paciente.id}}">Eliminar</a>
                </td>
            </tr>
        </tbody>
    </table>
    <a th:href="@{/new}">Agregar Nuevo Usuario</a>
</body>
</html>