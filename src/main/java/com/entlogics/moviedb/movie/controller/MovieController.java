package com.entlogics.moviedb.movie.controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.entlogics.moviedb.admin.entities.Company;
import com.entlogics.moviedb.admin.entities.Person;
import com.entlogics.moviedb.admin.service.IAdminService;
import com.entlogics.moviedb.movie.entities.Movie;
import com.entlogics.moviedb.movie.entities.MovieCast;
import com.entlogics.moviedb.movie.entities.MovieCompany;
import com.entlogics.moviedb.movie.entities.MovieCrew;
import com.entlogics.moviedb.movie.entities.MovieDto;
import com.entlogics.moviedb.movie.entities.MovieGenre;
import com.entlogics.moviedb.movie.service.IMovieService;

@Controller
public class MovieController {

	IMovieService iMovieService;
	IAdminService iAdminService;

	@Autowired
	public void setiAdminService(IAdminService iAdminService) {
		this.iAdminService = iAdminService;
	}

	@Autowired
	public void setiMovieService(IMovieService iMovieService) {
		this.iMovieService = iMovieService;
	}

	// get list of Movies
	@RequestMapping(value = "/movies", method = RequestMethod.GET)
	public String getAllMovies(Model model) {
		System.out.println("Inside AdminController getAllMovies()");
		List<MovieDto> movies = iMovieService.getAllMovies();
		// get list of company
		List<Company> companies = iAdminService.getAllCompanies();
		System.out.println("Movies :" + movies);
		model.addAttribute("movieList", movies);
		model.addAttribute("companyList", companies);
		return "movies";
	}

	// method to find toprating movies
	@RequestMapping()
	public String getTopRatingMovies() {

		return null;

	}

	// method to find highest gross Movies
	public String getHighestGrossMovies() {
		return null;

	}

	// method to find Top Recommended Movies
	public String getTopRecommendedMovies() {
		return null;

	}

	// method to find ratings of a Movie
	public String getRatingsOfMovie() {
		return null;

	}

	// method to find cast of a Movie
	@RequestMapping("movies/{movieId}/cast")
	public String getCastOfMovie(@PathVariable int movieId, Model model) {
		System.out.println("Inside getCastOfMovie() in movieController ");
		// call service class methods
		MovieDto moviedto = iMovieService.getCastOfMovie(movieId);
		// get movie cast
		List<MovieCast> movieCast = moviedto.getMovieCast();
		// create list of persons
		List<Person> persons = new ArrayList<Person>();
		// get persons in movie cast
		for (MovieCast cast : movieCast) {
			Person person = new Person();
			person = cast.getPerson();
			persons.add(person);
		}
		model.addAttribute("persons", persons);
		model.addAttribute("movieCast", movieCast);
		return "moviecast";

	}

	// method to find crew of a Movie
	@RequestMapping("movies/{movieId}/crew")
	public String getCrewOfMovie(@PathVariable int movieId, Model model) {
		System.out.println("Inside getCrewOfMovie() in movieController ");
		// call service class methods
		MovieDto moviedto = iMovieService.getCrewOfMovie(movieId);
		// get movie crew
		List<MovieCrew> movieCrew = moviedto.getMovieCrew();
		// create list of persons
		List<Person> persons = new ArrayList<Person>();
		// get persons in movie crew
		for (MovieCrew crew : movieCrew) {
			Person person = new Person();
			person = crew.getPerson();
			persons.add(person);
		}
		model.addAttribute("persons", persons);
		model.addAttribute("movieCrew", movieCrew);
		return "moviecrew";

	}

	// method to add cast to movie
	public String addCast() {
		return null;

	}

	// method to add crew to movie

	public String addCrew() {
		return null;

	}

	// method to delete person from cast
	@RequestMapping("/movies/{movieId}/cast/delete")
	public String deleteCast(@RequestParam(value = "personId") int personId, @PathVariable int movieId) {
		System.out.println("Inside deleteCast() in movieController ");
		// call delete cast method in movie service
		iMovieService.deleteCast(personId);
		return "success";

	}

	// method to delete person from crew
	@RequestMapping("/movies/{movieId}/crew/delete")
	public String deleteCrew(@RequestParam(value = "personId") int personId, @PathVariable int movieId) {
		System.out.println("Inside deleteCrew() in movieController ");
		// call delete crew method in movie service
		iMovieService.deleteCrew(personId);
		return "success";

	}

	// method to get Movie by Company
	@RequestMapping("moviesbycompany")
	public String movieByCompany(@RequestParam(value = "companyId") int companyId, Model model) {

		System.out.println("Inside movieByCompany() in movieController ");
		// call service class methods
		MovieDto moviedto = iMovieService.movieByCompany(companyId);
		// Create List of MovieCompany
		List<MovieCompany> movieCompanies = moviedto.getMovieCompanies();
		// create list of movies
		List<Movie> movies = new ArrayList<Movie>();
		// get persons in movie crew
		for (MovieCompany movieCompany : movieCompanies) {
			// create movie object and get movie by company
			Movie movie = new Movie();
			movie = movieCompany.getMovie();
			// add movies to list
			movies.add(movie);
		}
		model.addAttribute("movies", movies);
		return "moviebycompany";

	}

	// method to get Movie by actor
	public String movieByActor(@RequestParam(value = "personId") int personId, Model model) {

		System.out.println("Inside movieByActor() in movieController ");

		// call service class methods
		MovieDto moviedto = iMovieService.movieByActor(personId);
		// Create List of MovieCast
		List<MovieCast> movieCasts = moviedto.getMovieCast();
		// create list of movies
		List<Movie> movies = new ArrayList<Movie>();
		// get persons in movie crew
		for (MovieCast movieCast : movieCasts) {
			// create movie object and get movie by actor/cast
			Movie movie = new Movie();
			movie = movieCast.getMovie();
			// add movies to list
			movies.add(movie);
		}
		model.addAttribute("movies", movies);
		return "moviebyactor";

	}

	// method to get Movie by genre
	@RequestMapping("moviesbygenre")
	public String movieByGenre(@RequestParam(value = "genreId") int genreId, Model model) {
		System.out.println("Inside movieByGenre() in movieController ");
		// call service class methods
		MovieDto moviedto = iMovieService.movieByGenre(genreId);
		// Create List of MovieGenre
		List<MovieGenre> movieGenre = moviedto.getMovieGenres();
		// create list of movies
		List<Movie> movies = new ArrayList<Movie>();
		// get persons in movie crew
		for (MovieGenre genre : movieGenre) {
			// create movie object and get movie by genre
			Movie movie = new Movie();
			movie = genre.getMovie();
			// add movies to list
			movies.add(movie);
		}
		model.addAttribute("movies", movies);
		return "moviebygenre";

	}

	// method to get Movie by Title
	public String movieByTitle(@RequestParam(value = "movieTitle") String movieTitle, Model model) {
		System.out.println("Inside movieByGenre() in movieController ");
		// call service class methods
		List<MovieDto> movies = iMovieService.movieByTitle(movieTitle);
		model.addAttribute("movies", movies);
		return "moviebytitle";

	}

}
