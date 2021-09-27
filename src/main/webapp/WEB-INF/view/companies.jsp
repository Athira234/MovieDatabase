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
		<U>COMPANY LIST</U> 
		<br> <br> <a href="companies/add"> <input
			type="submit" value="ADD NEW COMPANY" /></a><br> <br>
		<table border=1>
			<th>Sl.No</th>
			<th>Company Name</th>
			<th>Country</th>
			<th>Website</th>
			<th>Edit</th>
			<th>Delete</th>
		

			<c:forEach items="${companyList}" var="c">
				<tr>
				    <td></td>
					<td><a href="companies/${c.companyId}"><c:out value="${c.companyName}" /></td>
					<td><c:out value="${c.country}" /></td>
					<td><c:out value="${c.website}" /></td>
					<td><a href="companies/edit/${c.companyId}"> Edit </a></td>
					<td><a href="companies/delete/${c.companyId}"> Delete </a></td>
					
				</tr>

			</c:forEach>
		</table>
	</center>
</body>
</html>