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
		<U>HIGHEST GROSS MOVIE LIST</U> <br> <br> <br> <br>

		<table border=1>
			<th>Sl.No</th>
			<th>Movie</th>

			<th>Total Gross</th>

			<c:forEach items="${movies}" var="m">
				<tr>
					<td></td>
					<td><a href="movies/${m.movieId}"><c:out
								value="${m.movieTitle}" /></td>
					<td><c:out value="${m.totalGrossIncomeDollar}" /></td>

				</tr>

			</c:forEach>
		</table>
		


	</center>

</body>
</html>