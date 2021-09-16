package com.entlogics.moviedb.movie;

import java.time.LocalDate;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "dt_movie")
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "movie_id", nullable = false)
	private int movieId;
	
	@Column(name = "movie_title")
	private String movieTitle;
	
	@Column(name = "release_date")
	private LocalDate releaseDate;
	
	@Column(name = "runtime")
	int runtime;
	
	@Column(name = "total_gross_income_dollar")
	private int totalGrossIncomeDollar;
	
	@Column(name = "overview")
	private String overview;
	
	
	@Column(name = "pg_rating")
	private String pgRating;
	
	@Column(name = "movie_poster")
	private byte[] moviePoster;
	
	@Column(name = "budget_dollar")
	private int budgetInDollar;
	
	@Column(name = "country_of_origin")
	private String countryOfOrigin;
	
	@Column(name = "overall_rating")
	private float overallRating;
	
	@Column(name = "no_of_recommendations")
	private int numberOfRecommendations;
	//private List <movie_cast>;
	//private List <movie_crew>;
	//private  <movie_company>;
	//private <movie_genre>;
	//private <movie_language>;
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
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
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
	
	
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieTitle=" + movieTitle + ", releaseDate=" + releaseDate
				+ ", runtime=" + runtime + ", totalGrossIncomeDollar=" + totalGrossIncomeDollar + ", overview="
				+ overview + ", pgRating=" + pgRating + ", moviePoster=" + Arrays.toString(moviePoster)
				+ ", budgetInDollar=" + budgetInDollar + ", countryOfOrigin=" + countryOfOrigin + ", overallRating="
				+ overallRating + ", numberOfRecommendations=" + numberOfRecommendations + "]";
	}
	
}
