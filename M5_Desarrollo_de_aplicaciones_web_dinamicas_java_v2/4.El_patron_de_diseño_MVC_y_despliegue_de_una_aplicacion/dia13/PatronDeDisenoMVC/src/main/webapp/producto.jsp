<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.desafiolatam.web.models.Producto"%>
<%@ page import="com.desafiolatam.web.MGR.Impl.ProductoMGRImpl"%>
<%@ page import="java.text.DecimalFormat"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ejemplo MVC</title>
</head>
<body>
	<%
	if (request.getAttribute("producto") != null) {
		Producto producto = (Producto) request.getAttribute("producto");
	%>
	<h1>Detalle del Producto</h1>
	<div>
		ID:
		<%=producto.getId()%></div>
	<div>
		Nombre:
		<%=producto.getNombre()%></div>
	<div>
		Precio: $
		<%=new DecimalFormat("#0.00").format(producto.getPrecio())%></div>
	<div>
		<a href="producto"> Regresar</a>
	</div>
	<%
	} else {
	%>
	<h1>Lista Productos</h1>
	<table>
		<tr>
			<td><b>Nombre</b></td>
			<td><b>Opciones</b></td>
		</tr>
		<%
		for (Producto producto : (List<Producto>) request.getAttribute("lista_productos")) {
		%>
		<tr>
			<td><%=producto.getNombre()%></td>
			<td><a href="producto?id=<%=producto.getId()%>">Detalle</a></td>
		</tr>
		<% }
}%>
	</table>
</body>
</html>