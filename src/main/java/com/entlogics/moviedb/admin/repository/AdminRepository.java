package com.entlogics.moviedb.admin.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.entlogics.moviedb.admin.entities.Company;
import com.entlogics.moviedb.admin.entities.Genre;
import com.entlogics.moviedb.admin.entities.Person;
import com.entlogics.moviedb.movie.entities.Movie;

@Repository
public class AdminRepository implements IAdminRepository {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("MDB");

	// find all companies
	public List<Company> findAllCompanies() {
		System.out.println("Inside AdminRepository findAllCompanies()");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		List<Company> companies = entityManager.createNativeQuery("select * from dt_company", Company.class)
				.getResultList();
		System.out.println("printing list of companies " + companies.size() + "\n" + companies);
		entityManager.getTransaction().commit();
		entityManager.close();
		return companies;
	}

	// find a Company details
	public Company findCompany(int companyId) {
		System.out.println("Inside AdminRepository findCompany()");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		Company company = entityManager.find(Company.class, companyId);
		System.out.println("company details :" + company);
		entityManager.getTransaction().commit();
		entityManager.close();
		return company;
	}

	// add new company
	public void addCompany(Company company) {

		System.out.println("Inside AdminRepository addCompany()");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(company);
		System.out.println("Company details :" + company);
		entityManager.close();
	}

	// updating a company
	public void updateCompany(Company company) {

		System.out.println("Inside AdminRepository updateCompany()");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(company);
		System.out.println("Company details :" + company);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	// deleting a company
	public void deleteCompany(int companyId) {

		System.out.println("Inside AdminRepository deleteCompany()");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		Company company = entityManager.find(Company.class, companyId);
		entityManager.remove(company);
		System.out.println("deleted");
		entityManager.getTransaction().commit();
		entityManager.close();
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
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		List<Movie> movies = entityManager.createNativeQuery("select * from dt_movie", Movie.class).getResultList();
		System.out.println("printing list of movies " + movies.size() + "\n" + movies);
		entityManager.getTransaction().commit();
		entityManager.close();
		return movies;
	}

	// find a Movie details
	public Movie findMovie(int movieId) {
		System.out.println("Inside AdminRepository findMovie()");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		Movie movie = entityManager.find(Movie.class, movieId);
		System.out.println("Movie details :" + movie);
		entityManager.getTransaction().commit();
		entityManager.close();
		return movie;
	}

	// add new Movie
	public void addMovie(Movie movie) {
		System.out.println("Inside AdminRepository addMovie()");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		//movie object will passed when implementing controller
		entityManager.persist(movie);
		System.out.println("Movie details :" + movie);
		entityManager.getTransaction().commit();
		entityManager.close();

	}

	// updating a Movie
	public void updateMovie(Movie movie) {
		System.out.println("Inside AdminRepository updateMovie()");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(movie);
		System.out.println("Movie details :" + movie);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	// deleting a Movie
	public void deleteMovie(int movieId) {
		System.out.println("Inside AdminRepository deleteMovie()");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		Movie movie = entityManager.find(Movie.class, movieId);
		entityManager.remove(movie);
		System.out.println("deleted");
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	// find list of Persons
	public List<Person> findAllPersons() {
		System.out.println("Inside AdminRepository findAllPersons()");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		List<Person> persons = entityManager.createNativeQuery("select * from dt_person", Person.class).getResultList();
		System.out.println("printing list of persons " + persons.size() + "\n" + persons);
		entityManager.getTransaction().commit();
		entityManager.close();
		return persons;
	}

	// find a Person details
	public Person findPerson(int personId) {
		System.out.println("Inside AdminRepository findPerson()");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		Person person = entityManager.find(Person.class, personId);
		System.out.println("Person details :" + person);
		entityManager.getTransaction().commit();
		entityManager.close();
		return person;
	}

	// add new Person
	public void addPerson(Person person) {
		System.out.println("Inside AdminRepository addPerson()");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(person);
		System.out.println("Person details :" + person);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	// updating a Person
	public void updatePerson(Person person) {
		System.out.println("Inside AdminRepository updatePerson()");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(person);
		System.out.println("person details :" + person);
		entityManager.getTransaction().commit();
	}

	// deleting a Person
	public void deletePerson(int personId) {
		System.out.println("Inside AdminRepository deletePerson()");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		Person person = entityManager.find(Person.class, personId);
		entityManager.remove(person);
		System.out.println("deleted");
		entityManager.getTransaction().commit();

	}

	// find list of Genre
	public List<Genre> findAllGenre() {
		System.out.println("Inside AdminRepository findAllGenre()");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		List<Genre> genre = entityManager.createNativeQuery("select * from dt_genre", Genre.class).getResultList();
		System.out.println("printing list of genre " + genre.size() + "\n" + genre);
		entityManager.getTransaction().commit();
		entityManager.close();
		return genre;
	}

	// add new Genre
	public void addGenre(Genre genre) {
		System.out.println("Inside AdminRepository addGenre()");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(genre);
		System.out.println("Genre details :" + genre);
		entityManager.getTransaction().commit();
		entityManager.close();

	}

	// updating a genre
	public void updateGenre(Genre genre) {
		System.out.println("Inside AdminRepository updateGenre()");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(genre);
		System.out.println("Genre details :" + genre);
		entityManager.getTransaction().commit();

		entityManager.close();
	}

	// deleting a Genre
	public void deleteGenre(int genreId) {
		System.out.println("Inside AdminRepository deleteGenre()");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		Genre genre = entityManager.find(Genre.class, genreId);
		entityManager.remove(genre);
		System.out.println("deleted");
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public static void main(String[] args) {

		AdminRepository repo = new AdminRepository();
		// repo.findAllMovies();
		// repo.findMovie(8);
		// repo.findAllPersons();
		// repo.deleteMovie(8);
		// repo.findPerson(1);
		// repo.findAllGenre();
		// repo.deleteGenre(9);
		// repo.findAllCompanies();
		repo.findCompany(1);

	}
}
