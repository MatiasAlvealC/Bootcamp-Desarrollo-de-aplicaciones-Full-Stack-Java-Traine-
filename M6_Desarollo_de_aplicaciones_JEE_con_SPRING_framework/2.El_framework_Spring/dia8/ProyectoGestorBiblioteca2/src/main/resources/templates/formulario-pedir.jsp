<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<link rel="stylesheet"
	href="https://unpkg.com/@picocss/pico@latest/css/pico.min.css" />
<meta charset="UTF-8">
<title>Formulario de Solicitud de Libros</title>
</head>
<body>
	<h1>Solicitar Libro</h1>
    <form th:action="@{/biblioteca/solicitar/{id}(id=${libro.id})}" th:object="${libro}" method="post">

		<div>
			<label for="name">Nombre:</label> 
			<input type="text" id="nombre" th:field="*{nombre}" />
		</div>
		<div>
			<label for="autor">Autor:</label> <input type="text" id="autor"
				th:field="*{autor}" />
		</div>
		<div>
			<label for="editorial">Editorial:</label> <input type="text"
				id="editorial"  th:field="*{editorial}" />
		</div>
		<div>
			<label for="disponibilidad">Disponibilidad:</label> <select
				id="disponibilidad" name="disponibilidad">
				<option value="Prestado">Prestado</option>
				<!--<option value="Devuelto">Devuelto</option>-->
				<!--<option value="No disponible">No disponible</option>-->
			</select>
		</div>
		<div>
			<button type="submit">Pedir Libro</button>
		</div>
	</form>
	<a href="/biblioteca">Regresar a la lista de libros</a>
</body>
</html>
