<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Celsius-to-Fahrenheit Converter</title>
</head>
<body>
	<h1>Celsius-to-Fahrenheit Converter</h1>
	<form action="celsiusServlet" method="post">
	Convert Celsius to Fahrenheit:
	<input type="text" name="userCelsius" size="10">
	<input type="submit" value="Convert from C to F"/>
	</form>
	<a href="index.jsp">-Select a new Conversion-</a>
</body>
</html>