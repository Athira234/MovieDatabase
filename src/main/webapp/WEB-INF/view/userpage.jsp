
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>
	<center>
		WELCOME ${name}<br><br>
<a href="users/${user.userId}/profile">Your Profile</a><br><br><br>
<a href="users/${user.userId}/watchlist">View Watchlist</a><br><br>
<a href="users/${user.userId}/editprofile">Edit user Profile</a><br><br>
<a href="users/${user.userId}/password">Edit User Password</a><br><br>
<A href="users/${user.userId}/movies/3/ratings">Give rating</A><br><br>
<A href="users/${user.userId}/movies/4/feedbacks">Give Feedback</A><br><br>
<A href="users/${user.userId}/favourite">Add Movie to Favourites</A><br><br>
<A href="users/${user.userId}/recommend">Recommend Movie</A><br><br>
<A href="users/${user.userId}/favourites">List of Favourites</A><br><br>
<A href="users/${user.userId}/viewratings">Ratings</A><br><br>
<A href="users/${user.userId}/viewfeedbacks">Feedbacks</A><br><br>
<A href="logout">logout</A>

		<br><br>
		
	</center>
</body>
</html>