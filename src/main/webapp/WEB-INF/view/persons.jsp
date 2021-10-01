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
		<U> LIST OF PERSONS</U> <br> <br>
   <br> <br> <a href="persons/add"> <input
			type="submit" value="ADD NEW PERSON" /></a><br> <br>
		<table border=1>
			<th>Sl.No</th>
			<th>Name</th>
			<th>Gender</th>
			<th>Role</th>
			<th>IMDB_Profile_URL</th>
			<th>Edit</th>
			<th>Delete</th>
			<c:forEach items="${personList}" var="p">
				<tr>
					<td></td>
					<td><a href="persons/${p.personId}"><c:out value="${p.firstName} ${p.lastName}" /></td>
                    <td><c:out value="${p.gender}" /></td>
                    <td><c:out value="${p.role}" /></td>
                    <td><a href="${p.imdbLink}"><c:out value="${p.imdbLink}" /></td>
                    <td><a href="persons/${p.personId}/edit"> Edit </a></td>
					<td><a href="persons/delete/${p.personId}"> Delete </a></td>
				</tr>

			</c:forEach>
		</table>
	</center>
</body>
</html>