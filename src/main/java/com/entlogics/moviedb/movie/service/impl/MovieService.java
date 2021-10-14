package com.entlogics.moviedb.movie.service.impl;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entlogics.moviedb.movie.dto.MovieDto;
import com.entlogics.moviedb.movie.entities.Movie;
import com.entlogics.moviedb.movie.entities.MovieCast;
import com.entlogics.moviedb.movie.entities.MovieCrew;
import com.entlogics.moviedb.movie.repository.IMovieRepository;
import com.entlogics.moviedb.movie.service.IMovieService;
import com.entlogics.moviedb.user.entities.UserMovie;

@Service
public class MovieService implements IMovieService {

	
	IMovieRepository movieRepo;

	@Autowired
	public void setMovieRepo(IMovieRepository movieRepo) {
		this.movieRepo = movieRepo;
	}
	// get a Movie details
	public Movie getMovie(int movieId) {
		System.out.println("Inside MovieService getMovie()");
		Movie movie=movieRepo.findMovie(movieId);
		return movie;
	}

	// get list of Movies
	public List<MovieDto> getAllMovies() {

		System.out.println("Inside MovieService getAllMovies()");
		List<Movie> movies = movieRepo.findAllMovies();
		// Create list of movieDtos
		List<MovieDto> movieDtos = new ArrayList<MovieDto>();

		for (Movie movie : movies) {
			// convert values in movie to movieDTO
			MovieDto movieDto = new MovieDto(movie.getMovieId(), movie.getMovieTitle());
			movieDto.setNumberOfRecommendations(movie.getNumberOfRecommendations());
			movieDto.setReleaseDate(movie.getReleaseDate());
			movieDto.setOverallRating(movie.getOverallRating());
			// add each movieDTO to list
			movieDtos.add(movieDto);
		}

		System.out.println("MovieDto" + movieDtos);
		return movieDtos;

	}

	@Override
	public List<MovieDto> getTopRatingMovies() {
		System.out.println("Inside MovieService getTopRatingMovies()");
		List<Movie> movies = movieRepo.findTopRatingMovies();
		// Create list of movieDtos
		List<MovieDto> movieDtos = new ArrayList<MovieDto>();
		for (Movie movie : movies) {
			// convert values in movie to movieDTO
			MovieDto movieDto = new MovieDto(movie.getMovieId(), movie.getMovieTitle());
			movieDto.setOverallRating(movie.getOverallRating());
			// add each movieDTO to list
			movieDtos.add(movieDto);
		}
		System.out.println("MovieDto" + movieDtos);
		return movieDtos;
	}

	@Override
	public List<MovieDto> getHighestGrossMovies() {
		System.out.println("Inside MovieService getHighestGrossMovies()");
		List<Movie> movies = movieRepo.findHighestGrossMovies();
		// Create list of movieDtos
		List<MovieDto> movieDtos = new ArrayList<MovieDto>();
		for (Movie movie : movies) {
			// convert values in movie to movieDTO
			MovieDto movieDto = new MovieDto(movie.getMovieId(), movie.getMovieTitle());
			movieDto.setTotalGrossIncomeDollar(movie.getTotalGrossIncomeDollar());
			// add each movieDTO to list
			movieDtos.add(movieDto);
		}
		System.out.println("MovieDto" + movieDtos);
		return movieDtos;
	}

	@Override
	public List<MovieDto> getTopRecommendedMovies() {
		System.out.println("Inside MovieService getTopRecommendedMovies()");
		List<Movie> movies = movieRepo.findTopRecommendedMovies();
		// Create list of movieDtos
		List<MovieDto> movieDtos = new ArrayList<MovieDto>();
		for (Movie movie : movies) {
			// convert values in movie to movieDTO
			MovieDto movieDto = new MovieDto(movie.getMovieId(), movie.getMovieTitle());
			movieDto.setNumberOfRecommendations(movie.getNumberOfRecommendations());
			// add each movieDTO to list
			movieDtos.add(movieDto);
		}
		System.out.println("MovieDto" + movieDtos);
		return movieDtos;
	}

	@Override
	public List<UserMovie> getRatingsOfMovie(int MovieId) {
        List<UserMovie> userMovie=movieRepo.findRatingsOfMovie(MovieId);
		return userMovie;
	}

	@Override
	public MovieDto getCastOfMovie(int movieId) {
		System.out.println("Inside MovieService getCastOfMovie()");
		// get movie of movieId
		Movie movie = movieRepo.findMovie(movieId);
		// create movieDto Object
		MovieDto movieDto = new MovieDto(movie.getMovieId(), movie.getMovieTitle());
		movieDto.setMovieCast(movieRepo.findCastOfMovie(movieId));
		return movieDto;
	}

	@Override
	public MovieDto getCrewOfMovie(int movieId) {
		System.out.println("Inside MovieService getCrewOfMovie()");
		// get movie of movieId
		Movie movie = movieRepo.findMovie(movieId);
		// create movieDto Object
		MovieDto movieDto = new MovieDto(movie.getMovieId(), movie.getMovieTitle());
		movieDto.setMovieCrew(movieRepo.findCrewOfMovie(movieId));

		return movieDto;
	}

	@Override
	public void addCast(MovieCast movieCast) {
      movieRepo.addCast(movieCast);
	}

	@Override
	public void addCrew(MovieCrew movieCrew) {
      movieRepo.addCrew(movieCrew);
	}

	@Override
	public void deleteCast(int personId) {
       movieRepo.deleteCast(personId);
	}

	@Override
	public void deleteCrew(int personId) {
		movieRepo.deleteCrew(personId);
	}

	@Override
	public MovieDto movieByCompany(int companyId) {
		System.out.println("Inside MovieService movieByCompany()");
		// create movieDto Object
		MovieDto movieDto = new MovieDto();
		movieDto.setMovieCompanies(movieRepo.movieByCompany(companyId));

		return movieDto;

	}

	@Override
	public MovieDto movieByActor(int personId) {
		System.out.println("Inside MovieService  movieByActor()");
		// create movieDto Object
		MovieDto movieDto = new MovieDto();
		movieDto.setMovieCast(movieRepo.movieByActor(personId));
		return movieDto;
	}

	@Override
	public MovieDto movieByGenre(int genreId) {
		System.out.println("Inside MovieService  movieByGenre()");
		// create movieDto Object
		MovieDto movieDto = new MovieDto();
		movieDto.setMovieGenres(movieRepo.movieByGenre(genreId));
		return movieDto;
	}

	@Override
	public List<MovieDto> movieByTitle(String title) {

		System.out.println("Inside MovieService movieByTitle()");
		List<Movie> movies = movieRepo.movieByTitle(title);
		// Create list of movieDtos
		List<MovieDto> movieDtos = new ArrayList<MovieDto>();

		for (Movie movie : movies) {
			// convert values in movie to movieDTO
			MovieDto movieDto = new MovieDto(movie.getMovieId(), movie.getMovieTitle());
			movieDto.setNumberOfRecommendations(movie.getNumberOfRecommendations());
			movieDto.setReleaseDate(movie.getReleaseDate());
			movieDto.setOverallRating(movie.getOverallRating());
			// add each movieDTO to list
			movieDtos.add(movieDto);
		}

		System.out.println("MovieDto" + movieDtos);

		return movieDtos;
	}

	
}
