package com.entlogics.moviedb.user.repository;
import java.util.List;
import org.springframework.stereotype.Component;

import com.entlogics.moviedb.login.entities.Login;
import com.entlogics.moviedb.movie.entities.Movie;
import com.entlogics.moviedb.user.entities.User;
import com.entlogics.moviedb.user.entities.UserMovie;
import com.entlogics.moviedb.user.entities.UserWatchList;
import com.entlogics.moviedb.user.entities.UserWatchListItems;

@Component
public interface IUserRepository {
	
	public void rateMovie(UserMovie usermovie);

	public void giveMovieFeedback(UserMovie userMovie);

	public void addMovieToWatchlist( UserWatchListItems watchListItem );

	public void addMovieToFavourites(UserMovie userMovie);

	public void recommendMovie(UserMovie userMovie);

	public List<UserWatchListItems> findWatchList(int userId);

	public List<Movie> findFavourites(int userId);

	public List<UserMovie> findRatings(int userId);

	public List<UserMovie> findFeedbacks(int userId);
	
	public List<UserWatchList> findWatchListsOfUser(int userId);

	public User findProfile(int userId);

	public void updateProfile(User user);

	public void updatePassword(User user);
	public User validateUser(Login login);

	
}
