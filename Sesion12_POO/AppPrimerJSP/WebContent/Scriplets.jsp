<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		int cant = 10;
		double prec = 20.5;
		double imp = prec * cant;
	%>
	<%--Mostrar datos de variables y resultados--%>
	<p><%= "Cantidad: "+cant %></p>
	<p><%= "Precio: "+prec %></p>
	<p><%= "Importe: "+imp %></p>
</body>
</html>