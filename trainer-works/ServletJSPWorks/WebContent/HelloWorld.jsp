<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<%!public void jspInit() {
		System.out.println("Hi i'm from init ");

	}

	public void jspDestroy() {
		System.out.println("Hi i'm from destroy... ");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
	}%>

<body bgcolor="cyan">

	<h2 style="color: orange">Welcome to JSP</h2>


	<a href="getemps">Get Employees</a>


	<%
		Date date = new Date();
		out.print("Today's Date is " + date.toGMTString());
		System.out.println("i'm in service ");
		
		
		application.setAttribute("company", "Publicis Sapient"); 
	%>
</body>
</html>



