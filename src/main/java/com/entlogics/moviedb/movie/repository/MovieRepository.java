package com.entlogics.moviedb.movie.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.entlogics.moviedb.admin.repository.AdminRepository;
import com.entlogics.moviedb.movie.entities.Movie;
import com.entlogics.moviedb.movie.entities.MovieCast;
import com.entlogics.moviedb.movie.entities.MovieCrew;
import com.entlogics.moviedb.movie.entities.MovieDTO;
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
		List<Movie> movies = entityManager.createNativeQuery("select * from dt_movie where overall_rating between 7 and 10", Movie.class).getResultList();
		System.out.println("Top rated Movies" + movies);
		return movies;
	}

	@Override
	public List<Movie> findHighestGrossMovies() {
		System.out.println("Inside MovieRepository findHighestGrossMovies()");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		// get list of Movies
		List<Movie> movies = entityManager.createNativeQuery("select * from dt_movie where total_gross_income_dollar>="+ 700000000, Movie.class).getResultList();
		System.out.println("Highest Gross Movies" + movies);
		return null;                                     
		
	}

	@Override
	public List<Movie> findTopRecommendedMovies() {
		System.out.println("Inside MovieRepository findTopRecommendedMovies()");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		// get list of Movies
		List<Movie> movies = entityManager.createNativeQuery("select * from dt_movie where no_of_recommendations>="+24800012, Movie.class).getResultList();
		System.out.println("Top Recommended Movies" + movies);
		return null;
	}

	@Override
	public List<UserMovie> findRatingsOfMovie(int movieId) {
		System.out.println("Inside MovieRepository findTopRecommendedMovies()");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		// get list of User Movies
		List<UserMovie> userMovies = entityManager.createNativeQuery("select * from tt_user_movie where movie_id="+movieId, UserMovie.class).getResultList();
		System.out.println("Ratings of Movies" + userMovies);
		return null;
	}

	@Override
	public List<MovieCast> findCastOfMovie(int MovieId) {

		return null;
	}

	@Override
	public List<MovieCrew> findCrewOfMovie(int MovieId) {

		return null;
	}

	@Override
	public void addCast(MovieCast movieCast) {

	}

	@Override
	public void addCrew(MovieCrew movieCrew) {

	}

	@Override
	public void deleteCast(int personId) {

	}

	@Override
	public void deleteCrew(int personId) {

	}

	@Override
	public List<Movie> movieByCompany(int companyId) {

		return null;
	}

	@Override
	public List<Movie> movieByActor(int personId) {

		return null;
	}

	@Override
	public List<Movie> movieByGenre(int genreId) {

		return null;
	}

	@Override
	public List<Movie> movieByTitle(String title) {

		return null;
	}

	public static void main(String[] args) {

		MovieRepository repo = new MovieRepository();
		//repo.findTopRatingMovies();
		//repo.findHighestGrossMovies();
		//repo.findTopRecommendedMovies();
		repo.findRatingsOfMovie(1);

	}

}
