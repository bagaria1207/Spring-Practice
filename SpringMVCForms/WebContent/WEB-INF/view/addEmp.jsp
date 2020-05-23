<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<%@taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:form action="addEmp" modelAttribute="newEmp" method="post" >
		<s:label path="empId">Employee ID : </s:label>
		<s:input path="empId"></s:input>
		<s:errors path="empId"></s:errors>
		<br><br>
		
		<s:label path="empName">Employee NAME : </s:label>
		<s:input path="empName"></s:input>
		<s:errors path="empName"></s:errors>
		<br><br>
		
		<s:label path="empSal">Employee SALARY : </s:label>
		<s:input path="empSal"></s:input>
		<s:errors path="empSal"></s:errors>
		<br><br>
		
		<s:button type="submit">AddEmployee</s:button>
	</s:form><br>
	Employee Added newly and it's Details are<br>
	Id :: ${addedEmp.empId}<br>
	Name :: ${addedEmp.empName}<br>
	Salary :: ${addedEmp.empSal}<br>
</body>
</html>