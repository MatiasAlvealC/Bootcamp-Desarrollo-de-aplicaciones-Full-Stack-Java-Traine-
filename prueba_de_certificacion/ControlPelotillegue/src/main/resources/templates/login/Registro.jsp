<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="ISO-8859-1">
    <title>Registro</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>
<body>

<div class="container">
    <h1>Registrarse</h1>
	<div th:if="${errorMessage}" class="alert alert-danger">
	    <p th:text="${errorMessage}"></p>
	</div>
    <form action="/usuario/registrarse" method="POST">
		<p>
			<label for="nombre">Nombre:</label>
		    <input type="text" id="nombre" name="nombre" class="form-control" th:value="${usuario.nombre}" required/>
		</p>
		<p>
			<label for="apellido">Apellido:</label>
		   	<input type="text" id="apellido" name="apellido" class="form-control" th:value="${usuario.apellido}" required/>
		</p>
		<p>
			<label for="dni">DNI:</label>
		    <input type="text" id="dni" name="dni" class="form-control" th:value="${usuario.dni}" required/>
		</p>
		<p>
		    <label for="direccion">Dirección:</label>
		    <input type="text" id="direccion" name="direccion" class="form-control" th:value="${usuario.direccion}" required/>
		</p>
		<p>
		    <label for="telefono">Teléfono:</label>
		   	<input type="text" id="telefono" name="telefono" class="form-control" th:value="${usuario.telefono}" required/>
		</p>
		<p>
		     <label for="email">Correo:</label>
		     <input type="email" id="email" name="email" class="form-control" th:value="${usuario.email}" required/>
		</p>
		<p>
			<label for="rol">Seleccione un rol:</label>
			<select id="rol" name="rol" class="form-control">
				<option value="ROL_USUARIO">Usuario</option>
				<option value="ROL_ADMIN">Administrador</option>
			</select>
		</p>
		<p>
		     <label for="password">Contraseña:</label>
		     <input type="password" id="password" name="password" class="form-control" required/>
		</p>
		<p>
		     <label for="passwordConfirmation">Confirmar contraseña:</label>
		     <input type="password" id="passwordConfirmation" name="passwordConfirmation" class="form-control" required/>
		</p>
		  <input type="submit" value="Registrarse" class="btn btn-primary"/>
        <a class="btn btn-primary" href="/usuario/iniciarSesion" role="button">Iniciar sesión</a>
    </form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>

</body>
</html>