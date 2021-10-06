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
		//get List of Movies
		List<Movie> movies = entityManager.createNativeQuery("select * from dt_movie", Movie.class).getResultList();
		System.out.println("printing list of movies " + movies.size() + "\n" + movies);
		entityManager.getTransaction().commit();
		entityManager.close();
		return movies;
	}

	@Override
	public List<MovieDTO> findTopRatingMovies() {
		System.out.println("Inside MovieRepository findTopRatingMovies()");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		// get list of Movies
		List<Movie> movies = entityManager.createNativeQuery("select * from dt_movie", Movie.class).getResultList();
		// Create MovieDTO list
		List<MovieDTO> movies1 = new ArrayList<>();
		// Add top rated movies in MovieDTO
		for (Movie movie : movies) {
			//find movies which have rating between 7 to 10
			for (int top = 7; top <= 10; top++) {
				if (movie.getOverallRating() == top) {
					System.out.println("rating" + movie.getOverallRating());
					movies1.add(new MovieDTO(movie.getMovieId(), movie.getMovieTitle(), null, top, top, null, null,
							null, top, null, movie.getOverallRating(), top, null, null, null, null, null, null, null,
							null));
				}
			}
		}
		System.out.println("Top rated Movies" + movies1);
		return null;
	}

	@Override
	public List<Movie> findHighestGrossMovies() {

		return null;
	}

	@Override
	public List<Movie> findTopRecommendedMovies() {

		return null;
	}

	@Override
	public List<UserMovie> findRatingsOfMovie(int MovieId) {

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
		repo.findTopRatingMovies();

	}

}
