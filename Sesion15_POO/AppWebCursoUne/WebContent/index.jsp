<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>  	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Página de inicio</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
</head>
<%
	if(session.getAttribute("correouser")==null){
		response.sendRedirect("login.jsp");
	}
%>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="#">Navbar</a>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="index.jsp">Home
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="EstudianteController?accion=listar">Estudiantes</a></li>
				<li class="nav-item"><a class="nav-link disabled" href="#">Servicios</a>
				</li>
			</ul>
		</div>
	</nav>
	<div class="text-right">
		<c:out value="${mensaje} ${correouser}"></c:out>
		<form action="CerrarSesion">
			<input class="btn btn-link" type="submit" value="Cerrar Sesión">
		</form>
	</div>
	<div class="text-center">
		<h1>Departamento Académico de Electrónica y Telemática</h1>
		<p>Facultad de Tecnología</p>
		<img width=800 heigth=400
			src="https://rc-consulting.org/blog/wp-content/uploads/2015/07/why-elearning-article.jpg">
	</div>
</body>
</html>