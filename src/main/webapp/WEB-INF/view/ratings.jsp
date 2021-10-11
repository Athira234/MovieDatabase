<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
<style type="text/css">
body {
	counter-reset: Serial;
}

table {
	border-collapse: separate;
}

tr td:first-child:before {
	counter-increment: Serial;
	content: counter(Serial);
}
</style>
<body>
	<center>
		<U>Ratings</U> <br> <br> 
		<table border=1>
			<th>Sl.No</th>
			<th>Rating Given</th>
			<th>Date Added</th>
			<th>Rating Given By</th>
			<c:forEach items="${userMovies}" var="movie" varStatus="status">
					<tr>
					<td></td>
					<td><c:out value="${movie.ratingGiven}" /></td>
					<td><c:out value="${movie.ratingGivenDate}" /></td>
					<td><c:out value="${users[status.index].firstName}${users[status.index].lastName}" /></td>
				</tr>
          </c:forEach>
			
		</table>
		
		</center>
</body>

</html>