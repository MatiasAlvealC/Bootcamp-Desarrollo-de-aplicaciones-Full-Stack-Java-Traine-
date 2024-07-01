<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<link rel="stylesheet"
	href="https://unpkg.com/@picocss/pico@latest/css/pico.min.css" />
<meta charset="UTF-8">
<title>Formulario de Libros</title>
</head>
<body>
	<h1>Nuevo Libro</h1>
    <form action="/biblioteca" method="post">

		<div>
			<label for="name">Nombre:</label> <input type="text" id="nombre"
				name="nombre" />
		</div>
		<div>
			<label for="autor">Autor:</label> <input type="text" id="autor"
				name="autor" />
		</div>
		<div>
			<label for="editorial">Editorial:</label> <input type="text"
				id="editorial" name="editorial" />
		</div>
		<div>
			<label for="disponibilidad">Disponibilidad:</label> <select
				id="disponibilidad" name="disponibilidad">
				<option value="Disponible">Disponible</option>
				<!--<option value="Prestado">Prestado</option>-->
				<!--<option value="Devuelto">Devuelto</option>-->
				<!--<option value="No disponible">No disponible</option>-->
			</select>
		</div>
		<div>
			<button type="submit">Ingresar Libro</button>
		</div>
	</form>
	<a href="/biblioteca">Regresar a la lista de libros</a>
</body>
</html>
