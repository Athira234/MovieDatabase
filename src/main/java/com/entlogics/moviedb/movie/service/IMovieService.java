package com.entlogics.moviedb.movie.service;

import java.util.List;

import com.entlogics.moviedb.movie.entities.Movie;
import com.entlogics.moviedb.movie.entities.MovieCast;
import com.entlogics.moviedb.movie.entities.MovieCrew;
import com.entlogics.moviedb.movie.entities.MovieDto;
import com.entlogics.moviedb.user.entities.UserMovie;

public interface IMovieService {

	public List<MovieDto> getTopRatingMovies();

	public List<MovieDto> getAllMovies();

	public Movie getMovie(int movieId);

	// method to find highest gross Movies
	public List<MovieDto> getHighestGrossMovies();

	// method to find Top Recommended Movies
	public List<MovieDto> getTopRecommendedMovies();

	// method to find ratings of a Movie
	public List<UserMovie> getRatingsOfMovie(int MovieId);

	// method to find cast of a Movie
	public MovieDto getCastOfMovie(int MovieId);

	// method to find crew of a Movie
	public MovieDto getCrewOfMovie(int MovieId);

	// method to add cast to movie
	public void addCast(MovieCast movieCast);

	// method to add crew to movie
	public void addCrew(MovieCrew movieCrew);

	// method to delete person from cast
	public void deleteCast(int personId);

	// method to delete person from crew
	public void deleteCrew(int personId);

	// method to get Movie by Company
	public MovieDto movieByCompany(int companyId);

	// method to get Movie by actor
	public MovieDto movieByActor(int personId);

	// method to get Movie by genre
	public MovieDto movieByGenre(int genreId);

	// method to get Movie by Title
	public List<MovieDto> movieByTitle(String title);
}
