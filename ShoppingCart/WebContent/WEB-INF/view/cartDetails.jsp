<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Cart</title>
</head>
<body>
	<h1>Cart Details....</h1>
	<c:forEach items="${cartMaps}" var="entry">
		${entry.key},&nbsp&nbsp ProductName = ${entry.value.prodName}, 
		ProductPrice = ${entry.value.prodPrice} &nbsp 
		<a href="deletefromCart?id=${entry.key}">Delete from Cart</a><br><br>
	</c:forEach>
	<a href="cartDetail">Go to Products Page</a>
</body>
</html>