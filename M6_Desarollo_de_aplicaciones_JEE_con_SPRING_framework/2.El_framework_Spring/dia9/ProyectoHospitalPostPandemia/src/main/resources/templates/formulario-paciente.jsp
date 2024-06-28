<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Formulario de Paciente</title>
</head>
<body>
    <h1 >Nuevo Paciente</h1>
    <form action="/" method="post">
       
        <div>
            <label for="name">Nombre:</label>
            <input type="text" id="nombre" name="nombre" />
        </div>
        <div>
            <label for="email">Email:</label>
            <input type="text" id="email" name="email" />
        </div>
        <div>
            <label for="edad">Edad:</label>
            <input type="number" id="edad" name="edad" />
        </div>
    	<div>
            <label for="fecha_ingreso">Fecha Ingreso:</label>
            <input type="text" id="fecha_ingreso" name="fecha_ingreso" />
        </div>
        <div>
            <button type="submit" >Ingresar Paciente</button>
        </div>
    </form>
    <a href="/">Regresar a la lista</a>
</body>
</html>
