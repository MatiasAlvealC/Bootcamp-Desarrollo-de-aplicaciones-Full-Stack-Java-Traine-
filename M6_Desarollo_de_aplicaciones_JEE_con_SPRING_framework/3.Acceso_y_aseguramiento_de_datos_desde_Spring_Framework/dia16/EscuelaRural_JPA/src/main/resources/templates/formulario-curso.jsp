<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<link rel="stylesheet"
	href="https://unpkg.com/@picocss/pico@latest/css/pico.min.css" />
	 <meta charset="UTF-8">
    <title>Formulario de Curso</title>
</head>
<body>
    <h1 >Nuevo Curso</h1>
    <form action="/curso" method="post">
       
        <div>
            <label for="nombre">Nombre:</label>
            <input type="text" id="nombre" name="nombre" />
        </div>
        <div>
            <label for="descripcion">Descripcion:</label>
            <input type="text" id="descripcion" name="descripcion" />
        </div>
        <div>
            <button type="submit" >Ingresar Curso</button>
        </div>
    </form>
    <a href="/curso">Regresar a la lista</a>
</body>
</html>
