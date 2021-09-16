package com.entlogics.moviedb.user;

import java.util.List;

import com.entlogics.moviedb.movie.Movie;

public class UserRepository implements IUserRepository {

	@Override
	public void rateMovie(UserMovie userMovie) {
		System.out.println("Inside rateMovie() method in UserRepository");

	}

	@Override
	public void giveMovieFeedback(UserMovie userMovie) {
		System.out.println("Inside giveMovieFeedback() method in UserRepository");

	}

	@Override
	public void addMovieToWatchlist(UserWatchList watchList, Movie movie) {
		System.out.println("Inside addMovieToWatchlist() method in UserRepository");

	}

	@Override
	public void addMovieToFavourites(UserMovie userMovie) {
		System.out.println("Inside addMovieToFavourites() method in UserRepository");

	}

	@Override
	public void recommendMovie(UserMovie userMovie) {
		System.out.println("Inside recommendMovie() method in UserRepository");
	}

	@Override
	public List<UserWatchListItems> findWatchList(int userId, int watchListId) {
		System.out.println("Inside findWatchList() method in UserRepository");
		return null;
	}

	@Override
	public List<Movie> findFavourites(int userId) {
		System.out.println("Inside findFavourites() method in UserRepository");
		return null;
	}

	@Override
	public List<Movie> findRatings(int userId, int movieId) {
		System.out.println("Inside findRatings() method in UserRepository");
		return null;
	}

	@Override
	public List<Movie> findFeedbacks(int userId, int movieId) {
		System.out.println("Inside findFeedbacks() method in UserRepository");
		return null;
	}

	@Override
	public User findProfile(int userId) {
		System.out.println("Inside findProfile() method in UserRepository");
		return null;
	}

	@Override
	public void updateProfile(User user) {
		System.out.println("Inside updateProfile() method in UserRepository");

	}

	@Override
	public void updatePassword(User user) {
		System.out.println("Inside updatePassword() method in UserRepository");

	}

	@Override
	public void signUp() {
		System.out.println("Inside signUp()  method in UserRepository");

	}

	@Override
	public void login() {
		System.out.println("Inside login()  method in UserRepository");

	}

	@Override
	public void logout() {
		System.out.println("Inside logout()  method in UserRepository");
	}

}
