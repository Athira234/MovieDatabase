package com.entlogics.moviedb.movie.repository;

import java.util.List;

import com.entlogics.moviedb.movie.entities.Movie;
import com.entlogics.moviedb.movie.entities.MovieCast;
import com.entlogics.moviedb.movie.entities.MovieCrew;
import com.entlogics.moviedb.user.entities.UserMovie;

public class MovieRepository implements IMovieRepository {

	@Override
	public List<Movie> findTopRatingMovies() {
		return null;
	}

	@Override
	public List<Movie> findHighestRatingMovies() {

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

}
