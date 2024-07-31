<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <title>Lista de Vehículos</title>
    <meta charset="UTF-8">
</head>
<body>
	<div th:replace="~{navbar}" class="navbar"></div>
    <h1>Lista de Vehículos</h1>
    <a href="/vehiculos/new">Agregar Nuevo Vehículo</a>
	<table border="1">
	    <thead>
	        <tr>
	            <th>Matricula</th>
	            <th>Marca</th>
	            <th>Modelo</th>
	            <th>Año</th>
	            <th>Color</th>
	            <th>Tipo Vehiculo</th>
	            <th>Acciones</th>
	        </tr>
	    </thead>
	    <tbody>
	        <tr th:each="vehiculo : ${vehiculos}">
	            <td th:text="${vehiculo.matricula}">Matricula</td>
	            <td th:text="${vehiculo.marca}">Marca</td>
	            <td th:text="${vehiculo.modelo}">Modelo</td>
	            <td th:text="${vehiculo.ano}">Año</td>
	            <td th:text="${vehiculo.color}">Color</td>
	            <td th:text="${vehiculo.tipo_vehiculo}">Tipo Vehiculo</td>
	            <td>
	                <a th:href="@{/vehiculos/edit/{matricula}(matricula=${vehiculo.matricula})}">editar</a>
	                <a th:href="@{/vehiculos/delete/{matricula}(matricula=${vehiculo.matricula})}" onclick="return confirm('¿estás seguro?')">eliminar</a>
	            </td>
	        </tr>
	    </tbody>
	</table>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>
</html>