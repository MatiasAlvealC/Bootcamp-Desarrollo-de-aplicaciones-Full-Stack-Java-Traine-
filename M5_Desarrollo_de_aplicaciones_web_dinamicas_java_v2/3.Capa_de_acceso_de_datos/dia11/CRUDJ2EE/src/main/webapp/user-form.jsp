<%@ page import="cl.crud.model.User" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Formulario de Usuario</title>
</head>
<body>
    <h2><%= request.getAttribute("user") == null ? "Nuevo Usuario" : "Editar Usuario" %></h2>
    <form action="<%= request.getAttribute("user") == null ? "insert" : "update" %>" method="post">
        <input type="hidden" name="id" value="<%= request.getAttribute("user") != null ? ((User) request.getAttribute("user")).getId() : "" %>">
        <label for="name">Nombre:</label>
        <input type="text" id="name" name="name" value="<%= request.getAttribute("user") != null ? ((User) request.getAttribute("user")).getName() : "" %>"><br>
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" value="<%= request.getAttribute("user") != null ? ((User) request.getAttribute("user")).getEmail() : "" %>"><br>
        <label for="password">Contraseña:</label>
        <input type="password" id="password" name="password" value="<%= request.getAttribute("user") != null ? ((User) request.getAttribute("user")).getPassword() : "" %>"><br>
        <input type="submit" value="Guardar">
    </form>
</body>
</html>
