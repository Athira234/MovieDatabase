package com.entlogics.moviedb.user.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.entlogics.moviedb.movie.entities.Movie;

@Entity
@Table(name = "tt_user_movie")
//@IdClass(UserMovie.class)
public class UserMovie implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id",nullable=false)
	private Integer id;
	
	@Column(name = "is_watched")
	private boolean isWatched;

	@Column(name = "is_favourite")
	private boolean isFavourite;

	@Column(name = "is_recommended")
	private boolean isRecommeded;

	@Column(name = "rating")
	private float ratingGiven;

	@Column(name = "review")
	private String review;
	
	@Column(name = "rating_given_date")
	private LocalDate ratingGivenDate;
	
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,
			CascadeType.REFRESH }, fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,
			CascadeType.REFRESH }, fetch = FetchType.LAZY)
	@JoinColumn(name = "movie_id")
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getRatingGivenDate() {
		return ratingGivenDate;
	}

	public void setRatingGivenDate(LocalDate ratingGivenDate) {
		this.ratingGivenDate = ratingGivenDate;
	}

	@Override
	public String toString() {
		return "UserMovie [id=" + id + ", isWatched=" + isWatched + ", isFavourite=" + isFavourite + ", isRecommeded="
				+ isRecommeded + ", ratingGiven=" + ratingGiven + ", review=" + review + "]";
	}

	
	}

	


