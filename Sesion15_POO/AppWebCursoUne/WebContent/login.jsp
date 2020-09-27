<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>       
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inicio de Sesión</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
</head>
<body>
	<div class="row justify-content-center align-items-center">
		<div class="cold-md-6 login-form-1">
			<div class="text-center pt-5">
				<img alt="Imagen de inicio de sesión" src="img/login.png">
				<h3>Iniciar Sesión</h3>
			</div>
			<form action="UsuarioController" method="post">
				<div class="form-group">
					<input type="text" class="form-control" name="correo" placeholder="Su cuenta">
				</div>
				<div class="form-group">
					<input type="password" class="form-control" name="clave" placeholder="Su contraseña">
				</div>
				<div class="text-right text-danger">
					<c:out value="${mensaje}"></c:out>
				</div>	
				<div class="form-group">
					<input type="submit" class="btn btn-primary" value="Ingresar">
				</div>									
			</form>
		</div>
	</div>
</body>
</html>