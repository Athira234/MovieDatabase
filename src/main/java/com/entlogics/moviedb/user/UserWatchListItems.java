package com.entlogics.moviedb.user;

import java.io.Serializable;

import java.time.LocalDate;

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

		
	@Id
	@Column(name = "watchlist_id")
	private int watchlistId;
	@Id
    @ManyToOne
	@JoinColumn(name = "watchlist_id",referencedColumnName = "watchlist_id",insertable = false, updatable = false)
	private UserWatchList watchlistOfMovie;

	@Id
	@Column(name = "movie_id")
	private int movieId;
	
	@ManyToOne
	@JoinColumn(name = "movie_id",referencedColumnName = "movie_id", insertable = false, updatable = false)
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
	

	

	public int getWatchlistId() {
		return watchlistId;
	}

	public void setWatchlistId(int watchlist_Id) {
		this.watchlistId = watchlist_Id;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	

	@Override
	public String toString() {
		return "UserWatchListItems [watchlist_Id=" + watchlistId + ", movieId=" + movieId + ", notes=" + notes
				+ ", dateAdded=" + dateAdded + "]";
	}

	

}
