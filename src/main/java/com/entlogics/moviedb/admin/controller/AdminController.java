package com.entlogics.moviedb.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.entlogics.moviedb.admin.entities.Company;
import com.entlogics.moviedb.admin.entities.Genre;
import com.entlogics.moviedb.admin.entities.Person;
import com.entlogics.moviedb.admin.service.IAdminService;
import com.entlogics.moviedb.movie.entities.Movie;
import com.entlogics.moviedb.movie.entities.MovieDto;
import com.entlogics.moviedb.movie.service.IMovieService;
import com.entlogics.moviedb.user.entities.User;
import com.entlogics.moviedb.user.service.IUserService;

@Controller
public class AdminController {

	IAdminService iAdminService;
	IUserService iUserService;
	IMovieService iMovieService;

	@Autowired
	public void setiMovieService(IMovieService iMovieService) {
		this.iMovieService = iMovieService;
	}

	@Autowired
	public void setiAdminService(IAdminService iAdminService) {
		this.iAdminService = iAdminService;
	}

	@Autowired
	public void setiUserService(IUserService iUserService) {
		this.iUserService = iUserService;
	}

	// get list of companies
	@RequestMapping(value = "/companies", method = RequestMethod.GET)
	public String getAllCompanies(Model model) {
		System.out.println("Inside AdminController getAllCompanies()");
		// call getAllcompany method in userservice
		List<Company> companies = iAdminService.getAllCompanies();
		System.out.println("Companies :" + companies);
		model.addAttribute("companyList", companies);
		return "companies";
	}

	// get a Company details
	@RequestMapping(value = "/companies/{companyId}", method = RequestMethod.GET)
	public String getCompany(@PathVariable int companyId, Model model) {
		System.out.println("Inside AdminController getCompany()");
		Company company = iAdminService.getCompany(companyId);
		model.addAttribute("company", company);
		return "company-details";
	}

	// add new company
	@RequestMapping("/companies/add")
	public String createCompany(Model model) {
		System.out.println("Inside AdminController createCompany()");
		Company company = new Company();
		model.addAttribute("company", company);
		return "create-company-form";
	}

	@RequestMapping("/companies/save")
	public String saveCompany(@ModelAttribute("company") Company company) {
		System.out.println("Inside saveCompany() method in AdminController ");
		iAdminService.createCompany(company);
		return "success";
	}

	// editing a company
	@RequestMapping("/companies/{companyId}/edit")
	public String editCompany(@PathVariable int companyId, Model model) {
		System.out.println("Inside AdminController editCompany()");
		Company company;
		company = iAdminService.getCompany(companyId);
		System.out.println(company);
		model.addAttribute("company", company);
		return "edit-company-form";
	}

	@RequestMapping("/companies/{companyId}/update")
	public String updateCompany(@ModelAttribute("company") Company company) {
		System.out.println("Inside updateCompany() method in AdminController ");
		iAdminService.editCompany(company);
		return "success";
	}

	// deleting a company
	@RequestMapping(value = "/companies/delete/{companyId}")
	public void deleteCompany(@PathVariable int companyId) {
		System.out.println("Inside AdminController deleteCompany()");
		iAdminService.deleteCompany(companyId);
		// return "success";

	}

	// get list of users
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public String getAllUsers(Model model) {
		System.out.println("Inside AdminController getAllUsers()");
		List<User> users = iAdminService.getAllUsers();
		model.addAttribute("userList", users);
		return "users";

	}

	// get a User details
	@RequestMapping(value = "/users/{userId}")
	public String getUser(@PathVariable int userId, Model model) {
		System.out.println("Inside AdminController getUser()");
		User user = iUserService.getProfile(userId);
		model.addAttribute("user", user);
		return "user-profile";

	}

	// add new User
	@RequestMapping("/users/add")
	public String createUser(Model model) {
		System.out.println("Inside AdminController createUser()");
		User user = new User();
		model.addAttribute("user", user);
		return "create-userbyadmin";

	}

	@RequestMapping("/users/save")
	public String saveMovie(@ModelAttribute("user") User user) {
		System.out.println("Inside saveMovie() method in AdminController ");
		iAdminService.createUser(user);
		return "success";
	}

	// editing a User
	@RequestMapping("/users/{userId}/edit")
	public String editUser(@PathVariable int userId, Model model) {
		System.out.println("Inside AdminController editUser()");
		User user = iUserService.getProfile(userId);
		System.out.println(user);
		model.addAttribute("user", user);
		return "edit-userbyadmin-form";

	}

	@RequestMapping("/users/{userId}/update")
	public String updateUser(@ModelAttribute("user") User user) {
		System.out.println("Inside updateMovie() method in AdminController ");
		iAdminService.editUser(user);
		return "success";
	}

	// deleting a User
	@RequestMapping(value = "/users/{userId}/delete")
	public String deleteUser(@PathVariable int userId) {
		System.out.println("Inside AdminController deleteUser()");
		iAdminService.deleteUser(userId);
		return "success";

	}

	// get a Movie details
	@RequestMapping(value = "/movies/{movieId}", method = RequestMethod.GET)
	public String getMovie(@PathVariable int movieId, Model model) {
		System.out.println("Inside AdminController getMovie()");
		Movie movie = iAdminService.getMovie(movieId);
		model.addAttribute("movie", movie);
		return "movie-details";
	}

