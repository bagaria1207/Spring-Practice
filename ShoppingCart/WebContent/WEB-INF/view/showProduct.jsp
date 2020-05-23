<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Details</title>
</head>
<body>
	<div>
		<h1>Product Details....</h1><br>
			<c:forEach items="${prodMap}" var="entry">
				${entry.key},&nbsp&nbsp Product_Name = ${entry.value.prodName},&nbsp&nbsp Product_Price = ${entry.value.prodName}&nbsp&nbsp&nbsp&nbsp <a href="addtoCart?id=${entry.key}">AddToCart</a><br><br>
			</c:forEach>
		<a href="viewCart">Go To Cart</a>
	</div>
</body>
</html>