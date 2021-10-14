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

import com.entlogics.moviedb.movie.entities.MovieLanguage;

@Entity
@Table(name = "dt_language")
public class Language {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int language_id;

	@Column(name = "language")
	private String language;

	@OneToMany(mappedBy = "language", fetch = FetchType.LAZY)
	private List<MovieLanguage> moviesReleasedInThisLanguage;

	public Language() {
		super();
	}

	public int getLanguage_id() {
		return language_id;
	}

	public void setLanguage_id(int language_id) {
		this.language_id = language_id;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public List<MovieLanguage> getMoviesReleasedInThisLanguage() {
		return moviesReleasedInThisLanguage;
	}

	public void setMoviesReleasedInThisLanguage(List<MovieLanguage> moviesReleasedInThisLanguage) {
		this.moviesReleasedInThisLanguage = moviesReleasedInThisLanguage;
	}

	@Override
	public String toString() {
		return "Language [language_id=" + language_id + ", language=" + language + "]";
	}

}
