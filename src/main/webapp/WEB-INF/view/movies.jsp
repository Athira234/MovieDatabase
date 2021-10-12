<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
<title>Insert title here</title>
</head>
<body>
	<center>
		<U> MOVIES </U> <br> <br> <br> <br> 
			<a href="movies/add"> <input type="submit" value="ADD NEW MOVIE" /></a><br>
		<br>
		<br>
		<table border=1>
			<th>Sl.No</th>
			<th>Movie</th>
			<th>Released Date</th>
			<th>Overall Ratings</th>
			<th>Number of Recommendations</th>
			<th>Edit</th>
			<th>Delete</th>
			<c:forEach items="${movieList}" var="m">
				<tr>
					<td></td>
					<td><a href="movies/${m.movieId}"><c:out
								value="${m.movieTitle}" /></td>
					<td><c:out value="${m.releaseDate}" /></td>
					<td><c:out value="${m.overallRating}" /></td>
					<td><c:out value="${m.numberOfRecommendations}" /></td>
					<td><a href="movies/${m.movieId}/edit"> Edit </a></td>
					<td><a href="movies/delete/${m.movieId}"> Delete </a></td>
				</tr>

			</c:forEach>
		</table>
		<br> <br>Search Movie By Company
		<form action="moviesbycompany">
			<select id="companyId" name="companyId">
				<c:forEach items="${companyList}" var="company">
					<option value="${company.companyId}">${company.companyName}
					</option>
				</c:forEach>
			</select> <input type="submit" value="search">

		</form>
		<br> <br>Search Movie By Person
		<form action="moviesbyperson">
			<select id="personId" name="personId">
				<c:forEach items="${personList}" var="person">
					<option value="${person.personId}">${person.firstName}
						${person.lastName}</option>
				</c:forEach>
			</select> <input type="submit" value="search">

		</form>
		</form>
		<br> <br>Search Movie By Genre
		<form action="moviesbygenre">
			<select id="genreId" name="genreId">
				<c:forEach items="${genreList}" var="genre">
					<option value="${genre.genreId}">${genre.name}</option>
				</c:forEach>
			</select> <input type="submit" value="search">

		</form>
		</form>
		<br> <br>Search Movie By Title
		<form action="moviesbytitle">
			<select id="movieTitle" name="movieTitle">
				<c:forEach items="${movieList}" var="movie">
					<option value="${movie.movieTitle}">${movie.movieTitle}</option>
				</c:forEach>
			</select> <input type="submit" value="search">

				
			

		</form>


	</center>

</body>
</html>