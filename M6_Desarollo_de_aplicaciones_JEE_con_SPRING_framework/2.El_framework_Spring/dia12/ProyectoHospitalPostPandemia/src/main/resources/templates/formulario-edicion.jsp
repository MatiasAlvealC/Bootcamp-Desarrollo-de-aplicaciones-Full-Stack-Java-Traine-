<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<link rel="stylesheet"
	href="https://unpkg.com/@picocss/pico@latest/css/pico.min.css" />
    <title>Editar Pacientes</title>
    <meta charset="UTF-8">
</head>
<body>
    <h1>Editar Paciente</h1>
    <form th:action="@{/update/{id}(id=${paciente.id})}" th:object="${paciente}" method="post">
        <div>
            <label for="name">Nombre:</label>
            <input type="text" id="nombre" th:field="*{name}" />
        </div>
        <div>
            <label for="email">Email:</label>
            <input type="email" id="email" th:field="*{email}" />
        </div>
        <div>
            <label for="edad">Edad:</label>
            <input type="number" id="edad" th:field="*{edad}" />
        </div>
        <div>
            <label for="fecha_ingreso">Fecha Ingreso:</label>
            <input type="date" id="fecha_ingreso" th:field="*{fechaIngreso}" />
        </div>
        <div>
            <button type="submit">Guardar Cambios</button>
        </div>
    </form>
    <a th:href="@{/}">Regresar a la lista</a>
</body>
</html>