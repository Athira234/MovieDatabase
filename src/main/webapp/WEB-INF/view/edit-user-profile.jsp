<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EDIT USER DETAILS</title>
</head>
<body>
	<form:form method="POST" action="editprofile/editdetails" modelAttribute="user">
User Id :<form:hidden path="userId" />
		<br>
		<br>
First Name :<form:input path="firstName" />
		<br>
		<br>
Last Name:<form:input path="lastName" />
		<br>
		<br>
 Email  :<form:input path="email" />
		<br>
		<br>
 
		<input type="submit" value="UPDATE" />
	</form:form>
</body>
</html>