package com.entlogics.moviedb.user;

import java.io.Serializable;
import java.time.LocalDate;

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
@Table(name = "lt_user_watchlist_items")
@IdClass(UserWatchListItems.class)
public class UserWatchListItems implements Serializable {

	public UserWatchListItems() {
		super();

	}

	@Id
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name = "watchlist_id")
	private UserWatchList watchlistOfMovie;

	@Id
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name = "movie_id")
	private Movie moviesOfWatchlist;

	@Column(name = "notes")
	private String notes;
	
	@Column(name = "date_added")
	private LocalDate dateAdded;

	public UserWatchList getWatchlistOfMovie() {
		return watchlistOfMovie;
	}

	public void setWatchlistOfMovie(UserWatchList watchlistOfMovie) {
		this.watchlistOfMovie = watchlistOfMovie;
	}

	public Movie getMoviesOfWatchlist() {
		return moviesOfWatchlist;
	}

	public void setMoviesOfWatchlist(Movie moviesOfWatchlist) {
		this.moviesOfWatchlist = moviesOfWatchlist;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	

	public LocalDate getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(LocalDate dateAdded) {
		this.dateAdded = dateAdded;
	}

	@Override
	public String toString() {
		return "UserWatchListItems [watchlistOfMovie=" + watchlistOfMovie + ", moviesOfWatchlist=" + moviesOfWatchlist
				+ ", notes=" + notes + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((moviesOfWatchlist == null) ? 0 : moviesOfWatchlist.hashCode());
		result = prime * result + ((watchlistOfMovie == null) ? 0 : watchlistOfMovie.hashCode());
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
		UserWatchListItems other = (UserWatchListItems) obj;
		if (moviesOfWatchlist == null) {
			if (other.moviesOfWatchlist != null)
				return false;
		} else if (!moviesOfWatchlist.equals(other.moviesOfWatchlist))
			return false;
		if (watchlistOfMovie == null) {
			if (other.watchlistOfMovie != null)
				return false;
		} else if (!watchlistOfMovie.equals(other.watchlistOfMovie))
			return false;
		return true;
	}

}
