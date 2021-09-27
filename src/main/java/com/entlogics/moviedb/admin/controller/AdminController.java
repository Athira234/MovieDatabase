package com.entlogics.moviedb.admin.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.entlogics.moviedb.admin.entities.Company;
import com.entlogics.moviedb.admin.entities.Genre;
import com.entlogics.moviedb.admin.entities.Person;
import com.entlogics.moviedb.admin.service.IAdminService;
import com.entlogics.moviedb.movie.entities.Movie;




@Controller
public class AdminController {

	
	IAdminService iAdminService;
	@Autowired
	public void setiAdminService(IAdminService iAdminService) {
		this.iAdminService = iAdminService;
	}
	
	// get list of companies
	@RequestMapping(value = "/companies",method = RequestMethod.GET)
	public String getAllCompanies(Model model) {
		System.out.println("Inside AdminController getAllCompanies()");
		//call getAllcompany method in userservice
		List<Company> companies=iAdminService.getAllCompanies();
		System.out.println("Companies :"+companies); 
		model.addAttribute("companyList", companies);
		return "companies";
	}

	// get a Company details
	@RequestMapping(value = "/companies/{companyId}",method = RequestMethod.GET)
	public String getCompany(@PathVariable int companyId, Model model) {
		System.out.println("Inside AdminController getCompany()");
		Company company = iAdminService.getCompany(companyId);
		model.addAttribute("company", company);
		return "company-details";
	}

	// add new company
	public void createCompany() {
		System.out.println("Inside AdminController createCompany()");
	}

	// editing a company
	public void editCompany() {
		System.out.println("Inside AdminController editCompany()");
	}

	// deleting a company
	@RequestMapping(value = "/companies/delete/{companyId}")
	public void deleteCompany(@PathVariable int companyId) {
		System.out.println("Inside AdminController deleteCompany()");
		iAdminService.deleteCompany(companyId);
		//return "success";
		
	}

	// get list of users
	/*
	public String getAllUsers() {
		System.out.println("Inside AdminController getAllUsers()");
		//call getAllusers method in userservice
				return "null";
	}

	// get a User details
	public String getUser() {
		System.out.println("Inside AdminController getUser()");
		return "userDetails";
	}

	// add new User
	public void createUser() {
		System.out.println("Inside AdminController createUser()");
	}

	// editing a User
	public void editUser() {
		System.out.println("Inside AdminController editUser()");
	}

	// deleting a User
	public void deleteUser() {
		System.out.println("Inside AdminController deleteUser()");
	}*/

	// get list of Movies
	@RequestMapping(value = "/movies",method = RequestMethod.GET)
	public String getAllMovies(Model model) {
		System.out.println("Inside AdminController getAllMovies()");
		List<Movie> movies=iAdminService.getAllMovies();
		System.out.println("Movies :"+movies); 
		model.addAttribute("movieList",movies);
        return "movies";
	}

	// get a Movie details
	@RequestMapping(value = "/movies/{movieId}",method = RequestMethod.GET)
	public String getMovie(@PathVariable int movieId, Model model) {
		System.out.println("Inside AdminController getMovie()");
		Movie movie = iAdminService.getMovie(movieId);
		model.addAttribute("movie",movie);
		return "movie-details";
		}

	// add new Movie
	public void createMovie() {
		System.out.println("Inside AdminController createMovie()");
	}

	// editing a Movie
	public void editMovie() {
		System.out.println("Inside AdminController editMovie()");
	}

	// deleting a Movie
	@RequestMapping(value = "/movies/delete/{movieId}")
	public String deleteMovie(@PathVariable int movieId) {
		System.out.println("Inside AdminController deleteMovie()");
		iAdminService.deleteMovie(movieId);
		return "success";
	}

	// get list of Persons
	@RequestMapping(value = "/persons",method = RequestMethod.GET)
	public String getAllPersons(Model model) {
		System.out.println("Inside AdminController getAllPersons()");
		List<Person> persons=iAdminService.getAllPersons();
		System.out.println("Persons :"+persons); 
		model.addAttribute("personList", persons);
        return "persons";
		
	}

	// get a Person details
	@RequestMapping(value = "/persons/{personId}",method = RequestMethod.GET)
	public String getPerson(@PathVariable int personId, Model model) {
		System.out.println("Inside AdminController getPerson()");
		Person person = iAdminService.getPerson(personId);
		System.out.println("Person details"+person);
		model.addAttribute("person",person);
		return "person-details";
	}

	// add new Person
	public void createPerson() {
		System.out.println("Inside AdminController createPerson()");
	}

	// editing a Person
	public void editPerson() {
		System.out.println("Inside AdminController editPerson()");
	}

	// deleting a Person
	@RequestMapping(value = "/persons/delete/{personId}")
	public String deletePerson(@PathVariable int personId) {
		System.out.println("Inside AdminController deletePerson()");
		iAdminService.deletePerson(personId);
		return "success";
		
	}

	// get list of Genre
	@RequestMapping(value = "/genre",method = RequestMethod.GET)
	public String getAllGenre(Model model) {
		System.out.println("Inside AdminController getAllGenre()");
		List<Genre> genre=iAdminService.getAllGenre();
		System.out.println("Genre :"+genre); 
		model.addAttribute("genreList", genre);
      
		return "genre";
	}

	// add new Genre
	public void createGenre() {
		System.out.println("Inside AdminController createGenre()");
	}

	// editing a genre
	public void editGenre() {
		System.out.println("Inside AdminController editGenre()");
	}

	// deleting a Genre
	@RequestMapping(value = "/genre/delete/{genreId}")
	public String deleteGenre(@PathVariable int genreId) {
		System.out.println("Inside AdminController deleteGenre()");
		iAdminService.deleteGenre(genreId);
		return "success";
	}
}
