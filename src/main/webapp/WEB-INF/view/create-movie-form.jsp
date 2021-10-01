
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Movie Form</title>
</head>
<body>
	<center>
		Enter The Details
		<form:form method="POST" action="save" modelAttribute="movie">

Movie Title :<form:input path="movieTitle" />
			<br>
			<br>
releaseDate :<form:input path="releaseDate" />
			<br>
			<br>
Runtime:<form:input path="runtime" />
			<br>
			<br>
Total Gross Income In Dollar :<form:input path="totalGrossIncomeDollar" />
			<br>
			<br>
Overview :<form:input path="overview" />
			<br>
			<br>
 PG Rating    :<form:input path="pgRating" />
			<br>
			<br>
 Budget In Dollar   :<form:input path="budgetInDollar" />
			<br>
			<br>
 Country :<form:input path="country" />
			<br>
			<br>
 OverallRating:<form:input path="overallRating" />
			<br>
			<br>
 NumberOfRecommendations:<form:input path="numberOfRecommendations" />
			<br>
			<br>
			MoviePoster:<form:input path="moviePoster" />
			<br>
			<br>
		ReleaseType:<form:input path="releaseType" />
			<br>
			<br>
			<input type="submit" value="ADD" />
		</form:form>
	</center>
</body>
</html>