	// add new Movie
	@RequestMapping("/movies/add")
	public String createMovie(Model model) {
		System.out.println("Inside AdminController createMovie()");
		Movie movie = new Movie();
		model.addAttribute("movie", movie);
		return "create-movie-form";
	}

	@RequestMapping("/movies/save")
	public String saveMovie(@ModelAttribute("movie") Movie movie) {
		System.out.println("Inside saveMovie() method in AdminController ");
		iAdminService.createMovie(movie);
		return "success";
	}

	// editing a Movie
	@RequestMapping("/movies/{movieId}/edit")
	public String editMovie(@PathVariable int movieId, Model model) {
		System.out.println("Inside AdminController editMovie()");
		Movie movie;
		movie = iAdminService.getMovie(movieId);
		System.out.println(movie);
		model.addAttribute("movie", movie);
		return "edit-movie-form";
	}

	@RequestMapping("/movies/{movieId}/update")
	public String updateMovie(@ModelAttribute("movie") Movie movie) {
		System.out.println("Inside updateMovie() method in AdminController ");
		iAdminService.editMovie(movie);
		return "success";
	}

	// deleting a Movie
	@RequestMapping(value = "/movies/delete/{movieId}")
	public String deleteMovie(@PathVariable int movieId) {
		System.out.println("Inside AdminController deleteMovie()");
		iAdminService.deleteMovie(movieId);
		return "success";
	}

	// get list of Persons
	@RequestMapping(value = "/persons", method = RequestMethod.GET)
	public String getAllPersons(Model model) {
		System.out.println("Inside AdminController getAllPersons()");
		List<Person> persons = iAdminService.getAllPersons();
		System.out.println("Persons :" + persons);
		model.addAttribute("personList", persons);
		return "persons";

	}

	// get a Person details
	@RequestMapping(value = "/persons/{personId}", method = RequestMethod.GET)
	public String getPerson(@PathVariable int personId, Model model) {
		System.out.println("Inside AdminController getPerson()");
		Person person = iAdminService.getPerson(personId);
		System.out.println("Person details" + person);
		model.addAttribute("person", person);
		return "person-details";
	}

	// add new Person
	@RequestMapping("/persons/add")
	public String createPerson(Model model) {
		System.out.println("Inside AdminController createPerson()");
		Person person = new Person();
		model.addAttribute("person", person);
		return "create-person-form";
	}

	@RequestMapping("/persons/save")
	public String savePerson(@ModelAttribute("person") Person person) {
		System.out.println("Inside savePerson() method in AdminController ");
		iAdminService.createPerson(person);
		return "success";
	}

	// editing a Person
	@RequestMapping("/persons/{personId}/edit")
	public String editPerson(@PathVariable int personId, Model model) {
		System.out.println("Inside AdminController editPerson()");
		Person person = iAdminService.getPerson(personId);
		System.out.println(person);
		model.addAttribute("person", person);
		return "edit-person-form";
	}

	@RequestMapping("/persons/{personId}/update")
	public String updatePerson(@ModelAttribute("person") Person person) {
		System.out.println("Inside updateMovie() method in AdminController ");
		iAdminService.editPerson(person);
		return "success";
	}

	// deleting a Person
	@RequestMapping(value = "/persons/delete/{personId}")
	public String deletePerson(@PathVariable int personId) {
		System.out.println("Inside AdminController deletePerson()");
		iAdminService.deletePerson(personId);
		return "success";

	}

	// get list of Genre
	@RequestMapping(value = "/genre", method = RequestMethod.GET)
	public String getAllGenre(Model model) {
		System.out.println("Inside AdminController getAllGenre()");
		List<Genre> genre = iAdminService.getAllGenre();
		System.out.println("Genre :" + genre);
		model.addAttribute("genreList", genre);

		return "genre";
	}

	// add new Genre
	@RequestMapping("/genre/add")
	public String createGenre(Model model) {
		System.out.println("Inside AdminController createGenre()");
		Genre genre = new Genre();
		model.addAttribute("genre", genre);
		return "create-genre-form";
	}

	@RequestMapping("/genre/save")
	public String saveGenre(@ModelAttribute("genre") Genre genre) {
		System.out.println("Inside saveGenre() method in AdminController ");
		iAdminService.createGenre(genre);
		return "success";
	}

	// editing a genre
	@RequestMapping("/genre/{genreId}/edit")
	public String editGenre(@PathVariable int genreId, Model model) {
		System.out.println("Inside AdminController editGenre()");
		Genre genre = iAdminService.getGenre(genreId);
		System.out.println(genre);
		model.addAttribute("genre", genre);
		return "edit-genre-form";
	}

	@RequestMapping("/genre/{genreId}/update")
	public String updateGenre(@ModelAttribute("genre") Genre genre) {
		System.out.println("Inside updateGenre() method in AdminController ");
		iAdminService.editGenre(genre);
		return "success";
	}

	// deleting a Genre
	@RequestMapping(value = "/genre/delete/{genreId}")
	public String deleteGenre(@PathVariable int genreId) {
		System.out.println("Inside AdminController deleteGenre()");
		iAdminService.deleteGenre(genreId);
		return "success";
	}
}
