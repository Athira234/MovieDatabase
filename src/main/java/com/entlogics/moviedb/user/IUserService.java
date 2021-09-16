package com.entlogics.moviedb.user;

import java.util.List;

import com.entlogics.moviedb.movie.Movie;

public interface IUserService {
	public void rateMovie(UserMovie userMovie);

	public void giveMovieFeedback(UserMovie userMovie);

	public void addMovieToWatchlist(UserWatchList watchList, Movie movie);

	public void addMovieToFavourites(UserMovie userMovie);

	public void recommendMovie(UserMovie userMovie);

	public List<UserWatchListItems> getWatchList(int userId, int watchListId);

	public List<UserMovie> getFavourites(int userId);

	public List<UserMovie> viewRatings(int userId, int movieId);

	public List<UserMovie> viewFeedbacks(int userId, int movieId);

	public List<User> viewProfile(int userId);

	public void editProfile(User user, int userId);

	public void updatePassword(User user);

	public void signUp();

	public void login();

	public void logout();
}
