<%@page import="training.jdbc.beans.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<th>Employee DOB </th>
<th>Employee Department ID</th>
<th>Employee Salary</th>
</tr>
<%
	List<Employee> list = (List<Employee>) request.getAttribute("EMPS");

	for(Employee tmp : list){
		%>
		<tr>
			<td><%=tmp.getEmpId() %></td>
			<td><%=tmp.getEmpName() %></td>
			<td><%=tmp.getEmpEmail() %></td>
			<td><%=tmp.getEmpDob() %></td>
			<td><%=tmp.getDepartmentId() %></td>
			<td><%=tmp.getEmpSalary() %></td>
		</tr>
		<%
	}

%>

</table>
</body>
</html>