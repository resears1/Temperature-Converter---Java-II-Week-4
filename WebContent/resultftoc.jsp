<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>F-to-C Converted</title>
</head>
<body>
<h1>Conversion complete!</h1>
<p>
	${userConversion.getFahrenheit()} degrees Fahrenheit is ${userConversion.getConvertedCelsius()} degrees Celsius.
</p>
<a href="fahrenheitconverter.jsp">-Convert Fahrenheit again-</a>
<a href="index.jsp">-Select a new Conversion-</a>
</body>
</html>