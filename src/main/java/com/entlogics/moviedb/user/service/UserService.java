package com.entlogics.moviedb.user.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.entlogics.moviedb.movie.entities.Movie;
import com.entlogics.moviedb.user.entities.User;
import com.entlogics.moviedb.user.entities.UserMovie;
import com.entlogics.moviedb.user.entities.UserWatchList;
import com.entlogics.moviedb.user.entities.UserWatchListItems;
import com.entlogics.moviedb.user.repository.IUserRepository;

@Service
 
public class UserService implements IUserService {

	IUserRepository userRepo;

	@Autowired
	public void setUserRepo(IUserRepository userRepo) {
		this.userRepo = userRepo;
	}

	// Method for rating a movie
	@Override
	public void rateMovie(UserMovie userMovie) {
		System.out.println("Inside rateMovie() method in UserService");
		userRepo.rateMovie(userMovie);
		// userRepo.rateMovie(userId,movieId);
	}

	// Method for giving feedback for a movie
	@Override
	public void giveMovieFeedback(UserMovie userMovie) {
		System.out.println("Inside giveMovieFeedback() method in UserService");
		userRepo.giveMovieFeedback(userMovie);
	}

	// Method for adding a movie to watchlist
	@Override
	public void addMovieToWatchlist( UserWatchListItems watchListItem) {
		System.out.println("Inside addMovieToWatchlist() method in UserService");
		userRepo.addMovieToWatchlist(watchListItem);
	}

	// Method for adding movie to favourites
	@Override
	public void addMovieToFavourites(UserMovie userMovie) {
		System.out.println("Inside addMovieToFavourites() method in UserService");
		userRepo.addMovieToFavourites(userMovie);
	}

	// Method for recommending a movie to another user
	@Override
	public void recommendMovie(UserMovie userMovie) {
		System.out.println("Inside recommendMovie() method in UserService");
		userRepo.recommendMovie(userMovie);
	}

	// Method for viewing watchlist
	@Override
	public List<UserWatchListItems> getWatchList(int userId) {
		System.out.println("Inside getWatchList() method in UserService");
		List<UserWatchListItems> watchlistItems = userRepo.findWatchList(userId);
		return watchlistItems;
	}

	// Method for viewing favourites
	@Override
	public List<Movie> getFavourites(int userId) {
		System.out.println("Inside getFavourites() method in UserService");
		List<Movie> movies = userRepo.findFavourites(userId);
		return movies;
	}

	// Method for viewing ratings
	@Override
	public List<UserMovie> getRatings(int userId) {
		System.out.println("Inside getRatings() method in UserService");
		List<UserMovie> userMovies = userRepo.findRatings(userId);
		return userMovies;
	}

	// Method for viewing feedback
	@Override
	public List<UserMovie> getFeedbacks(int userId) {
		System.out.println("Inside  getFeedbacks() method in UserService");
		List<UserMovie> userMovies = userRepo.findFeedbacks(userId);
		return userMovies;
	}

	// Method for viewing his/her profile
	@Override
	public User getProfile(int userId) {
		System.out.println("Inside  getProfile() method in UserService");
		User user = userRepo.findProfile(userId);
		return user;
	}

	// Method for editing his/her profile
	@Override
	public void editProfile(User user) {
		System.out.println("Inside  editProfile() method in UserService");
		userRepo.updateProfile(user);
	}

	// Method for changing password
	@Override
	public void updatePassword(User user) {
		System.out.println("Inside updatePassword() method in UserService");
		userRepo.updatePassword(user);
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

	@Override
	public List<UserWatchList> getWatchListsOfUser(int userId) {
		 List<UserWatchList> watchLists=userRepo.findWatchListsOfUser(userId);
		return watchLists;
	}

}
