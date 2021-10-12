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
<body>
	<center>
		<U>USER'S LIST</U> 
		<br> <br> <a href="users/add"> <input
			type="submit" value="ADD NEW USER" /></a><br> <br>
		<table border=1>
			<th>Sl.No</th>
			<th>User Name</th>
			<th>Created By</th>
			<th>CreatedDate</th>
			<th>Edit</th>
			<th>Delete</th>
		

			<c:forEach items="${userList}" var="user">
				<tr>
				    <td></td>
					<td><a href="users/${user.userId}"><c:out value="${user.firstName} ${user.lastName}" /></td>
					<td><c:out value="${user.createdBy}" /></td>
					<td><c:out value="${user.createdDate}" /></td>
					<td><a href="users/${user.userId}/edit"> Edit </a></td>
					<td><a href="users/${user.userId}/delete"> Delete </a></td>
					
				</tr>

			</c:forEach>
		</table>
	</center>
</body>
</html>