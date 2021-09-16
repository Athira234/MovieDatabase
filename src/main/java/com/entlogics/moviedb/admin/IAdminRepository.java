package com.entlogics.moviedb.admin;

import java.util.List;

import com.entlogics.moviedb.movie.Movie;

public interface IAdminRepository {

	public List<Company> findAllCompanies();

	public Company findCompany(int companyId);

	public void addCompany(Company company);

	public void updateCompany(Company company);

	public void deleteCompany(Company company);

	/*
	 * public List<User> findAllCompanies();
	 * 
	 * public User findUser(int userId);
	 * 
	 * public void addUser(User user);
	 * 
	 * public void updateUser(User user);
	 * 
	 * public void deleteUser(User user);
	 */

	public List<Movie> findAllMovies();

	public Movie findMovie(int movieId);

	public void addMovie(Movie movie);

	public void updateMovie(Movie movie);

	public void deleteMovie(Movie movie);

	public List<Person> findAllPersons();

	public Person findPerson(int personId);

	public void addPerson(Person person);

	public void updatePerson(Person person);

	public void deletePerson(Person person);

	public List<Genre> findAllGenre();

	public void addGenre(Genre genre);

	public void updateGenre(Genre genre);

	public void deleteGenre(Genre genre);

}
