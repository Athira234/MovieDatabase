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
		<br> ADD MOVIE TO WATCHLIST
		<form:form method="POST" action="save"
			modelAttribute="watchListItem">

			<br>
			<br>

WatchList :
<select id="watchlistId" name="watchlistId">
				<c:forEach items="${watchLists}" var="watchList">
					<option value="${watchList.watchlistId}">${watchList.watchlistName}</option>

				</c:forEach>
			</select>

Movie :
<select id="movieId" name="movieId">
				<c:forEach items="${movies}" var="movie">
					<option value="${movie.movieId}">${movie.movieTitle}</option>

				</c:forEach>
			</select>



			<input type="submit" value="ADD" />
		</form:form>
	</center>
</body>
</html>