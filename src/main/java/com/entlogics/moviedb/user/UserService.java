package com.entlogics.moviedb.user;

import java.util.List;

import com.entlogics.moviedb.movie.Movie;

public class UserService implements IUserService {
	// Method for rating a movie
	@Override
	public void rateMovie(UserMovie userMovie) {

	}

	// Method for giving feedback for a movie
	@Override
	public void giveMovieFeedback(UserMovie userMovie) {
		
	}

	// Method for adding a movie to watchlist
	@Override
	public void addMovieToWatchlist(UserWatchList watchList, Movie movie) {
		
	}

	// Method for adding movie to favourites
	@Override
	public void addMovieToFavourites(UserMovie userMovie) {
		
	}

	// Method for recommending a movie to another user
	@Override
	public void recommendMovie(UserMovie userMovie) {
	
	}

	// Method for viewing watchlist
	@Override
	public List<UserWatchListItems> getWatchList(int userId, int watchListId) {
		
		return null;
	}

	// Method for viewing favourites
	@Override
	public List<Movie> getFavourites(int userId) {
		return null;
	}

	// Method for viewing ratings
	@Override
	public List<Movie> viewRatings(int userId, int movieId) {
		return null;
	}

	// Method for viewing feedback
	@Override
	public List<Movie> viewFeedbacks(int userId, int movieId) {
		return null;
	}

	// Method for viewing his/her profile
	@Override
	public User viewProfile(int userId) {
		return null;
	}

	// Method for editing his/her profile
	@Override
	public void editProfile(User user) {

	}

	// Method for changing password
	@Override
	public void updatePassword(User user) {

	}

	// Method for signs up for a new account
	@Override
	public void signUp() {

	}

	// Method for login
	@Override
	public void login() {

	}

	// Method for logouts of the system
	@Override
	public void logout() {

	}

}
