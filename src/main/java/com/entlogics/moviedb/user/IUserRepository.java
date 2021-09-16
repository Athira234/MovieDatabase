package com.entlogics.moviedb.user;

import java.util.List;

import com.entlogics.moviedb.movie.Movie;

public interface IUserRepository {
	
	public void rateMovie(UserMovie userMovie);

	public void giveMovieFeedback(UserMovie userMovie);

	public void addMovieToWatchlist(UserWatchList watchList, Movie movie);

	public void addMovieToFavourites(UserMovie userMovie);

	public void recommendMovie(UserMovie userMovie);

	public List<UserWatchListItems> findWatchList(int userId, int watchListId);

	public List<Movie> findFavourites(int userId);

	public List<Movie> findRatings(int userId, int movieId);

	public List<Movie> findFeedbacks(int userId, int movieId);

	public User findProfile(int userId);

	public void updateProfile(User user);

	public void updatePassword(User user);

	public void signUp();

	public void login();

	public void logout();
}
