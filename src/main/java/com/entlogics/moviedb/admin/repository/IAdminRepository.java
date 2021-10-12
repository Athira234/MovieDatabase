package com.entlogics.moviedb.admin.repository;

import java.util.List;

import com.entlogics.moviedb.admin.entities.Company;
import com.entlogics.moviedb.admin.entities.Genre;
import com.entlogics.moviedb.admin.entities.Person;
import com.entlogics.moviedb.movie.entities.Movie;
import com.entlogics.moviedb.user.entities.User;

public interface IAdminRepository {

	public List<Company> findAllCompanies();

	public Company findCompany(int companyId);

	public void addCompany(Company company);

	public void updateCompany(Company company);

	public void deleteCompany(int companyId);

	public void addMovie(Movie movie);

	public void updateMovie(Movie movie);

	public void deleteMovie(int movieId);

	public List<Person> findAllPersons();

	public Person findPerson(int personId);

	public void addPerson(Person person);

	public void updatePerson(Person person);

	public void deletePerson(int personId);

	public List<Genre> findAllGenre();

	public void addGenre(Genre genre);

	public void updateGenre(Genre genre);

	public void deleteGenre(int genreId);

	public Genre findGenre(int genreId);

	public List<User> findAllUsers();

	public void deleteUser(int userId);

	public void addUser(User user);

	public void updateUser(User user);

}
