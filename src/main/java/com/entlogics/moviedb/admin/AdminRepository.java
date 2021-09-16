package com.entlogics.moviedb.admin;

import java.util.List;

import com.entlogics.moviedb.movie.Movie;

public class AdminRepository implements IAdminRepository {

	// find all companies
	public List<Company> findAllCompanies() {
		System.out.println("Inside AdminRepository findAllCompanies()");
		return null;
	}

	// find a Company details
	public Company findCompany(int companyId) {
		System.out.println("Inside AdminRepository findCompany()");
		return null;
	}

	// add new company
	public void addCompany(Company company) {
		System.out.println("Inside AdminRepository addCompany()");
	}

	// updating a company
	public void updateCompany(Company company) {
		System.out.println("Inside AdminRepository updateCompany()");
	}

	// deleting a company
	public void deleteCompany(Company company) {
		System.out.println("Inside AdminRepository deleteCompany()");
	}

	/*
	 * // find list of users public List<User> findAllUsers() {
	 * System.out.println("Inside AdminRepository findAllUsers()"); return
	 * "allUsers"; }
	 * 
	 * // find a User details public User findUser() {
	 * System.out.println("Inside AdminRepository findUser()"); return null; }
	 * 
	 * // add new User public void addUser() {
	 * System.out.println("Inside AdminRepository addUser()"); }
	 * 
	 * // updating a User public void updateUser() {
	 * System.out.println("Inside AdminRepository updateUser()"); }
	 * 
	 * // deleting a User public void deleteUser() {
	 * System.out.println("Inside AdminRepository deleteUser()"); }
	 */
	// find list of Movies
	public List<Movie> findAllMovies() {
		System.out.println("Inside AdminRepository findAllMovies()");
		return null;
	}

	// find a Movie details
	public Movie findMovie(int movieId) {
		System.out.println("Inside AdminRepository findMovie()");
		return null;
	}

	// add new Movie
	public void addMovie(Movie movie) {
		System.out.println("Inside AdminRepository addMovie()");
	}

	// updating a Movie
	public void updateMovie(Movie movie) {
		System.out.println("Inside AdminRepository updateMovie()");
	}

	// deleting a Movie
	public void deleteMovie(Movie movie) {
		System.out.println("Inside AdminRepository deleteMovie()");
	}

	// find list of Persons
	public List<Person> findAllPersons() {
		System.out.println("Inside AdminRepository findAllPersons()");
		return null;
	}

	// find a Person details
	public Person findPerson(int personId) {
		System.out.println("Inside AdminRepository findPerson()");
		return null;
	}

	// add new Person
	public void addPerson(Person person) {
		System.out.println("Inside AdminRepository addPerson()");
	}

	// updating a Person
	public void updatePerson(Person person) {
		System.out.println("Inside AdminRepository updatePerson()");
	}

	// deleting a Person
	public void deletePerson(Person person) {
		System.out.println("Inside AdminRepository deletePerson()");
	}

	// find list of Genre
	public List<Genre> findAllGenre() {
		System.out.println("Inside AdminRepository findAllGenre()");
		return null;
	}

	// add new Genre
	public void addGenre(Genre genre) {
		System.out.println("Inside AdminRepository addGenre()");
	}

	// updating a genre
	public void updateGenre(Genre genre) {
		System.out.println("Inside AdminRepository updateGenre()");
	}

	// deleting a Genre
	public void deleteGenre(Genre genre) {
		System.out.println("Inside AdminRepository deleteGenre()");
	}
}
