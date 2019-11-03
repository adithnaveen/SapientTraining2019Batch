<%@page import="training.jdbc.beans.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="ps"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>Employee Id</th>
			<th>Employee Name</th>
			<th>Employee Email</th>
			<th>Employee DOB</th>
			<th>Employee Department ID</th>
			<th>Employee Salary</th>
		</tr>

		<ps:forEach items="${EMPS}" var="emp">

			<tr>
				<td>${emp.empId}</td>
				<td>${emp.empName}</td>
				<td>${emp.empEmail}</td>
				<td>${emp.empDob}</td>
				<td>${emp.departmentId}</td>
				<td>${emp.empSalary}</td>
			</tr>
		</ps:forEach>




	</table>
</body>
</html>













