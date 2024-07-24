<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<link rel="stylesheet"
	href="https://unpkg.com/@picocss/pico@latest/css/pico.min.css" />
    <title>Editar Curso</title>
    <meta charset="UTF-8">
</head>
<body>
    <h1>Editar Curso</h1>
    <form th:action="@{/curso/update/{id}(id=${curso.id})}" th:object="${curso}" method="post">
        <div>
            <label for="nombre">Nombre:</label>
            <input type="text" id="nombre" th:field="*{nombre}" />
        </div>
        <div>
            <label for="descripcion">Descripcion:</label>
            <input type="text" id="descripcion" th:field="*{descripcion}" />
        </div>
        <div>
            <button type="submit">Guardar Cambios</button>
        </div>
    </form>
    <a th:href="@{/curso}">Regresar a la lista</a>
</body>
</html>