<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Formulario de Usuario</title>
</head>
<body>
    <h1 >Nuevo Usuario</h1>
    <form action="/users" method="post">
       
        <div>
            <label for="name">Nombre:</label>
            <input type="text" id="nombre" name="nombre" />
        </div>
        <div>
            <label for="email">Email:</label>
            <input type="text" id="email" name="email" />
        </div>
        <div>
            <button type="submit" >Guardar</button>
        </div>
    </form>
    <a href="/users">Regresar a la lista</a>
</body>
</html>

