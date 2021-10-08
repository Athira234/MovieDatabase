package com.entlogics.moviedb.movie.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class MovieDto implements Serializable {

	private int movieId;

	private String movieTitle;

	private LocalDate releaseDate;

	int runtime;

	private int totalGrossIncomeDollar;

	private String overview;

	private String pgRating;

	private byte[] moviePoster;

	private int budgetInDollar;

	private String country;

	private float overallRating;

	private int numberOfRecommendations;

	private String releaseType;

	private List<MovieCast> movieCast;

	private List<MovieCrew> movieCrew;

	private List<MovieCompany> movieCompanies;

	private List<MovieGenre> movieGenres;

	private List<MovieLanguage> movieLanguages;

	public MovieDto() {
		super();
		
	}

	public MovieDto(int movieId, String movieTitle) {
		super();
		this.movieId = movieId;
		this.movieTitle = movieTitle;
	}

	public String getReleaseType() {
		return releaseType;
	}

	public void setReleaseType(String releaseType) {
		this.releaseType = releaseType;
	}

	//	@OneToMany(mappedBy = "moviesOfWatchlist", cascade = CascadeType.ALL)
	// private List<UserWatchListItems> watchlistOfMovie;

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	public int getTotalGrossIncomeDollar() {
		return totalGrossIncomeDollar;
	}

	public void setTotalGrossIncomeDollar(int totalGrossIncomeDollar) {
		this.totalGrossIncomeDollar = totalGrossIncomeDollar;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public byte[] getMoviePoster() {
		return moviePoster;
	}

	public void setMoviePoster(byte[] moviePoster) {
		this.moviePoster = moviePoster;
	}

	public int getBudgetInDollar() {
		return budgetInDollar;
	}

	public void setBudgetInDollar(int budgetInDollar) {
		this.budgetInDollar = budgetInDollar;
	}

	public float getOverallRating() {
		return overallRating;
	}

	public void setOverallRating(float overallRating) {
		this.overallRating = overallRating;
	}

	public int getNumberOfRecommendations() {
		return numberOfRecommendations;
	}

	public void setNumberOfRecommendations(int numberOfRecommendations) {
		this.numberOfRecommendations = numberOfRecommendations;
	}

	public String getPgRating() {
		return pgRating;
	}

	public void setPgRating(String pgRating) {
		this.pgRating = pgRating;
	}

	public List<MovieLanguage> getMovieLanguages() {
		return movieLanguages;
	}

	public void setMovieLanguages(List<MovieLanguage> movieLanguages) {
		this.movieLanguages = movieLanguages;
	}

	public List<MovieGenre> getMovieGenres() {
		return movieGenres;
	}

	public void setMovieGenres(List<MovieGenre> movieGenres) {
		this.movieGenres = movieGenres;
	}

	public List<MovieCast> getMovieCast() {
		return movieCast;
	}

	public void setMovieCast(List<MovieCast> movieCast) {
		this.movieCast = movieCast;
	}

	public List<MovieCrew> getMovieCrew() {
		return movieCrew;
	}

	public void setMovieCrew(List<MovieCrew> movieCrew) {
		this.movieCrew = movieCrew;
	}

	public List<MovieCompany> getMovieCompanies() {
		return movieCompanies;
	}

	public void setMovieCompanies(List<MovieCompany> movieCompanies) {
		this.movieCompanies = movieCompanies;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieTitle=" + movieTitle + ", releaseDate=" + releaseDate
				+ ", runtime=" + runtime + ", totalGrossIncomeDollar=" + totalGrossIncomeDollar + ", overview="
				+ overview + ", pgRating=" + pgRating + ", moviePoster=" + Arrays.toString(moviePoster)
				+ ", budgetInDollar=" + budgetInDollar + ", countryOfOrigin=" + country + ", overallRating="
				+ overallRating + ", numberOfRecommendations=" + numberOfRecommendations + "]";
	}

}
