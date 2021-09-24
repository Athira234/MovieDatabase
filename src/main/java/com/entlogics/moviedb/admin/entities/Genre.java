package com.entlogics.moviedb.admin.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.entlogics.moviedb.movie.entities.MovieGenre;
import com.entlogics.moviedb.movie.entities.MovieLanguage;

@Entity
@Table(name = "dt_genre")
public class Genre {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "genre_id")
	private int genreId;

	@Column(name = "description")
	private String description;

	@OneToMany(mappedBy = "genre", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<MovieGenre> moviesWithThisGenre;

	public Genre() {
		super();

	}

	public int getGenreId() {
		return genreId;
	}

	public void setGenreId(int genreId) {
		this.genreId = genreId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<MovieGenre> getMoviesWithThisGenre() {
		return moviesWithThisGenre;
	}

	public void setMoviesWithThisGenre(List<MovieGenre> moviesWithThisGenre) {
		this.moviesWithThisGenre = moviesWithThisGenre;
	}

	@Override
	public String toString() {
		return "Genre [genreId=" + genreId + ", description=" + description + "]";
	}

}