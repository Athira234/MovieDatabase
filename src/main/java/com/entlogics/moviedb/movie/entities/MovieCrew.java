package com.entlogics.moviedb.movie.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.entlogics.moviedb.admin.entities.Person;

@Entity
@Table(name = "tt_movie_crew")
@IdClass(MovieCrew.class)
public class MovieCrew implements Serializable {

	@Id
	@Column(name = "movie_id")
	private int movieId;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="movie_id", referencedColumnName = "id",insertable = false, updatable = false)
	private Movie movie;

	@Id
	@Column(name = "person_id")
	private int personId;
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "person_id",referencedColumnName = "id",insertable = false, updatable = false)
	private Person person;

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	@Column(name = "remuneration")
	private int remuneration;

	@Column(name = "crew_role")
	private String crewRole;

	public MovieCrew() {
		super();

	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	
	public String getCrewRole() {
		return crewRole;
	}

	public void setCrewRole(String crewRole) {
		this.crewRole = crewRole;
	}

	public int getRemuneration() {
		return remuneration;
	}

	public void setRemuneration(int remuneration) {
		this.remuneration = remuneration;
	}

	@Override
	public String toString() {
		return "MovieCrew [movie=" + movie + ", person=" + person + ", remuneration=" + remuneration + ", crewRole="
				+ crewRole + "]";
	}


}
