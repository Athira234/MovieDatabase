
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create User Form</title>
</head>
<body>
	<center>
		Enter The Details
		<form:form method="POST" action="update" modelAttribute="user">

First Name :<form:input path="firstName" />
			<br>
			<br>
Last Name :<form:input path="lastName" />
			<br>
			<br>
EmailId :<form:input path="email" />
			<br>
			<br>
User Name:<form:input path="userName" />
			<br>
			<br>
Password   :<form:input path="password" />
			<br>
			<br>
 Gender    :<form:input path="gender" />
			<br>
			<br>
 Role:<form:input path="role" />
			<br>
			<br>
 
			<input type="submit" value="ADD" />
		</form:form>
	</center>
</body>
</html>