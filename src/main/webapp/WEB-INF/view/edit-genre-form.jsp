
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Genre Form</title>
</head>
<body>
	<center>
		Enter The Details
		<form:form method="POST" action="update" modelAttribute="genre">

 Name :<form:input path="name" />
			<br>
			<br>
Description :<form:input path="description" />
			<br>
			<br>

			<input type="submit" value="ADD" />
		</form:form>
	</center>
</body>
</html>