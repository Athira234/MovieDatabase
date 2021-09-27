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
		<U>GENRE LIST</U> <br> <br>
  <br> <br> <a href="genre/add"> <input
			type="submit" value="ADD NEW GENRE" /></a><br> <br>
		<table border=1>
			<th>Sl.No</th>
			<th>Name</th>
			<th>Description</th>

			<c:forEach items="${genreList}" var="g">
				<tr>
					<td></td>

					<td><c:out value="${g.description}" /></td>
					<td><a href="genre/edit/${g.genreId}"> Edit </a></td>
					<td><a href="genre/delete/${g.genreId}"> Delete </a></td>
					<td></td>
				</tr>

			</c:forEach>
		</table>
	</center>
</body>
</html>