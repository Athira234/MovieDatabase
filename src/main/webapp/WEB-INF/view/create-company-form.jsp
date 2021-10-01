
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Company Form</title>
</head>
<body>
	<center>
		Enter The Details
		<form:form method="POST" action="save" modelAttribute="company">

Name :<form:input path="companyName" />
			<br>
			<br>
CEO :<form:input path="ceo" />
			<br>
			<br>
Established_In :<form:input path="establishedIn" />
			<br>
			<br>
 Email :<form:input path="emailId" /><br><br>
 HeadQuarter :<form:input path="headquarter" /><br><br>
 Country     :<form:input path="country" /><br><br>
 Website     :<form:input path="website" /><br><br>
 Description :<form:input path="description" /><br><br>
			<input type="submit" value="ADD" />
		</form:form>
	</center>
</body>
</html>