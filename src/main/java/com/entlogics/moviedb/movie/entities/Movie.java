package com.entlogics.moviedb.movie.entities;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.entlogics.moviedb.user.entities.UserActivity;
import com.entlogics.moviedb.user.entities.UserMovie;

@Entity
@Table(name = "dt_movie")
//define named query
@NamedQueries({ 
@NamedQuery(name="Movie.findAll",query="SELECT m FROM Movie m")
}
)
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
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
	private String country;

	@Column(name = "overall_rating")
	private float overallRating;

	@Column(name = "no_of_recommendations")
	private int numberOfRecommendations;
	
	@Column(name = "release_type")
	private String releaseType;

	public String getReleaseType() {
		return releaseType;
	}

	public void setReleaseType(String releaseType) {
		this.releaseType = releaseType;
	}

	@OneToMany(mappedBy = "movie", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<MovieCast> movieCast;

	@OneToMany(mappedBy = "movie", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<MovieCrew> movieCrew;

	@OneToMany(mappedBy = "movie", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<MovieCompany> movieCompanies;

	@OneToMany(mappedBy = "movie", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<MovieGenre> movieGenres;

	@OneToMany(mappedBy = "movie", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<MovieLanguage> movieLanguages;

	@OneToMany(mappedBy = "userActivityOnmovie", cascade = CascadeType.ALL)
	private List<UserActivity> userActivityOnmovie;

	@OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
	List<UserMovie> usersOfMovie;

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
