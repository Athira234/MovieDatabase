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
	
		<U>MOVIE CAST LIST</U> <br> <br> <a
			href="cast/add"> <input type="submit" value="ADD NEW CAST" /></a><br>
		<br>
		<table border=1>
			<th>Sl.No</th>
			<th>Person</th>
			<th>Actor Role</th>


			<c:forEach items="${movieCast}" var="cast" varStatus="status">
				<tr>
					<td></td>
					<td><c:out
							value="${persons[status.index].firstName}${persons[status.index].lastName}" /></td>
					<td><c:out value="${cast.actorRole}" /></td>

				</tr>

			</c:forEach>
			
		</table>
		
		<br>
			<br>
			<br>
			<form action="cast/delete">
				<select id="personId" name="personId">
					<c:forEach items="${persons}" var="p">
						<option value="${p.personId}">${p.firstName} ${p.lastName}
							${p.lastName}</option>
					</c:forEach>
				</select> <input type="submit" value="delete">

			</form>
		
		
		
		
		
	</center>
</body>
</html>
}
<br>


<br>
</center>
</body>
</html>