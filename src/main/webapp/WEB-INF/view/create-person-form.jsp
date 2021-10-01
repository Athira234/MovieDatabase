
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Person Form</title>
</head>
<body>
	<center>
		Enter The Details
		<form:form method="POST" action="save" modelAttribute="person">

First Name :<form:input path="firstName" />
			<br>
			<br>
Last Name :<form:input path="lastName" />
			<br>
			<br>
Gender :<form:input path="gender" />
			<br>
			<br>
Role:<form:input path="role" />
			<br>
			<br>
 EmailId :<form:input path="emailId" />
			<br>
			<br>
Date of Birth :<form:input path="dateOfBirth" />
			<br>
			<br>
 Nationality    :<form:input path="nationality" />
			<br>
			<br>
 Age    :<form:input path="age" />
			<br>
			<br>
 dateOfDeath:<form:input path="dateOfDeath" />
			<br>
			<br>
 IMDB_Profile_URL:<form:input path="imdbLink" />
			<br>
			<br>
			<input type="submit" value="ADD" />
		</form:form>
	</center>
</body>
</html>