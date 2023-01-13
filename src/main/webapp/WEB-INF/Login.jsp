<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
</head>

<body>
	<div class="container">
	<h2>Formulario Login</h2>
	
        <!-- Controlar los errores -->    	
	    <c:if test="${msgError != null}">
			<div class="alert alert-danger" role="alert">
  				<c:out value="${msgError}"></c:out>
			</div>
		</c:if>
	   
	    <!-- botones, envian datos a backend -->
		<form action="/registro/login" methods="post">
			<label for="correo" class="form-label">Email</label> 
			<input type="email" id="correo" name="email" placeholder="Ingresa tu email" class="form-control" required="required"> 
			<br>
			<label for="pass" class="form-label">Password</label> 
			<input type="password" id="pass" name="pass" placeholder="Ingresa tu password" class="form-control" required="required"> 
			<br>
			<input type="submit" value="Ingresar" class="btn btn-outline-danger">
		</form>

	</div>
	
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
		crossorigin="anonymous"></script>
</body>
</html>