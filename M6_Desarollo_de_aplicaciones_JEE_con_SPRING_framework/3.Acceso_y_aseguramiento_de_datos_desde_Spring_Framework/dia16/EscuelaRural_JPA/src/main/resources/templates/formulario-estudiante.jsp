<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<link rel="stylesheet"
	href="https://unpkg.com/@picocss/pico@latest/css/pico.min.css" />
	 <meta charset="UTF-8">
    <title>Formulario de Estudiante</title>
</head>
<body>
    <h1 >Nuevo Estudiante</h1>
    <form action="/estudiante" method="post">
       
        <div>
            <label for="nombre">Nombre:</label>
            <input type="text" id="nombre" name="nombre" />
        </div>
        <div>
            <label for="nombreCurso">Curso:</label>
            <input type="text" id="nombreCurso" name="nombreCurso" />
        </div>
		<div>
			<button type="submit" >Ingresar Estudiante</button>
		</div>
    </form>
    <a href="/estudiante">Regresar a la lista</a>
</body>
</html>
