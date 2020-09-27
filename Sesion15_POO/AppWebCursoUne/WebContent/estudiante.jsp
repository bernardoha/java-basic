<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>    
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insertar - Editar estudiante</title>
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
	<div class="container">
		<h1>Insertar/Editar estudiante</h1>
		<form action="EstudianteController" method="post" class="form-group">
			<div>
				<label for="dni">Dni:</label>
				<input class="form-control" type="text" name="dni" value="<c:out value="${estudiante.dni}"/>">
			</div>
			<div>
				<label for="apellidos">Apellidos:</label>
				<input class="form-control" type="text" name="apellidos" value="<c:out value="${estudiante.apellidos}"/>">
			</div>
			<div>
				<label for="nombres">Nombres:</label>
				<input class="form-control" type="text" name="nombres" value="<c:out value="${estudiante.nombres}"/>">
			</div>
			<div>
				<fmt:parseDate value="${estudiante.fechaNac}" pattern="yyyy-MM-dd" var="parsedDate" type="date" /> 
				<fmt:formatDate value="${parsedDate}" var="stdDatum" type="date" pattern="dd/MM/yyyy" /> 
				<label for="fechanac">Fecha de Nacimiento:</label>
				<input class="form-control" type="date" name="fechanac" value="<c:out value="${stdDatum}"/>">
			</div>
			<div>
				<label for="correo">Correo Electrónico:</label>
				<input class="form-control" type="email" name="correo" value="<c:out value="${estudiante.correo}"/>">
			</div>
			<div>
				<label for="telefono">Teléfono:</label>
				<input class="form-control" type="text" name="telefono" value="<c:out value="${estudiante.telefono}"/>">
			</div>
			<div>
				<label for="direccion">Dirección:</label>
				<input class="form-control" type="text" name="direccion" value="<c:out value="${estudiante.direccion}"/>">
			</div>
			<div>
				<input class="btn btn-primary" type="submit" value="Registrar">
			</div>																			
		</form>
	</div>	
</body>
</html>