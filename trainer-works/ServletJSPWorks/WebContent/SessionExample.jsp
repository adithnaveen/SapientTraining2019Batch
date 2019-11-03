<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Your Company Name is <%=application.getAttribute("company") %></h2>
<%
	HttpSession mySession = request.getSession(); 

	if(mySession.isNew()){
		%>
			<p> Hi User welcome for first time </p>
		<%
	}else {
		mySession.setMaxInactiveInterval(5); 
		%>
			<p>Hi User Welcome Back </p>
			<p>Your Last session id is : <%= mySession.getId() %> </p>
			<p> Creating Time <%= new Date(mySession.getCreationTime()) %></p>
			<p> Your last access Time <%=new Date(mySession.getLastAccessedTime()) %></p>
			<p> Max inactive interval <%=mySession.getMaxInactiveInterval() %></p>
		
		<%
		mySession.invalidate(); 
	}
	
%>

</body>
</html>