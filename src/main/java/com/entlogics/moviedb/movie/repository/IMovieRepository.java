package com.entlogics.moviedb.movie.repository;

import java.util.List;

import com.entlogics.moviedb.movie.entities.Movie;
import com.entlogics.moviedb.movie.entities.MovieCast;
import com.entlogics.moviedb.movie.entities.MovieCompany;
import com.entlogics.moviedb.movie.entities.MovieCrew;
import com.entlogics.moviedb.movie.entities.MovieDTO;
import com.entlogics.moviedb.movie.entities.MovieGenre;
import com.entlogics.moviedb.user.entities.UserMovie;

public interface IMovieRepository {
	
	public List<Movie> findAllMovies();
	
	public List<Movie> findTopRatingMovies();

	// method to find highest gross Movies
	public List<Movie> findHighestGrossMovies();

	// method to find Top Recommended Movies
	public List<Movie> findTopRecommendedMovies();

	// method to find ratings of a Movie
	public List<UserMovie> findRatingsOfMovie(int MovieId);

	// method to find cast of a Movie
	public List<MovieCast> findCastOfMovie(int MovieId);

	// method to find crew of a Movie
	public List<MovieCrew> findCrewOfMovie(int MovieId);

	// method to add cast to movie
	public void addCast(MovieCast movieCast);

	// method to add crew to movie
	public void addCrew(MovieCrew movieCrew);

	// method to delete person from cast
	public void deleteCast(int personId);

	// method to delete person from crew
	public void deleteCrew(int personId);

	// method to get Movie by Company
	public List<MovieCompany> movieByCompany(int companyId);

	// method to get Movie by actor
	public List<MovieCast> movieByActor(int personId);

	// method to get Movie by genre
	public List<MovieGenre> movieByGenre(int genreId);

	// method to get Movie by Title
	public List<Movie> movieByTitle(String title);
}
