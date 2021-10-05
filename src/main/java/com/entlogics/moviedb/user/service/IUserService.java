package com.entlogics.moviedb.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.entlogics.moviedb.movie.entities.Movie;
import com.entlogics.moviedb.user.entities.User;
import com.entlogics.moviedb.user.entities.UserMovie;
import com.entlogics.moviedb.user.entities.UserWatchList;
import com.entlogics.moviedb.user.entities.UserWatchListItems;

public interface IUserService {
	
	public void rateMovie(UserMovie userMovie);

	public void giveMovieFeedback(UserMovie userMovie);

	public void addMovieToWatchlist( UserWatchListItems watchListItem);

	public void addMovieToFavourites(UserMovie userMovie);

	public void recommendMovie(UserMovie userMovie);

	public List<UserWatchListItems> getWatchList(int userId);

	public List<Movie> getFavourites(int userId);

	public List<UserMovie> getRatings(int userId);

	public List<UserMovie> getFeedbacks(int userId);
	
	
	public List<UserWatchList> getWatchListsOfUser(int userId);

	public User getProfile(int userId);

	public void editProfile(User user);

	public void updatePassword(User user);

	public void signUp();

	public void login();

	public void logout();
}
