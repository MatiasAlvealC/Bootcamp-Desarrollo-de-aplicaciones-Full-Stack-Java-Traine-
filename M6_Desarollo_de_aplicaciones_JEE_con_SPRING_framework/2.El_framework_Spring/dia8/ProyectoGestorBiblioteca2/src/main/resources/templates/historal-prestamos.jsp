<html xmlns:th="http://www.thymeleaf.org">
<head>
<link rel="stylesheet"
	href="https://unpkg.com/@picocss/pico@latest/css/pico.min.css" />
<title>Historial de Libros</title>
<meta charset="UTF-8">

</head>
<body>
	<h1>Historial de Libros</h1>
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
				<th>Fecha</th>
			</tr>
		</thead>
		<tbody>
			<tr th:each="libroPedido : ${librosPedidos}">
				<td th:text="${libroPedido.id}">ID</td>
				<td th:text="${libroPedido.nombre}">Nombre</td>
				<td th:text="${libroPedido.autor}">Autor</td>
				<td th:text="${libroPedido.editorial}">Editoria</td>
				<td th:text="${libroPedido.disponibilidad}">Disponibilidad</td>
				<td th:text="${libroPedido.fecha}">Fecha</td>
			</tr>
		</tbody>
	</table>
	<a th:href="@{/biblioteca}">Volver a la lista</a>
	</body>
</html>