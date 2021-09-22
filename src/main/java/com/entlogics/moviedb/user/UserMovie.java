package com.entlogics.moviedb.user;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.entlogics.moviedb.movie.Movie;

@Entity
@Table(name = "lt_user_movie")
@IdClass(UserMovie.class)
public class UserMovie implements Serializable {

				
	@Column(name = "is_watched")
	private boolean isWatched;

	@Column(name = "is_favourite")
	private boolean isFavourite;

	@Column(name = "is_recommended")
	private boolean isRecommeded;

	@Column(name = "rating_given")
	private float ratingGiven;

	@Column(name = "review")
	private String review;

	@Id
	@Column(name = "user_id")
    private int userId;	
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name = "user_id",referencedColumnName = "user_id", insertable = false, updatable = false)
	private User user;

	@Id
	@Column(name = "movie_id")
    private int movieId;
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name = "movie_id",referencedColumnName = "movie_id", insertable = false, updatable = false)
	private Movie movie;
	
	

	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public boolean isWatched() {
		return isWatched;
	}

	public void setWatched(boolean isWatched) {
		this.isWatched = isWatched;
	}

	public boolean isFavourite() {
		return isFavourite;
	}

	public void setFavourite(boolean isFavourite) {
		this.isFavourite = isFavourite;
	}

	public boolean isRecommeded() {
		return isRecommeded;
	}

	public void setRecommeded(boolean isRecommeded) {
		this.isRecommeded = isRecommeded;
	}

	public float getRatingGiven() {
		return ratingGiven;
	}

	public void setRatingGiven(float ratingGiven) {
		this.ratingGiven = ratingGiven;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	
	

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	@Override
	public String toString() {
		return "UserMovie [isWatched=" + isWatched + ", isFavourite=" + isFavourite + ", isRecommeded=" + isRecommeded
				+ ", ratingGiven=" + ratingGiven + ", review=" + review + "]";
	}
}
