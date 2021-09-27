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
		<U> PERSON DETAILS</U><br>
		<br> Name : ${person.firstName} ${person.lastName}<br>
		<br> Gender: ${person.gender}<br>
		<br> Email : ${person.emailId}<br>
		<br> Date Of Birth : ${person.dateOfBirth}<br>
		<br> Role : ${person.role}<br>
		<br> Age : ${person.age}<br>
		<br> Nationality : ${person.nationality}<br>
		<br> IMDB Profile Link : <a href="${person.imdbLink}">${person.imdbLink}<br>
	   
			<br>
	</center>
</body>
</html>