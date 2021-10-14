package com.entlogics.moviedb.admin.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.entlogics.moviedb.movie.entities.MovieGenre;

@Entity
@Table(name = "dt_genre")
public class Genre {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int genreId;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

	@OneToMany(mappedBy = "genre", fetch = FetchType.LAZY)
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

	public List<MovieGenre> getMoviesWithThicmsGenre() {
		return moviesWithThisGenre;
	}

	public void setMoviesWithThisGenre(List<MovieGenre> moviesWithThisGenre) {
		this.moviesWithThisGenre = moviesWithThisGenre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Genre [genreId=" + genreId + ", description=" + description + "]";
	}

}
