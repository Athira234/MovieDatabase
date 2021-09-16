package com.entlogics.moviedb.user;

import java.util.List;

import com.entlogics.moviedb.movie.Movie;



public class UserService {
	// Method for rating a movie
	void rateMovie(UserMovie userMovie) {
		
	}

	// Method for giving feedback for a movie

	void giveMovieFeedback(UserMovie userMovie) {
		// return null;
	}

	// Method for adding a movie to watchlist
	void addMovieToWatchlist(UserWatchList watchList, Movie movie) {
		//return null;
	}

	// Method for adding movie to favourites
	void  addMovieToFavourites(UserMovie userMovie) {
		//return null;
	}

	// Method for recommending a movie to another user
	void recommendMovie(UserMovie userMovie) {
		//return null;
	}

	// Method for viewing watchlist
	List<UserWatchListItems> getWatchList(int userId,int watchListId) {
		return null;
	}

	// Method for viewing favourites
	List<UserMovie> getFavourites(int userId) {
		return null;
	}

	// Method for viewing ratings
	List<UserMovie> viewRatings(int userId,int movieId) {
		return null;
	}

	// Method for viewing feedback

	List<UserMovie> viewFeedbacks(int userId,int movieId) {
		return null;
	}

	// Method for viewing his/her profile
	List<User> viewProfile(int userId) {
		return null;
	}

	// Method for editing his/her profile
       void editProfile(User user,int userId) {
		
	}

	// Method for changing password
	void updatePassword(User user) {
		
	}

	// Method for signs up for a new account
	void signUp() {
		
	}

	// Method for login
	void login() {
		
	}
	// Method for logouts of the system

	void logout() {
		
	}

}
