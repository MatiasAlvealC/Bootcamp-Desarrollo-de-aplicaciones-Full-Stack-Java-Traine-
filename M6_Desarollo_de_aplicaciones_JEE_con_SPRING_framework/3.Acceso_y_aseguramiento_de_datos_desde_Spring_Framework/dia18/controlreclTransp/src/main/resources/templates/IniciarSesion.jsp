<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Página de iniciar sesión</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <!-- Mostrar mensaje de error -->
    <div th:if="${errorMessage}" class="alert alert-danger" role="alert">
        <span th:text="${errorMessage}"></span>
    </div>

    <h1>Iniciar sesión</h1>

    <form method="POST" th:action="@{/usuario/iniciarSesion}">
        <p>
            <label for="username">Nombre de usuario:</label>
            <input type="text" id="username" name="username"/>
        </p>
        <p>
            <label for="password">Contraseña</label>
            <input type="password" id="password" name="password"/>
        </p>
        <input type="submit" value="Iniciar sesión" class="btn btn-primary"/>
    </form>
    <br>
    <a class="btn btn-primary" th:href="@{/usuario/registrarse}" role="button">Registrarse</a>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>
</html>
