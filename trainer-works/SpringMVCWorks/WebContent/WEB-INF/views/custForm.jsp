<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="springForm"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
	.error{
		color: red; 
		font-style: italic; 
		font-weight: bold; 
	}
</style>

</head>
<body>
	<springForm:form method="POST" commandName="customer" action="save.do" >
		<table>
			<tr>
				<td>Name</td>
				<td><springForm:input path="name"/></td>
				<td><springForm:errors cssClass="error" path="name" /></td>
			</tr>
			<tr>
				<td>Email </td>
				<td><springForm:input path="email"/></td>
				<td><springForm:errors cssClass="error" path="email" /></td>
			</tr>
			<tr>
				<td>Age </td>
				<td><springForm:input path="age"/></td>
				<td><springForm:errors cssClass="error" path="age" /></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><springForm:select path="gender">
					<springForm:option value="MALE" label="Male"/>	
					<springForm:option value="FEMALE" label="Female"/>	
					<springForm:option value="TRANSGENDER" label="Transgender"/>	
				</springForm:select></td>
				<td><springForm:errors cssClass="error" path="gender" /></td>
			</tr>
			<tr>
				<td>BirthDay</td>
				<td><springForm:input path="birthDay" placeholder="MM/dd/yyyy" /></td>
				<td><springForm:errors cssClass="error" path="birthDay" /></td>
			</tr>
			<tr>
				<td><input type="reset"></td>
				<td><input type="submit" value="Save Customer"></td>
			</tr>
		</table>
	</springForm:form>
</body>
</html>