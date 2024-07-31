<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <title>Lista de Estacionamientos</title>
    <meta charset="UTF-8">
</head>
<body>
	<div th:replace="~{navbar}" class="navbar"></div>
    <h1>Lista de Estacionamientos</h1>
    <a href="/estacionamientos/new">Agregar Nuevo Estacionamiento</a>
	<table border="1">
	    <thead>
	        <tr>
	            <th>Nombre</th>
	            <th>Dirección</th>
	            <th>Capacidad</th>
	            <th>Tarifa por Hora</th>
	            <th>Hora de Cierre</th>
	            <th>Acciones</th>
	        </tr>
	    </thead>
	    <tbody>
	        <tr th:each="estacionamiento : ${estacionamientos}">
	            <td th:text="${estacionamiento.nombre}">Nombre</td>
	            <td th:text="${estacionamiento.direccion}">Dirección</td>
	            <td th:text="${estacionamiento.capacidad}">Capacidad</td>
	            <td th:text="${estacionamiento.tarifa_hora}">Tarifa por Hora</td>
	            <td th:text="${estacionamiento.hora_cierre}">Hora de Cierre</td>
	            <td>
	                <a th:href="@{/estacionamientos/edit/{id}(id=${estacionamiento.id})}">editar</a>
	                <a th:href="@{/estacionamientos/delete/{id}(id=${estacionamiento.id})}" onclick="return confirm('¿estás seguro?')">eliminar</a>
	            </td>
	        </tr>
	    </tbody>
	</table>

	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>
</html>
