<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>School Form</title>
</head>
<body>
	<center>
		Enter The Details
		<form:form method="POST" action="ratings/ratingdetails"
			modelAttribute="userMovie">
			

Ratings :<form:input path="ratingGiven" />
			<br>
			<br>

			<input type="submit" value="POST Rating" />
		</form:form>
	</center>
</body>
</html>