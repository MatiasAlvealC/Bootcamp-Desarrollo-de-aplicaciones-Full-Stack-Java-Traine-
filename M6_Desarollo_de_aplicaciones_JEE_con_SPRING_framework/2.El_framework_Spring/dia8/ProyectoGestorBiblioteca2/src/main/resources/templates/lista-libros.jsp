<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<link rel="stylesheet"
	href="https://unpkg.com/@picocss/pico@latest/css/pico.min.css" />
<title>Lista de Libros</title>
<meta charset="UTF-8">

</head>
<body>
	<h1>Lista de Libros</h1>
	<form th:action="@{/biblioteca/search}" method="get">
		<input type="text" name="keyword" placeholder="Buscar libros..." />
		<button type="submit">Buscar</button>
	</form>
	<table border="1">
		<thead>
			<tr>
				<th>ID</th>
				<th>Nombre</th>
				<th>Autor</th>
				<th>Editorial</th>
				<th>Disponibilidad</th>
				<th>Acciones</th>
			</tr>
		</thead>
		<tbody>
			<tr th:each="libro : ${libros}">
				<td th:text="${libro.id}">ID</td>
				<td th:text="${libro.nombre}">Nombre</td>
				<td th:text="${libro.autor}">Autor</td>
				<td th:text="${libro.editorial}">Editoria</td>
				<td th:text="${libro.disponibilidad}">Disponibilidad</td>
				<td>
					<a th:href="@{'/biblioteca/pedir/' + ${libro.id}}">Pedir</a>
					<a th:href="@{'/biblioteca/devolver/' + ${libro.id}}">Devolver</a>
				</td>
			</tr>
		</tbody>
	</table>
	<a th:href="@{/biblioteca/new}">Agregar Nuevo Libro</a><br></br>
	<a th:href="@{/biblioteca/prestamos}">Ver historial de prestamos</a>
</body>
</html>