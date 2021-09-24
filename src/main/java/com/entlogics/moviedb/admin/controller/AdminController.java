package com.entlogics.moviedb.admin.controller;

import org.springframework.stereotype.Controller;

@Controller
public class AdminController {

	// get list of companies
	public String getAllCompanies() {
		System.out.println("Inside AdminController getAllCompanies()");
		return "allCompanies";
	}

	// get a Company details
	public String getCompany() {
		System.out.println("Inside AdminController getCompany()");
		return "companyDetails";
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
	public void deleteCompany() {
		System.out.println("Inside AdminController deleteCompany()");
	}

	// get list of users
	public String getAllUsers() {
		System.out.println("Inside AdminController getAllUsers()");
		return "allUsers";
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
	}

	// get list of Movies
	public String getAllMovies() {
		System.out.println("Inside AdminController getAllMovies()");
		return "allMovies";
	}

	// get a Movie details
	public String getMovie() {
		System.out.println("Inside AdminController getMovie()");
		return "movieDetails";
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
	public void deleteMovie() {
		System.out.println("Inside AdminController deleteMovie()");
	}

	// get list of Persons
	public String getAllPersons() {
		System.out.println("Inside AdminController getAllPersons()");
		return "allPersons";
	}

	// get a Person details
	public String getPerson() {
		System.out.println("Inside AdminController getPerson()");
		return "personDetails";
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
	public void deletePerson() {
		System.out.println("Inside AdminController deletePerson()");
	}

	// get list of Genre
	public String getAllGenre() {
		System.out.println("Inside AdminController getAllGenre()");
		return "allGenre";
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
	public void deleteGenre() {
		System.out.println("Inside AdminController deleteGenre()");
	}
}
