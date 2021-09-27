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
			<%-- School ID:<form:input path="classSchoolId" />--%>
			<br>
			<br>

Ratings :
  <select id="ratingGiven" name="ratingGiven">
				
					<option value="1">*</option>
                    <option value="2">**</option>
                    <option value="3">***</option>
                    <option value="4">****</option>
                    <option value="5">*****</option>

	
			</select>
			<br>
			<br>

			<input type="submit" value="POST Rating" />
		</form:form>
	</center>
</body>
</html>