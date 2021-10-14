
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ADMIN</title>
</head>
<body>
	<center>
		WELCOME ${name}<br>
		
		<a href="users/${user.userId}/profile">Your Profile</a><br><br><br>
		<br> <A href="companies">List of all Companies</A><br>
		<br> <A href="movies">List of all Movies</A><br>
		<br> <A href="persons">List of all Persons</A><br>
		<br> <A href="genre">List of all Genre</A><br>
		<br> <A href="users">List of all Users</A><br>
		<br>
	</center>
</body>
</html>