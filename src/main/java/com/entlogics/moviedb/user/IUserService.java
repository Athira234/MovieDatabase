package com.entlogics.moviedb.user;

import java.util.List;

import org.springframework.stereotype.Service;

import com.entlogics.moviedb.movie.Movie;
@Service
public interface IUserService {
	
	public void rateMovie(UserMovie userMovie);

	public void giveMovieFeedback(UserMovie userMovie);

	public void addMovieToWatchlist(int watchlistId,int movieId);

	public void addMovieToFavourites(UserMovie userMovie);

	public void recommendMovie(UserMovie userMovie);

	public List<UserWatchListItems> getWatchList(int userId);

	public List<Movie> getFavourites(int userId);

	public List<UserMovie> getRatings(int userId);

	public List<UserMovie> getFeedbacks(int userId);

	public User getProfile(int userId);

	public void editProfile(User user);

	public void updatePassword(User user);

	public void signUp();

	public void login();

	public void logout();
}
