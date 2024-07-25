<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Lista de Usuarios</title>
    <meta charset="UTF-8">
</head>
<body>
    <h1>Lista de Usuarios</h1>
       <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Email</th>
                <th>Acciones</th>
            </tr>
        </thead>
        <tbody>
            <tr th:each="user : ${usuarios}">
                <td th:text="${user.id}">ID</td>
                <td th:text="${user.email}">Email</td>
                <td>
                    <a th:href="@{'/users/edit/' + ${user.id}}">Editar</a>
                    <a th:href="@{'/users/delete/' + ${user.id}}">Eliminar</a>
                </td>
            </tr>
        </tbody>
    </table>
    <a th:href="@{/users/new}">Agregar Nuevo Usuario</a>
</body>
</html>
