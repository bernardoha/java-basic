<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Bienvenidos a mi P�gina web</h1>
	<p>Probando web con JSP</p>
	<%--Expresi�n aritm�tica --%>
	<p>Resultado de una operaci�n: <%=(10+3)/(double)4 %> </p>
	<%--Mostrar fecha hora del sistema --%>
	<p>Fecha del sistema: <%=new java.util.Date().toString() %> </p>
	<%--Convertir una cadena a may�scula y min�sculas --%>
	<p><%= "prueba de conversi�n".toUpperCase() %> </p>
	<p><%="CADENA EN MAY�SCULA".toLowerCase() %> </p>
</body>
</html>