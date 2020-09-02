<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Bienvenidos a mi Página web</h1>
	<p>Probando web con JSP</p>
	<%--Expresión aritmética --%>
	<p>Resultado de una operación: <%=(10+3)/(double)4 %> </p>
	<%--Mostrar fecha hora del sistema --%>
	<p>Fecha del sistema: <%=new java.util.Date().toString() %> </p>
	<%--Convertir una cadena a mayúscula y minúsculas --%>
	<p><%= "prueba de conversión".toUpperCase() %> </p>
	<p><%="CADENA EN MAYÚSCULA".toLowerCase() %> </p>
</body>
</html>