<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="ISO-8859-1">
    <title>Registro</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>
<body>

<div class="container">
    <h1>Registrarse!</h1>
    <form action="/usuario/registrarse" method="POST">
        <p>
            <label for="username">Nombre de usuario:</label>
            <input type="text" id="username" name="username" class="form-control"/>
        </p>
		<p>
			<label for="email">email:</label>
			<input type="email" id="email" name="email" class="form-control"/>
		</p>
		<p>
            <label for="password">Contraseña:</label>
            <input type="password" id="password" name="password" class="form-control"/>
        </p>
        <p>
            <label for="passwordConfirmation">Confirmar contraseña:</label>
            <input type="password" id="passwordConfirmation" name="passwordConfirmation" class="form-control"/>
        </p>
		<p>
			<label for="rol">Seleccione un rol:</label>
		       <select id="rol" name="rol" class="form-control">
		           <option value="ROL_USUARIO">Usuario</option>
		           <option value="ROL_ADMIN">Administrador</option>
		       </select>
		   </p>
        <input type="submit" value="Registrarse" class="btn btn-primary"/>
        <a class="btn btn-primary" href="/usuario/iniciarSesion" role="button">Iniciar session</a>
    </form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>

</body>
</html>
