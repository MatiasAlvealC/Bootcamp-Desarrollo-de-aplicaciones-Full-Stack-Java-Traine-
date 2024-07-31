<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <title>Editar Vehículo</title>
    <meta charset="UTF-8">
</head>
<body>
	<div th:replace="~{navbar}" class="navbar"></div>
    <h1>Editar Vehículo</h1>
    <form th:action="@{/vehiculos/update/{matricula}(matricula=${vehiculo.matricula})}" method="post">
        <div>
            <label for="marca">Marca:</label>
            <input type="text" id="marca" name="marca" th:value="${vehiculo.marca}" />
        </div>
        <div>
            <label for="modelo">Modelo:</label>
            <input type="text" id="modelo" name="modelo" th:value="${vehiculo.modelo}" />
        </div>
        <div>
            <label for="ano">Año:</label>
            <input type="number" id="ano" name="ano" th:value="${vehiculo.ano}" />
        </div>
        <div>
            <label for="color">Color:</label>
            <input type="text" id="color" name="color" th:value="${vehiculo.color}" />
        </div>
        <div>
            <label for="tipo_vehiculo">Tipo de Vehículo:</label>
            <input type="text" id="tipo_vehiculo" name="tipo_vehiculo" th:value="${vehiculo.tipo_vehiculo}" />
        </div>
        <div>
            <label for="usuarioEmail">Email del Usuario:</label>
            <input type="text" id="usuarioEmail" name="usuarioEmail" th:value="${vehiculo.usuario.email}" />
        </div>
        <div>
            <button type="submit">Guardar Cambios</button>
        </div>
    </form>
    <a href="/vehiculos">Regresar a la lista</a>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>

</body>
</html>
