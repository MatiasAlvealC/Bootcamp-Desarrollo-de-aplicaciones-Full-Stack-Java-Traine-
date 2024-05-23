<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-
scale=1">
<title>Desafío Latam</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.mi
n.css"
	rel="stylesheet"
	integrity="sha384-
gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Actividad 2 - C:IF - C:CHOOSE</h1>
		<c:set var="sueldo" value="${800000}" />
		<p>
			Tu sueldo :
			<c:out value="${sueldo}" />
		</p>
		<c:choose>
			<c:when test="${sueldo <= 300000}">
Sueldo igual o inferior al mínimo
</c:when>
			<c:when test="${sueldo > 1000}">
Sueldo superior al mínimo
</c:when>
			<c:otherwise>
No existen comentarios asociados...
</c:otherwise>
		</c:choose>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bund
le.min.js"
		integrity="sha384-
A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
		crossorigin="anonymous"></script>
</body>
</html>