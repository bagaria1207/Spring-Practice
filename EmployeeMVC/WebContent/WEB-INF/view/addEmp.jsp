<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Added New Employee</title>
</head>
<body>
	<form action="addEmp" method="post">
		Enter Id :<input type="text" name="id"/><br>
		Enter name :<input type="text" name="name"/><br>
		Enter Salary :<input type="text" name="salary"/><br>
		<button type="submit">Add Employee</button>
	</form>
	<br>
	<br>
	Newly Added Employee is <br>
	id is ${newEmp.empId} <br>
	name is ${newEmp.empName} <br>
	salary is ${newEmp.empSal} <br>
</body>
</html>