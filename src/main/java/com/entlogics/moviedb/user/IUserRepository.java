package com.entlogics.moviedb.user;
import java.util.List;
import org.springframework.stereotype.Component;
import com.entlogics.moviedb.movie.Movie;

@Component
public interface IUserRepository {
	
	public void rateMovie(UserMovie usermovie);

	public void giveMovieFeedback(UserMovie userMovie);

	public void addMovieToWatchlist(int watchlistId,int movieId );

	public void addMovieToFavourites(UserMovie userMovie);

	public void recommendMovie(UserMovie userMovie);

	public List<UserWatchListItems> findWatchList(int userId);

	public List<Movie> findFavourites(int userId);

	public List<UserMovie> findRatings(int userId);

	public List<UserMovie> findFeedbacks(int userId);

	public User findProfile(int userId);

	public void updateProfile(User user);

	public void updatePassword(User user);

	public void signUp();

	public void login();

	public void logout();
}
