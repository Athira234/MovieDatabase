package com.entlogics.moviedb.movie.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.entlogics.moviedb.admin.entities.Company;
import com.entlogics.moviedb.admin.entities.Genre;
import com.entlogics.moviedb.admin.entities.Person;
import com.entlogics.moviedb.movie.entities.Movie;
import com.entlogics.moviedb.movie.entities.MovieCast;
import com.entlogics.moviedb.movie.entities.MovieCompany;
import com.entlogics.moviedb.movie.entities.MovieCrew;
import com.entlogics.moviedb.movie.entities.MovieGenre;
import com.entlogics.moviedb.user.entities.UserMovie;

@Repository
public class MovieRepository implements IMovieRepository {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("MDB");

	// find list of Movies
	public List<Movie> findAllMovies() {
		System.out.println("Inside MovieRepository findAllMovies()");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		List<Movie> movies = entityManager.createNativeQuery("select * from dt_movie", Movie.class).getResultList();
		System.out.println("printing list of movies " + movies.size() + "\n" + movies);
		entityManager.getTransaction().commit();
		entityManager.close();
		return movies;
	}

	@Override
	public List<Movie> findTopRatingMovies() {
		System.out.println("Inside MovieRepository findTopRatingMovies()");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		// get list of Movies
		List<Movie> topRatedMovies = entityManager
				.createNativeQuery("select * from dt_movie where overall_rating between 7 and 10", Movie.class)
				.getResultList();
		System.out.println("Top rated Movies" + topRatedMovies);
		return topRatedMovies;
	}

	@Override
	public List<Movie> findHighestGrossMovies() {
		System.out.println("Inside MovieRepository findHighestGrossMovies()");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		// get list of Movies
		List<Movie> movies = entityManager
				.createNativeQuery("select * from dt_movie where total_gross_income_dollar>=" + 700000000, Movie.class)
				.getResultList();
		System.out.println("Highest Gross Movies" + movies);
		return movies;

	}

	@Override
	public List<Movie> findTopRecommendedMovies() {
		System.out.println("Inside MovieRepository findTopRecommendedMovies()");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		// get list of Movies
		List<Movie> movies = entityManager
				.createNativeQuery("select * from dt_movie where no_of_recommendations>=" + 24800012, Movie.class)
				.getResultList();
		System.out.println("Top Recommended Movies" + movies);
		return movies;
	}

	@Override
	public List<UserMovie> findRatingsOfMovie(int movieId) {
		System.out.println("Inside MovieRepository findRatingsOfMovie()");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		// get list of User Movies
		List<UserMovie> userMovies = entityManager
				.createNativeQuery("select * from tt_user_movie where movie_id=" + movieId, UserMovie.class)
				.getResultList();
		System.out.println("Ratings of Movies" + userMovies);
		return userMovies;
	}

	@Override
	public List<MovieCast> findCastOfMovie(int movieId) {
		System.out.println("Inside MovieRepository findCastOfMovie()");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		// get list of Movie Cast
		List<MovieCast> cast = entityManager
				.createNativeQuery("select * from tt_movie_cost where movie_id=" + movieId, MovieCast.class)
				.getResultList();
		System.out.println("cast of Movies" + cast);
		return cast;
	}

	@Override
	public List<MovieCrew> findCrewOfMovie(int movieId) {
		System.out.println("Inside MovieRepository findCrewOfMovie()");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		// get list of Movie Cast
		List<MovieCrew> crew = entityManager
				.createNativeQuery("select * from tt_movie_crew where movie_id=" + movieId, MovieCrew.class)
				.getResultList();
		System.out.println("crew of Movies" + crew);
		return crew;
	}

	@Override
	public void addCast(MovieCast movieCast) {
		System.out.println("Inside MovieRepository addCast() Method");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		// save movieCast
		entityManager.persist(movieCast);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	@Override
	public void addCrew(MovieCrew movieCrew) {

		System.out.println("Inside MovieRepository addCrew() Method");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		// save movieCrew
		entityManager.persist(movieCrew);
		entityManager.getTransaction().commit();
		entityManager.close();

	}

	@Override
	public void deleteCast(int personId) {
		System.out.println("Inside MovieRepository deleteCast() Method");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		// remove cast
		entityManager.createNativeQuery("delete from tt_movie_cost where person_id=" + personId, MovieCast.class)
				.executeUpdate();
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	@Override
	public void deleteCrew(int personId) {
		System.out.println("Inside MovieRepository deleteCrew() Method");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		// remove crew
		entityManager.createNativeQuery("delete from tt_movie_crew where person_id=" + personId, MovieCast.class)
				.executeUpdate();
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	@Override
	public List<MovieCompany> movieByCompany(int companyId) {

		System.out.println("Inside MovieRepository movieByCompany()");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		Company company = entityManager.find(Company.class, companyId);
		//create list of Movies
		//List<Movie> movies=new ArrayList<Movie>();
		// get list of MovieCompany List
		List<MovieCompany> movies= company.getMoviesOfThisCompany();
		
		/*for(MovieCompany movieCompany:movieCompanies)
		{
			Movie movie=movieCompany.getMovie();
			
		}
		*/
		
		System.out.println("Movies" + movies);
		return movies;
	}

	@Override
	public List<MovieCast> movieByActor(int personId) {
		System.out.println("Inside MovieRepository movieByActor()");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		Person person = entityManager.find(Person.class, personId);
		// get list of Movies of actor
		List<MovieCast> movies = person.getPersonMoviesAsCast();
		System.out.println("Movies" + movies);
		return movies;

	}

	@Override
	public List<MovieGenre> movieByGenre(int genreId) {
		System.out.println("Inside MovieRepository movieByGenre()");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		Genre genre = entityManager.find(Genre.class, genreId);
		// get list of Movies for particular Gnere
		List<MovieGenre> movies = genre.getMoviesWithThicmsGenre();
		System.out.println("Movies" + movies);
		return movies;
	}

	@Override
	public List<Movie> movieByTitle(String title) {
		System.out.println("Inside MovieRepository movieByTitle()");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		// get list of Movies
		List<Movie> movies = entityManager
				.createNativeQuery("select * from dt_movie where movie_title=" + title, Movie.class).getResultList();
		System.out.println(" Movies" + movies);
		return movies;
	}

	public static void main(String[] args) {

		MovieRepository repo = new MovieRepository();
		// repo.findTopRatingMovies();
		// repo.findHighestGrossMovies();
		// repo.findTopRecommendedMovies();
		// repo.findRatingsOfMovie(1);
		repo.findCrewOfMovie(2);
		// repo.findCastOfMovie(2);
		// repo.deleteCast(3);
		// repo.movieByCompany(4);
		// repo.movieByTitle("'Dangal'");
		//repo.movieByActor(1);
		//repo.findAllMovies();

	}

}
