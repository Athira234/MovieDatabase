<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EDIT USER Password</title>
</head>
<body>
	<form:form method="POST" action="password/editdetails" modelAttribute="user">

New Password :<form:input path="password" />
		<br>
		<br>

		<br>
		<br>

 
		<input type="submit" value="UPDATE" />
	</form:form>
</body>
</html>