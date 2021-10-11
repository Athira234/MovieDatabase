<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<br>
		<br>
		<br>
		<U> MOVIE DETAILS</U><br>
		<br> Title : ${movie.movieTitle}<br>
		<br> Country : ${movie.country}<br>
		<br> ReleaseDate : ${movie.releaseDate}<br>
		<br> PG Rating : ${movie.pgRating}<br>
		<br> Run Time : ${movie.runtime}<br>
		<br> Overall Rating : ${movie.overallRating}<br>
		<br> Number Of Recommendations : ${movie.numberOfRecommendations}<br>
		<br> Budget : ${movie.budgetInDollar}$<br>
	    <br> TotalGross : ${movie.totalGrossIncomeDollar}$<br>
	    <br> Review : ${movie.overview}<br>
			<br>
			<br>
			<a href="${movie.movieId}/cast"><input
			type="submit" value="Cast" /></a> <br><br><br>
			<a href="${movie.movieId}/crew"><input
			type="submit" value="Crew" /></a>
			
			<br><br><br>
			<a href="${movie.movieId}/ratings"><input
			type="submit" value="Ratings" /></a>
			
	</center>
</body>
</html>