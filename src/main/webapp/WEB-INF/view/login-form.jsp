
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create User Form</title>
</head>
<body>
	<center>
		<u>Enter Login Details</u><br><br>
		<form:form method="POST" action="loginprocess" modelAttribute="login">


User Name:<form:input path="username" />
			<br>
			<br>
Password   :<form:input path="password"  type="password"/>
			<br>
			<br>
 
 
			<input type="submit" value="Login" />
		</form:form>
	</center>
</body>
</html>