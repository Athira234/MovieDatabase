package com.entlogics.moviedb.user.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "dt_user_watchlist")
public class UserWatchList {

	public UserWatchList() {
		super();

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int watchlistId;

	@Column(name = "watchlist_name")
	private String watchlistName;

	@OneToOne
	@JoinColumn(name = "id", updatable = false)
	private User user;

	public int getWatchlistId() {
		return watchlistId;
	}

	public void setWatchlistId(int watchlistId) {
		this.watchlistId = watchlistId;
	}

	public String getWatchlistName() {
		return watchlistName;
	}

	public void setWatchlistName(String watchlistName) {
		this.watchlistName = watchlistName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "UserWatchList [watchlistId=" + watchlistId + ", watchlistName=" + watchlistName + "]";
	}

}
