<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<link rel="stylesheet"
	href="https://unpkg.com/@picocss/pico@latest/css/pico.min.css" />
    <title>Editar Estudiante</title>
    <meta charset="UTF-8">
</head>
<body>
    <h1>Editar Estudiante</h1>
    <form th:action="@{/estudiante/update/{id}(id=${estudiante.id})}" method="post">
        <div>
            <label for="nombre">Nombre:</label>
            <input type="text" id="nombre" name="nombre" th:value="${estudiante.nombre}" />
        </div>
        <div>
            <label for="nombreCurso">Curso:</label>
            <input type="text" id="nombreCurso" name="nombreCurso" th:value="${estudiante.curso.nombre}" />
        </div>
        <div>
            <button type="submit">Guardar Cambios</button>
        </div>
    </form>
    <a th:href="@{/estudiantes}">Regresar a la lista</a>
</body>
</html>