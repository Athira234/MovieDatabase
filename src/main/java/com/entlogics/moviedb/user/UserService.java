package com.entlogics.moviedb.user;

import java.util.List;

import com.entlogics.moviedb.movie.Movie;

public class UserService implements IUserService {
	// Method for rating a movie
	@Override
	public void rateMovie(UserMovie userMovie) {
		System.out.println("Inside rateMovie() method in UserService");
	}

	// Method for giving feedback for a movie
	@Override
	public void giveMovieFeedback(UserMovie userMovie) {
		System.out.println("Inside giveMovieFeedback() method in UserService");
	}

	// Method for adding a movie to watchlist
	@Override
	public void addMovieToWatchlist(UserWatchList watchList, Movie movie) {
		System.out.println("Inside addMovieToWatchlist() method in UserService");
	}

	// Method for adding movie to favourites
	@Override
	public void addMovieToFavourites(UserMovie userMovie) {
		System.out.println("Inside addMovieToFavourites() method in UserService");
	}

	// Method for recommending a movie to another user
	@Override
	public void recommendMovie(UserMovie userMovie) {
		System.out.println("Inside recommendMovie() method in UserService");
	}

	// Method for viewing watchlist
	@Override
	public List<UserWatchListItems> getWatchList(int userId, int watchListId) {
		System.out.println("Inside getWatchList() method in UserService");
		return null;
	}

	// Method for viewing favourites
	@Override
	public List<Movie> getFavourites(int userId) {
		System.out.println("Inside getFavourites() method in UserService");
		return null;
	}

	// Method for viewing ratings
	@Override
	public List<Movie> getRatings(int userId, int movieId) {
		System.out.println("Inside getRatings() method in UserService");
		return null;
	}

	// Method for viewing feedback
	@Override
	public List<Movie> getFeedbacks(int userId, int movieId) {
		System.out.println("Inside  getFeedbacks() method in UserService");
		return null;
	}

	// Method for viewing his/her profile
	@Override
	public User getProfile(int userId) {
		System.out.println("Inside  getProfile() method in UserService");
		return null;
	}

	// Method for editing his/her profile
	@Override
	public void editProfile(User user) {
		System.out.println("Inside  editProfile() method in UserService");
	}

	// Method for changing password
	@Override
	public void updatePassword(User user) {
		System.out.println("Inside updatePassword() method in UserService");
	}

	// Method for signs up for a new account
	@Override
	public void signUp() {
		System.out.println("Inside signUp() method in UserService");
	}

	// Method for login
	@Override
	public void login() {
		System.out.println("Inside login() method in UserService");
	}

	// Method for logouts of the system
	@Override
	public void logout() {
		System.out.println("Inside logout() method in UserService");

	}

}
