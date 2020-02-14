<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fahrenheit-to-Celsius Converter</title>
</head>
<body>
	<h1>Fahrenheit-to-Celsius Converter</h1>
	<form action="fahrenheitServlet" method="post">
	Convert Fahrenheit to Celsius:
	<input type="text" name="userFahrenheit" size="10">
	<input type="submit" value="Convert from F to C"/>
	</form>
	<a href="index.jsp">-Select a new Conversion-</a>
</body>
</html>