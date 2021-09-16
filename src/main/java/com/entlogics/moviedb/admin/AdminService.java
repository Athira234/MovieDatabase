package com.entlogics.moviedb.admin;

import java.util.List;

import org.springframework.stereotype.Service;

import com.entlogics.moviedb.movie.Movie;

@Service
public class AdminService implements IAdminService {

	// get all companies
	public List<Company> getAllCompanies() {
		System.out.println("Inside AdminService getAllCompanies()");
		return null;
	}

	// get a Company details
	public Company getCompany(int companyId) {
		System.out.println("Inside AdminService getCompany()");
		return null;
	}

	// add new company
	public void createCompany(Company company) {
		System.out.println("Inside AdminService createCompany()");
	}

	// editing a company
	public void editCompany(Company company) {
		System.out.println("Inside AdminService editCompany()");
	}

	// deleting a company
	public void deleteCompany(Company company) {
		System.out.println("Inside AdminService deleteCompany()");
	}
	/*
	 * // get list of users public List<User> getAllUsers() {
	 * System.out.println("Inside AdminService getAllUsers()"); return null; }
	 * 
	 * // get a User details public User getUser() {
	 * System.out.println("Inside AdminService getUser()"); return null; }
	 * 
	 * // add new User public void createUser() {
	 * System.out.println("Inside AdminService createUser()"); }
	 * 
	 * // editing a User public void editUser() {
	 * System.out.println("Inside AdminService editUser()"); }
	 * 
	 * // deleting a User public void deleteUser() {
	 * System.out.println("Inside AdminService deleteUser()"); }
	 */

	// get list of Movies
	public List<Movie> getAllMovies() {
		System.out.println("Inside AdminService getAllMovies()");
		return null;
	}

	// get a Movie details
	public Movie getMovie(int movieId) {
		System.out.println("Inside AdminService getMovie()");
		return null;
	}

	// add new Movie
	public void createMovie(Movie movie) {
		System.out.println("Inside AdminService createMovie()");
	}

	// editing a Movie
	public void editMovie(Movie movie) {
		System.out.println("Inside AdminService editMovie()");
	}

	// deleting a Movie
	public void deleteMovie(Movie movie) {
		System.out.println("Inside AdminService deleteMovie()");
	}

	// get list of Persons
	public List<Person> getAllPersons() {
		System.out.println("Inside AdminService getAllPersons()");
		return null;
	}

	// get a Person details
	public Person getPerson(int personId) {
		System.out.println("Inside AdminService getPerson()");
		return null;
	}

	// add new Person
	public void createPerson(Person person) {
		System.out.println("Inside AdminService createPerson()");
	}

	// editing a Person
	public void editPerson(Person person) {
		System.out.println("Inside AdminService editPerson()");
	}

	// deleting a Person
	public void deletePerson(Person person) {
		System.out.println("Inside AdminService deletePerson()");
	}

	// get list of Genre
	public List<Genre> getAllGenre() {
		System.out.println("Inside AdminService getAllGenre()");
		return null;
	}

	// add new Genre
	public void createGenre(Genre genre) {
		System.out.println("Inside AdminService createGenre()");
	}

	// editing a genre
	public void editGenre(Genre genre) {
		System.out.println("Inside AdminService editGenre()");
	}

	// deleting a Genre
	public void deleteGenre(Genre genre) {
		System.out.println("Inside AdminService deleteGenre()");
	}
}
