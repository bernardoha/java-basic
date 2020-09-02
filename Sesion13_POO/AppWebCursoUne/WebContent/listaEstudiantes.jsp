<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>    
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="#">Navbar</a>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="#">Home
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="EstudianteController?accion=listar">Estudiantes</a></li>
				<li class="nav-item"><a class="nav-link disabled" href="#">Servicios</a>
				</li>
			</ul>
		</div>
	</nav>
	<div class="container">
		<h1>Lista de Estudiantes</h1>
		<table class="table">
			<thead>
				<tr>
					<th>Dni</th>
					<th>Apellidos</th>
					<th>Nombres</th>
					<th>F. Nac.</th>
					<th>Correo</th>
					<th>Teléfono</th>
					<th>Dirección</th>
					<th colspan="2">Accion</th>
				</tr>
			</thead>
			<tbody>
				<!-- Hacer uso de la libreria JSTL -->
					  <c:forEach items="${estudiantes}" var="est">
		<tr>
			<td><c:out value="${est.dni}"></c:out></td>
			<td><c:out value="${est.apellidos}"></c:out></td>
			<td><c:out value="${est.nombres}"></c:out></td>
			<fmt:parseDate value="${est.fechaNac}" pattern="yyyy-MM-dd" var="parsedDate" type="date" /> 
			<fmt:formatDate value="${parsedDate}" var="stdDatum" type="date" pattern="dd/MM/yyyy" /> 
			<td><c:out value="${stdDatum}"></c:out></td>
			<td><c:out value="${est.correo}"></c:out></td>
			<td><c:out value="${est.telefono}"></c:out></td>
			<td><c:out value="${est.direccion}"></c:out></td>
			<td><a class="btn btn-success" href="EstudianteController?accion=editar&dni=<c:out value="${est.dni}"></c:out>">Editar</a></td>
			<td><a class="btn btn-danger" href="EstudianteController?accion=eliminar&dni=<c:out value="${est.dni}"></c:out>">Eliminar</a></td>
		</tr>
	  </c:forEach>	
			</tbody>
		</table>
	</div>
</body>
</html>