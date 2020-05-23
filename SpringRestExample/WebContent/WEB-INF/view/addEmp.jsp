<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="addEmployee" method="post">
	<table>
		<caption>Add New Employee </caption>
			<tr>
				<td><label>id</label></td> 
				<td><input type="text" name="id"/></td></tr>
			<tr>
				<td><label>name</label></td> 
				<td><input type="text" name="name"/></td></tr>
			<tr>
				<td><label>Sal</label></td>
				<td><input type="text" name="sal"/></td></tr>
			<tr><td>
			<button type="submit" value="Add Employee">Add Employee</button>
		</td></tr>
	</table>		
	</form>


</body>
</html>