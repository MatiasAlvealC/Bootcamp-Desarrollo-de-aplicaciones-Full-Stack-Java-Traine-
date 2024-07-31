<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <title>Editar Estacionamiento</title>
    <meta charset="UTF-8">
</head>
<body>
	<div th:replace="~{navbar}" class="navbar"></div>
    <h1>Editar Estacionamiento</h1>
    <form th:action="@{/estacionamientos/update/{id}(id=${estacionamiento.id})}" method="post">
        <div>
            <label for="nombre">Nombre:</label>
            <input type="text" id="nombre" name="nombre" th:value="${estacionamiento.nombre}" />
        </div>
        <div>
            <label for="direccion">Dirección:</label>
            <input type="text" id="direccion" name="direccion" th:value="${estacionamiento.direccion}" />
        </div>
        <div>
            <label for="capacidad">Capacidad:</label>
            <input type="number" id="capacidad" name="capacidad" th:value="${estacionamiento.capacidad}" />
        </div>
        <div>
            <label for="tarifa_hora">Tarifa por Hora:</label>
            <input type="text" id="tarifa_hora" name="tarifa_hora" th:value="${estacionamiento.tarifa_hora}" />
        </div>
        <div>
            <label for="hora_cierre">Hora de Cierre:</label>
            <input type="text" id="hora_cierre" name="hora_cierre" th:value="${estacionamiento.hora_cierre}" />
        </div>
        <div>
            <button type="submit">Guardar Cambios</button>
        </div>
    </form>
    <a href="/estacionamientos">Regresar a la lista</a>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>
</html>
