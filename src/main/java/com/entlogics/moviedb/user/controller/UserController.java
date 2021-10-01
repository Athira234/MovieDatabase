package com.entlogics.moviedb.user.controller;
import java.util.ArrayList;

import java.util.List;
import java.util.ListIterator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entlogics.moviedb.admin.service.IAdminService;
import com.entlogics.moviedb.movie.entities.Movie;
import com.entlogics.moviedb.user.entities.User;
import com.entlogics.moviedb.user.entities.UserMovie;
import com.entlogics.moviedb.user.entities.UserWatchListItems;
import com.entlogics.moviedb.user.service.IUserService;
@Controller
public class UserController {

	IUserService iUserService;
	IAdminService iAdminService;
	@Autowired
	public void setiAdminService(IAdminService iAdminService) {
		this.iAdminService = iAdminService;
	}

	@Autowired
	public void setiUserService(IUserService iUserService) {
		this.iUserService = iUserService;
	}

	// Method for rating a movie
	@RequestMapping("users/{userId}/movies/{movieId}/ratings")
	public String rateMovieForm(@PathVariable int movieId,@PathVariable int userId, Model model) {
		System.out.println("Inside rateMovie() method in UserController");
		Movie movie=iAdminService.getMovie(movieId);
		User user=iUserService.getProfile(userId);
		UserMovie userMovie=new UserMovie();
		userMovie.setMovie(movie);
		userMovie.setUser(user);
		model.addAttribute("userMovie",userMovie);
		// User user=iUserService.getUser();
        return "rating-form";
	}
	@RequestMapping("users/{userId}/movies/{movieId}/ratings/ratingdetails")
	public String postRating(@PathVariable int movieId,@PathVariable int userId,@ModelAttribute("userMovie") UserMovie userMovie) {
		System.out.println("Inside postRating() method in UserController");
		
		Movie movie=iAdminService.getMovie(movieId);
		User user=iUserService.getProfile(userId);
		UserMovie userMovie1=new UserMovie();
		userMovie.setMovie(movie);
		userMovie.setUser(user);
		
		System.out.println("User  Details"+userMovie.getUser()+"movie"+userMovie.getMovie());
	
		iUserService.rateMovie(userMovie);
		
		// User user=iUserService.getUser();
        return "success";
	}

	// Method for giving feedback for a movie
	@RequestMapping("users/{userId}/movies/{movieId}/feedbacks")
	public String giveMovieFeedbackForm(@PathVariable int movieId,@PathVariable int userId, Model model) {
		System.out.println("Inside giveMovieFeedback() method in UserController");
		UserMovie userMovie=new UserMovie();
		model.addAttribute("userMovie",userMovie);
	    return "feedback-form";
	}
	@RequestMapping("users/{userId}/movies/{movieId}/ratings/feedbackdetails")
	public String postFeedback(@PathVariable int movieId,@PathVariable int userId,@ModelAttribute("userMovie") UserMovie userMovie) {
		System.out.println("Inside postRating() method in UserController");
		
		Movie movie=iAdminService.getMovie(movieId);
		User user=iUserService.getProfile(userId);
		UserMovie userMovie1=new UserMovie();
		userMovie.setMovie(movie);
		userMovie.setUser(user);
		System.out.println("User  Details"+userMovie.getUser()+"movie"+userMovie.getMovie());
	    iUserService.giveMovieFeedback(userMovie);
		return "success";
	}
	// Method for adding a movie to watchlist
	public String addMovieToWatchlist() {
		System.out.println("Inside addMovieToWatchlist() method in UserController");
		
		return null;
	}

	// Method for adding movie to favourites

	public String addMovieToFavourites() {
		System.out.println("Inside addMovieToFavourites() method in UserController");
		return null;
	}

	// Method for recommending a movie to another user
	public String recommendMovie() {
		System.out.println("Inside recommendMovie() method in UserController");
		return null;
	}

	// Method for viewing watchlist

	@RequestMapping("/users/{userId}/watchlist")
	public String viewWatchList(@PathVariable int userId, Model model) {
		System.out.println("Inside viewWatchList method in UserController");
		List<UserWatchListItems> watchListItems = iUserService.getWatchList(userId);
		ListIterator litr = watchListItems.listIterator();
		List<Movie> movies=new ArrayList<Movie>();
		while (litr.hasNext()) {
			UserWatchListItems watchlistItem = (UserWatchListItems) litr.next();
		    movies.add(iAdminService.getMovie(watchlistItem.getMovieId()));
			
		}
		System.out.println("WatchListItems=" +movies);
		model.addAttribute("movies",movies);
		model.addAttribute("watchList", watchListItems);
		return "watchlist";

	}

	// Method for viewing favourites
	public String viewFavourites() {
		System.out.println("Inside viewFavourites method in UserController");
		return null;
	}

	// Method for viewing ratings
	public String viewRatings() {
		System.out.println("Inside viewRatings method in UserController");
		return null;
	}

	// Method for viewing feedback

	public String viewFeedbacks() {
		System.out.println("Inside viewFeedbacks method in UserController");
		return null;
	}

	// Method for viewing his/her profile
	@RequestMapping("/users/{userId}/profile")
	public String viewProfile(@PathVariable int userId, Model model) {
		System.out.println("Inside viewProfile method in UserController");
		User user = iUserService.getProfile(userId);
		model.addAttribute("user", user);
		return "user-profile";
	}

	// Method for editing his/her profile
	@RequestMapping(value="/users/{userId}/editprofile")
	public String editProfileform(@PathVariable int userId, Model m) {
		System.out.println("Inside editProfileform method in UserController");
		User user=iUserService.getProfile(userId);
		m.addAttribute("user",user);
		return "edit-user-profile";
	
	}
	@RequestMapping("/users/{userId}/editprofile/editdetails")
	public String updateUser(@ModelAttribute("user") User user) {
		System.out.println("Inside updateUser() method in SchoolController ");
		User user1=iUserService.getProfile(user.getUserId());
		user1.setFirstName(user.getFirstName());
		user1.setLastName(user.getLastName());
		user1.setEmail(user.getEmail());
		iUserService.editProfile(user1);
		return "success";
	}
	// Method for changing password
	@RequestMapping(value="/users/{userId}/password")
	public String updatePassword(@PathVariable int userId, Model m) {
		System.out.println("Inside updatePassword method in UserController");
		User user=iUserService.getProfile(userId);
		m.addAttribute("user",user);
		return "edit-user-password-form";
		
	}
	@RequestMapping("/users/{userId}/password/editdetails")
	public String updatePassword(@ModelAttribute("user") User user) {
		System.out.println("Inside updatePassword() method in SchoolController ");
		User user1=iUserService.getProfile(user.getUserId());
		user1.setPassword(user.getPassword());
		iUserService.updatePassword(user1);
		return "success";
	}

	// Method for signs up for a new account
	public String signUpform() {
		System.out.println("Inside signUpform() method in UserController");
		return null;
	}

	// Method for login
	public String login() {
		System.out.println("Inside login() method in UserController");
		return null;
	}
	// Method for logouts of the system

	public String logout() {
		System.out.println("Inside logout() method in UserController");
		return null;
	}

}
