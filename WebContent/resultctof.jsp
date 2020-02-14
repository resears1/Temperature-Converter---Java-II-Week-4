<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>C-to-F Converted</title>
</head>
<body>
<h1>Conversion complete!</h1>
<p>
	${userConversion.getCelsius()} degrees Celsius is ${userConversion.getConvertedFahrenheit()} degrees Fahrenheit.
</p>
<a href="celsiusconverter.jsp">-Convert Celsius again-</a>
<a href="index.jsp">-Select a new Conversion-</a>
</body>
</html>