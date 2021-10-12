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
import com.entlogics.moviedb.movie.entities.MovieDto;
import com.entlogics.moviedb.movie.service.IMovieService;
import com.entlogics.moviedb.user.entities.User;
import com.entlogics.moviedb.user.entities.UserMovie;
import com.entlogics.moviedb.user.entities.UserWatchList;
import com.entlogics.moviedb.user.entities.UserWatchListItems;
import com.entlogics.moviedb.user.service.IUserService;
@Controller
public class UserController {

	
	IAdminService iAdminService;
	IMovieService iMovieService;
	@Autowired
	public void setiMovieService(IMovieService iMovieService) {
		this.iMovieService = iMovieService;
	}
	@Autowired
	public void setiAdminService(IAdminService iAdminService) {
		this.iAdminService = iAdminService;
	}
	IUserService iUserService;
	@Autowired
	public void setiUserService(IUserService iUserService) {
		this.iUserService = iUserService;
	}

	// Method for rating a movie
	@RequestMapping("users/{userId}/movies/{movieId}/ratings")
	public String rateMovieForm(@PathVariable int movieId,@PathVariable int userId, Model model) {
		System.out.println("Inside rateMovie() method in UserController");
		Movie movie=iMovieService.getMovie(movieId);
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
		
		Movie movie=iMovieService.getMovie(movieId);
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
		
		Movie movie=iMovieService.getMovie(movieId);
		User user=iUserService.getProfile(userId);
		UserMovie userMovie1=new UserMovie();
		userMovie.setMovie(movie);
		userMovie.setUser(user);
		System.out.println("User  Details"+userMovie.getUser()+"movie"+userMovie.getMovie());
	    iUserService.giveMovieFeedback(userMovie);
		return "success";
	}
	// Method for adding a movie to watchlist
	@RequestMapping("users/{userId}/watchlist/items")
	public String addMovieToWatchlist(@PathVariable int userId,Model model) {
		System.out.println("Inside addMovieToWatchlist() method in UserController");
		//create UserWatchListItems object
		UserWatchListItems watchListItem=new UserWatchListItems();
		//get List of movies
		List<MovieDto> movies=iMovieService.getAllMovies();
		//get List of WatchLists
		List<UserWatchList> watchLists=iUserService.getWatchListsOfUser(userId);
		//add watchLists to Model
		model.addAttribute("watchLists",watchLists);
		//add watchListItem to Model
		model.addAttribute("watchListItem",watchListItem);
		//add movies to Model
		model.addAttribute("movies", movies);
		return "movie-to-watchlist-form";
	}
	
	@RequestMapping("users/{userId}/watchlist/save")
	public String saveMovieToWatchlist(@ModelAttribute("watchListItem") UserWatchListItems watchListItem){
		System.out.println("Inside saveMovieToWatchlist() method in UserController");
		iUserService.addMovieToWatchlist(watchListItem);
		return "success";
	}
	// Method for adding movie to favourites
	@RequestMapping("users/{userId}/favourite")
	public String addMovieToFavourites(Model model) {
		System.out.println("Inside addMovieToFavourites() method in UserController");
		//create UserMovie Object
		UserMovie userMovie=new UserMovie();
		//get list of movies
		List<MovieDto> movies=iMovieService.getAllMovies();
		
		Movie movie=new Movie();
		//add movies list to model
		model.addAttribute("movies", movies);
		model.addAttribute("movie",movie);
		return "add-to-favourites-form";
	}
	@RequestMapping("users/{userId}/favourite/save")
	public String saveMovieToFavourites(@PathVariable int userId,@ModelAttribute("movie") Movie movie) {
		System.out.println("Inside saveMovieToFavourites() method in UserController");
		User user=iUserService.getProfile(userId);
		UserMovie userMovie=new UserMovie();
		userMovie.setUser(user);
		userMovie.setMovie(movie);
		iUserService.addMovieToFavourites(userMovie);
		return "success";
	}

	// Method for recommending a movie to another user
	@RequestMapping("users/{userId}/recommend")
	public String recommendMovie(Model model) {
		System.out.println("Inside recommendMovie() method in UserController");
		//create UserMovie Object
				UserMovie userMovie=new UserMovie();
				//get list of movies
				List<MovieDto> movies=iMovieService.getAllMovies();
				
				Movie movie=new Movie();
				//add movies list to model
				model.addAttribute("movies", movies);
				model.addAttribute("movie",movie);
				return "recommend-movie-form";
	
	}
	//save recommendation method
	@RequestMapping("users/{userId}/recommend/save")
	public String saveRecommendMovie(@PathVariable int userId,@ModelAttribute("movie") Movie movie) {
		System.out.println("Inside saveMovieToFavourites() method in UserController");
		User user=iUserService.getProfile(userId);
		UserMovie userMovie=new UserMovie();
		userMovie.setUser(user);
		userMovie.setMovie(movie);
		iUserService.recommendMovie(userMovie);
		return "success";
	}

	// Method for viewing watchlist

	@RequestMapping("users/{userId}/watchlist")
	public String viewWatchList(@PathVariable int userId, Model model) {
		System.out.println("Inside viewWatchList method in UserController");
		List<UserWatchListItems> watchListItems = iUserService.getWatchList(userId);
		ListIterator litr = watchListItems.listIterator();
		List<Movie> movies=new ArrayList<Movie>();
		while (litr.hasNext()) {
			UserWatchListItems watchlistItem = (UserWatchListItems) litr.next();
		    movies.add(iMovieService.getMovie(watchlistItem.getMovieId()));
			
		}
		System.out.println("WatchListItems  =" +watchListItems);
		System.out.println("WatchListItems Details =" +movies);
		model.addAttribute("userId",userId);
		model.addAttribute("movies",movies);
		model.addAttribute("watchList", watchListItems);
		return "watchlist";

	}

	// Method for viewing favourites
	@RequestMapping("users/{userId}/favourites")
	public String viewFavourites(@PathVariable int userId,Model model) {
		System.out.println("Inside viewFavourites method in UserController");
		List<Movie> movies=iUserService.getFavourites(userId);
		System.out.println("movie list"+movies);
		model.addAttribute("movies",movies);
		return "favourites-list";
	}

	// Method for viewing ratings
	@RequestMapping("users/{userId}/viewratings")
	public String viewRatings(@PathVariable int userId,Model model) {
		System.out.println("Inside viewRatings method in UserController");
		List<UserMovie> userMovies=iUserService.getRatings(userId);
		ListIterator litr = userMovies.listIterator();
		List<Movie> movies=new ArrayList<Movie>();
		while (litr.hasNext()) {
			UserMovie userMovie= (UserMovie) litr.next();
		    movies.add(userMovie.getMovie());
			
		}
		model.addAttribute("userMovies",userMovies);
		model.addAttribute("movies",movies);
		return "view-ratings";
	}

	// Method for viewing feedback
	@RequestMapping("users/{userId}/viewfeedbacks")
	public String viewFeedbacks(@PathVariable int userId,Model model) {
		System.out.println("Inside viewFeedbacks method in UserController");
		List<UserMovie> userMovies=iUserService.getFeedbacks(userId);
		ListIterator litr = userMovies.listIterator();
		List<Movie> movies=new ArrayList<Movie>();
		while (litr.hasNext()) {
			UserMovie userMovie= (UserMovie) litr.next();
		    movies.add(userMovie.getMovie());
			
		}
		model.addAttribute("userMovies",userMovies);
		model.addAttribute("movies",movies);
		System.out.println("Movies "+ movies);
		System.out.println("UserMovies "+userMovies);
		return "view-feedbacks";
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
