package com.entlogics.moviedb.admin.service;

import java.util.List;


import com.entlogics.moviedb.admin.entities.Company;
import com.entlogics.moviedb.admin.entities.Genre;
import com.entlogics.moviedb.admin.entities.Person;
import com.entlogics.moviedb.movie.entities.Movie;
import com.entlogics.moviedb.user.entities.User;

public interface IAdminService {

	public List<Company> getAllCompanies();

	public Company getCompany(int companyId);

	public void createCompany(Company company);

	public void editCompany(Company company);

	public void deleteCompany(int companyId);
/*
	public List<User> getAllUsers();

	public User getUser(int userId);

	public void createUser(User user);

	public void editUser(User user);

	public void deleteUser(User user);
*/
	public List<Movie> getAllMovies();

	public Movie getMovie(int movieId);

	public void createMovie(Movie movie);

	public void editMovie(Movie movie);

	public void deleteMovie(int movieId);

	public List<Person> getAllPersons();

	public Person getPerson(int personId);

	public void createPerson(Person person);

	public void editPerson(Person person);

	public void deletePerson(int personId);

	public List<Genre> getAllGenre();

	public void createGenre(Genre genre);

	public void editGenre(Genre genre);

	public void deleteGenre(int genreId);

	public Genre getGenre(int genreId);

	public List<User> getAllUsers();

	public void deleteUser(int userId);

	public void createUser(User user);

	public void editUser(User user);

}
