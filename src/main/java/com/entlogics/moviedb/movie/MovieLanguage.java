package com.entlogics.moviedb.movie;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.entlogics.moviedb.admin.Language;

@Entity
@Table(name = "lt_movie_language")
@IdClass(MovieLanguage.class)
public class MovieLanguage implements Serializable {

	@Id
	@ManyToOne
	@JoinColumn(name = "movie_id")
	private Movie movie;

	@Id
	@ManyToOne
	@JoinColumn(name = "language_id")
	private Language language;

	public MovieLanguage() {
		super();
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "MovieLanguage [movie=" + movie + ", language=" + language + "]";
	}

}
