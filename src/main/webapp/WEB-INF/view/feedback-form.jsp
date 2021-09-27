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
		Enter The Feedback
		<form:form method="POST" action="ratings/feedbackdetails"
			modelAttribute="userMovie">
			<%-- School ID:<form:input path="classSchoolId" />--%>
			<br>
			<br>

 Feedback :<form:input path="review" />
			<br>
			<br>

			<input type="submit" value="POST YOUR FEEDBACK" />
		</form:form>
	</center>
</body>
</html>