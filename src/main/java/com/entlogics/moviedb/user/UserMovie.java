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

	public UserMovie() {
		super();

	}

	@Id
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name = "user_id")
	private User user;

	@Id
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name = "movie_id")
	private Movie movie;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((movie == null) ? 0 : movie.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserMovie other = (UserMovie) obj;
		if (movie == null) {
			if (other.movie != null)
				return false;
		} else if (!movie.equals(other.movie))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserMovie [isWatched=" + isWatched + ", isFavourite=" + isFavourite + ", isRecommeded=" + isRecommeded
				+ ", ratingGiven=" + ratingGiven + ", review=" + review + "]";
	}
}
