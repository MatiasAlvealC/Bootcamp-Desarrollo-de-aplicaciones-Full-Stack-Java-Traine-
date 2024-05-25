<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hola Mundo</title>
<link rel="stylesheet" href="https://unpkg.com/@picocss/pico@latest/css/pico.min.css">
</head>
<body>
	<main class="container">
		<h1>Soy un formulario</h1>
		<form action="login" method="post">
			<div class="field">
				<label for="name">Name</label><input type="text" name="user">
			</div>
			<div class="field">
				<label for="password">Password</label><input type="password"
					name="password">
			</div>
			<div class="actions">
				<input type="submit" value="login">
			</div>
		</form>
	</main>
</body>
</html>