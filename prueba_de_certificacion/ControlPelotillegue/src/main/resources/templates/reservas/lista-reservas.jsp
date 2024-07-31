<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
<title>Lista de  reservas</title>
<meta charset="UTF-8">

</head>
<body>
	<div th:replace="~{navbar}" class="navbar"></div>
	<h1>Reservas</h1>
	<table class="table">
	        <thead>
	            <tr>
	                <th>ID</th>
	                <th>Hora Ingreso</th>
	                <th>Hora Salida</th>
	                <th>Estado</th>
	                <th>Matricula</th>
	                <th>Estacionamiento</th>
	                <th>Acciones</th>
	            </tr>
	        </thead>
	        <tbody>
	            <tr th:each="reserva : ${reservas}">
	                <td th:text="${reserva.id}"></td>
	                <td th:text="${reserva.fecha_hora_inicio}"></td>
	                <td th:text="${reserva.fecha_hora_fin}"></td>
	                <td th:text="${reserva.estado_reserva}"></td>
	                <td th:text="${reserva.vehiculo != null ? reserva.vehiculo.matricula : 'N/A'}"></td>
	                <td th:text="${reserva.estacionamiento != null ? reserva.estacionamiento.nombre : 'N/A'}"></td>
	                <td>
	                    <a th:href="@{'/reservas/edit/' + ${reserva.id}}" class="btn btn-warning btn-sm">Editar</a>
	                    <a th:href="@{'/reservas/delete/' + ${reserva.id}}" class="btn btn-danger btn-sm">Eliminar</a>
	                </td>
	            </tr>
	        </tbody>
	    </table>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>
</html>