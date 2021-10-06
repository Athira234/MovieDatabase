package com.entlogics.moviedb.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entlogics.moviedb.movie.entities.Movie;
import com.entlogics.moviedb.movie.entities.MovieCast;
import com.entlogics.moviedb.movie.entities.MovieCrew;
import com.entlogics.moviedb.movie.repository.IMovieRepository;
import com.entlogics.moviedb.user.entities.UserMovie;
@Service
public class MovieService implements IMovieService {
	  
	IMovieRepository movieRepo;
	@Autowired
	public void setMovieRepo(IMovieRepository movieRepo) {
		this.movieRepo = movieRepo;
	}


	// get list of Movies
	public List<Movie> getAllMovies() {
		System.out.println("Inside AdminService getAllMovies()");
		List<Movie> movies=movieRepo.findAllMovies();
		return movies;
	}
	

	@Override
	public List<Movie> getTopRatingMovies() {

		return null;
	}

	@Override
	public List<Movie> getHighestRatingMovies() {

		return null;
	}

	@Override
	public List<Movie> getTopRecommendedMovies() {

		return null;
	}

	@Override
	public List<UserMovie> getRatingsOfMovie(int MovieId) {

		return null;
	}

	@Override
	public List<MovieCast> getCastOfMovie(int MovieId) {

		return null;
	}

	@Override
	public List<MovieCrew> getCrewOfMovie(int MovieId) {

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
