package com.entlogics.moviedb.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {
	
	IUserService iUserService;
	
    @Autowired
	public void setiUserService(IUserService iUserService) {
		this.iUserService = iUserService;
	}

	//Method for rating a movie
    @RequestMapping("/users/{userId}/movies/{movieId}/ratings")
	public String rateMovieForm(@PathVariable int userId)
	{
		System.out.println("Inside rateMovie() method in UserController");
		//User user=iUserService.getUser();
		iUserService.rateMovie(1,1);
		return null;
	}
	
	//Method for  giving  feedback for a movie
	
	public String giveMovieFeedback()
	{ 
		System.out.println("Inside giveMovieFeedback() method in UserController");
		return null;
	}
	//Method for  adding a movie to watchlist
	public String addMovieToWatchlist()
	{
		System.out.println("Inside addMovieToWatchlist() method in UserController");
		return null;
	}
	
	//Method for  adding movie to favourites
	public String addMovieToFavourites()
	{
		System.out.println("Inside addMovieToFavourites() method in UserController");
		return null;
	}
	
	//Method for recommending a movie to another user
	public String recommendMovie()
	{
		System.out.println("Inside recommendMovie() method in UserController");
		return null;
	}
	
	//Method for viewing watchlist
	public String viewWatchList()
	{
		System.out.println("Inside viewWatchList method in UserController");
		return null;
	}
	
	//Method for viewing  favourites
	public String viewFavourites()
	{
		System.out.println("Inside viewFavourites method in UserController");
		return null;
	}
	
	//Method for viewing  ratings
	public String viewRatings()
	{
		System.out.println("Inside viewRatings method in UserController");
		return null;
	}
	
	//Method for viewing feedback
	
	public String viewFeedbacks()
	{
		System.out.println("Inside viewFeedbacks method in UserController");
		return null;
	}
	
	//Method for viewing his/her profile
	@RequestMapping("/users/{userId}/profile")
	public String viewProfile(@PathVariable int userId, Model model)
	{
		System.out.println("Inside viewProfile method in UserController");
		User user = iUserService.getProfile(userId);
		model.addAttribute("user", user);
		return "user-profile";
 	}
	
	
	//Method for  editing his/her profile
	public String editProfileform()
	{
		System.out.println("Inside editProfileform method in UserController");
		return null;
	}
	
	
	//Method for  changing password
	public String updatePassword()
	{
		System.out.println("Inside updatePassword method in UserController");
		return null;
	}
	
	//Method for signs up for a new account
	public String signUpform()
	{
		System.out.println("Inside signUpform() method in UserController");
		return null;
	}
	
	//Method for  login
	public String login()
	{
		System.out.println("Inside login() method in UserController");
		return null;
	}
	//Method for  logouts of the system
	
	public String logout()
	{
		System.out.println("Inside logout() method in UserController");
		return null;
	}
	
	
	
	
}
