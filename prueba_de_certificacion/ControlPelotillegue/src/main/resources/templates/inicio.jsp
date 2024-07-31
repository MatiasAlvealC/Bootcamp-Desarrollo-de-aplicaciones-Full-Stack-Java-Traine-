<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>inicio</title>
    <style>
        .navbar {
            position: fixed;
            top: 0;
            left: 0;
            width: 100%;
            z-index: 1000; /* asegura que el navbar esté por encima del contenido */
        }
        .container {
            max-width: 800px; /* ajusta el ancho máximo según tus necesidades */
            margin: 0 auto;
            padding-top: 70px; /* ajusta según la altura del navbar */
            text-align: left; /* centra el contenido */
        }
    </style>
</head>
<body>
    <div th:replace="~{navbar}" class="navbar"></div>
    <div class="container">
        <h1>bienvenido al sistema de la ilustre municipalidad de pelotillehue</h1>
        <a role="button" th:href="@{/usuario/iniciarSesion}" class="contrast">iniciar sesión</a><br><br>
        <a role="button" th:href="@{/usuario/registrarse}" class="contrast">registrarse</a>
    </div>
</body>
</html>
