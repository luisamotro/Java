<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Registro</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous"> 
</head>
<body>
	<div class="container-fluid">
		<h1>Registrarse</h1>
		<c:if test="${msgError != null}">
			<div class="alert alert-danger" role="alert">
				<c:out value="${msgError}"></c:out>
			</div>
		</c:if>
		<br>
		
		<div class="card">
			<div class="card-body">
				<form action="/registro/formulario" method="post"> <!-- ruta capturar los datos -->
					<label for="nombre" class="form-label">Nombre:</label> <input
						type="text" id="nombre" name="nombre"
						placeholder="Ingrese su nombre" class="form-control"> <br>
					
					<br> <label for="nick" class="form-label">Nombre de usuario:</label> <input type="text" id="nick" name="nick"
						placeholder="Ingrese su nombre de usuario" class="form-control">
					
					<br> <br> <label for="correo" class="form-label">Correo:</label>
					<input type="email" id="correo" name="correo"
						placeholder="Ingrese su correo" class="form-control"> <br>
					
					<br> <label for="password" class="form-label">Contraseña:</label>
					<input type="password" id="password" name="password"
						placeholder="Ingrese su contraseña" class="form-control">
					
					<br> <br> <label for="password2" class="form-label">Confirme su contraseña:</label> 
					<input type="password" id="password2" name="password2" placeholder="Ingrese su contraseña de nuevo"
						class="form-control"> <br> <br> <input
						type="submit" value="Enviar" class="btn btn-outline-danger">
				</form>
			</div>
		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
		crossorigin="anonymous"></script>
</body>
</html>