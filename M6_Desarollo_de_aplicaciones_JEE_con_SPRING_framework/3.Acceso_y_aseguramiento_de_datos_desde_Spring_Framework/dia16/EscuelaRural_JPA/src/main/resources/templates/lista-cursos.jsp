<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<link rel="stylesheet"
	href="https://unpkg.com/@picocss/pico@latest/css/pico.min.css" />
    <title>Lista de Cursos</title>
    <meta charset="UTF-8">
</head>
<body>
    <h1>Lista de Cursos</h1>
       <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
				<th>Descripcion</th>
				<th>Estudiantes</th>
            </tr>
        </thead>
        <tbody>
            <tr th:each="curso : ${cursos}">
                <td th:text="${curso.id}">ID</td>
                <td th:text="${curso.nombre}">Nombre</td>
                <td th:text="${curso.descripcion}">Descripcion</td>
				<td>
					<ul>
				    	<li th:each="estudiante : ${curso.estudiantes}">
				        	<span th:text="${estudiante.nombre}"></span>
				     	</li>
				    </ul>
				</td>
                <td>
                  	<a th:href="@{'/curso/edit/' + ${curso.id}}">Editar</a>
                    <a th:href="@{'/curso/delete/' + ${curso.id}}">Eliminar</a>
                </td>
            </tr>
        </tbody>
    </table>
    <a th:href="@{/curso/new}">Agregar Nuevo Curso</a><br>
	<a th:href="@{/}">Volver al menu anterior</a>
</body>
</html>