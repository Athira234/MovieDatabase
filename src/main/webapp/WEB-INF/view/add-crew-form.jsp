
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MovieCast Form</title>
</head>
<body>
	<center>
		Enter Cast Details
		 <form:form method="POST" action="save" modelAttribute="movieCrew">
     
		
	Movie :	<select id="movieId"  name="movieId">
				<c:forEach items="${movies}" var="movie">
					<option value="${movie.movieId}">${movie.movieTitle}</option>
				</c:forEach>
			</select>

     <br><br>   
Person :<select id="personId" name="personId">
				<c:forEach items="${persons}" var="p">
					<option value="${p.personId}">${p.firstName}</option>
					

				</c:forEach>
			</select>
    <br><br>
    Crew Role :<form:input path="crewRole" />
			<br>
			<br>
    Remuneration :<form:input path="remuneration" />
    <br>
			<br>
   

			<input type="submit" value="ADD" />
		</form:form>
	</center>
</body>
</html>