<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <title>Editar reserva</title>
    <meta charset="UTF-8">
</head>
<body>
	<div th:replace="~{navbar}" class="navbar"></div>
    <h1>Actualizar Reserva</h1>
	<div th:if="${errorMessage}" class="alert alert-danger">
	        <p th:text="${errorMessage}"></p>
	 </div>
	 <form th:action="@{/reservas/update/{id}(id=${reserva.id})}" method="post">
	 	    <input type="hidden" id="id" name="id" th:value="${reserva.id}"/>
	 	    <p>
	 	        <label for="fecha_hora_inicio">Hora Ingreso:</label>
	 	        <input type="date" id="fecha_hora_inicio" name="fecha_hora_inicio" class="form-control" th:value="${reserva.fecha_hora_inicio}" required/>
	 	    </p>
	 	    <p>
	 	        <label for="fecha_hora_fin">Hora Salida:</label>
	 	        <input type="date" id="fecha_hora_fin" name="fecha_hora_fin" class="form-control" th:value="${reserva.fecha_hora_fin}" required/>
	 	    </p>
	 	    <p>
	 	        <label for="estado_reserva">Estado Reserva:</label>
	 	        <select id="estado_reserva" name="estado_reserva" class="form-control" required>
	 	            <option value="Pendiente" th:selected="${reserva.estado_reserva == 'Pendiente'}">Pendiente</option>
	 	            <option value="Confirmada" th:selected="${reserva.estado_reserva == 'Confirmada'}">Confirmada</option>
	 	            <option value="Cancelada" th:selected="${reserva.estado_reserva == 'Cancelada'}">Cancelada</option>
	 	        </select>
	 	    </p>
	 	    <p>
	 	        <label for="vehiculo_id">Matricula Vehículo:</label>
	 	        <input type="text" id="vehiculo_id" name="vehiculo_id" class="form-control" th:value="${reserva.vehiculo != null ? reserva.vehiculo.matricula : ''}" required/>
	 	    </p>
	 	    <p>
	 	        <label for="nombreEstacionamiento">Estacionamiento:</label>
	 	        <input type="text" id="nombreEstacionamiento" name="nombreEstacionamiento" class="form-control" th:value="${reserva.estacionamiento != null ? reserva.estacionamiento.nombre : ''}" required/>
	 	    </p>
	 	    <div>
	 	        <input type="submit" value="Actualizar" class="btn btn-primary"/>
	 	    </div>
	 	</form>
    <a th:href="@{/reservas}">Regresar a la lista</a>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>
</html>
