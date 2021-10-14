package com.entlogics.moviedb.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entlogics.moviedb.admin.entities.Company;
import com.entlogics.moviedb.admin.entities.Genre;
import com.entlogics.moviedb.admin.entities.Person;
import com.entlogics.moviedb.admin.repository.IAdminRepository;
import com.entlogics.moviedb.admin.service.IAdminService;
import com.entlogics.moviedb.movie.entities.Movie;
import com.entlogics.moviedb.user.entities.User;

@Service
public class AdminService implements IAdminService {

	IAdminRepository adminRepo;

	@Autowired
	public void setAdminRepo(IAdminRepository adminRepo) {
		this.adminRepo = adminRepo;
	}

	// get all companies
	public List<Company> getAllCompanies() {
		System.out.println("Inside AdminService getAllCompanies()");
		List<Company> companies = adminRepo.findAllCompanies();
		return companies;
	}

	// get a Company details
	public Company getCompany(int companyId) {
		System.out.println("Inside AdminService getCompany()");
		Company company = adminRepo.findCompany(companyId);
		return company;
	}

	// add new company
	public void createCompany(Company company) {
		System.out.println("Inside AdminService createCompany()");
		adminRepo.addCompany(company);
	}

	// editing a company
	public void editCompany(Company company) {
		System.out.println("Inside AdminService editCompany()");
		adminRepo.updateCompany(company);
	}

	// deleting a company
	public void deleteCompany(int companyId) {
		System.out.println("Inside AdminService deleteCompany()");
		adminRepo.deleteCompany(companyId);
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

	// add new Movie
	public void createMovie(Movie movie) {
		System.out.println("Inside AdminService createMovie()");
		adminRepo.addMovie(movie);
	}

	// editing a Movie
	public void editMovie(Movie movie) {
		System.out.println("Inside AdminService editMovie()");
		adminRepo.updateMovie(movie);
	}

	// deleting a Movie
	public void deleteMovie(int movieId) {
		System.out.println("Inside AdminService deleteMovie()");
		adminRepo.deleteMovie(movieId);
	}

	// get list of Persons
	public List<Person> getAllPersons() {
		System.out.println("Inside AdminService getAllPersons()");
		List<Person> persons = adminRepo.findAllPersons();
		return persons;
	}

	// get a Person details
	public Person getPerson(int personId) {
		System.out.println("Inside AdminService getPerson()");
		Person person = adminRepo.findPerson(personId);
		return person;
	}

	// add new Person
	public void createPerson(Person person) {
		System.out.println("Inside AdminService createPerson()");
		adminRepo.addPerson(person);
	}

	// editing a Person
	public void editPerson(Person person) {
		System.out.println("Inside AdminService editPerson()");
		adminRepo.updatePerson(person);
	}

	// deleting a Person
	public void deletePerson(int personId) {
		System.out.println("Inside AdminService deletePerson()");
		adminRepo.deletePerson(personId);

	}

	// get list of Genre
	public List<Genre> getAllGenre() {
		System.out.println("Inside AdminService getAllGenre()");
		List<Genre> genre = adminRepo.findAllGenre();
		return genre;
	}

	// add new Genre
	public void createGenre(Genre genre) {
		System.out.println("Inside AdminService createGenre()");
		adminRepo.addGenre(genre);
	}

	// editing a genre
	public void editGenre(Genre genre) {
		System.out.println("Inside AdminService editGenre()");
		adminRepo.updateGenre(genre);
	}

	// deleting a Genre
	public void deleteGenre(int genreId) {
		System.out.println("Inside AdminService deleteGenre()");
		adminRepo.deleteGenre(genreId);
	}

	@Override
	public Genre getGenre(int genreId) {
		System.out.println("Inside AdminService  getGenre()");
		Genre genre = adminRepo.findGenre(genreId);
		return genre;
	}

	@Override
	public List<User> getAllUsers() {
		System.out.println("Inside AdminService getAllUsers()");
		List<User> users = adminRepo.findAllUsers();
		return users;
	}

	@Override
	public void deleteUser(int userId) {
		System.out.println("Inside AdminService deleteUser()");
		adminRepo.deleteUser(userId);

	}

	@Override
	public void createUser(User user) {

		System.out.println("Inside AdminService createUser()");
		adminRepo.addUser(user);
	}

	@Override
	public void editUser(User user) {
		System.out.println("Inside AdminService editUser()");
		adminRepo.updateUser(user);

	}
}
