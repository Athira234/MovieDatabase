package com.entlogics.moviedb.user.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "tt_user_watchlist_items")
@IdClass(UserWatchListItems.class)
public class UserWatchListItems implements Serializable {

	@Id
	@Column(name = "watchlist_id")
	private int watchlistId;
	@Id
	@Column(name = "movie_id")
	private int movieId;

	@Column(name = "notes")
	private String notes;

	@Column(name = "date_added")
	private LocalDate dateAdded;

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
