package com.entlogics.moviedb.movie;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.entlogics.moviedb.admin.Person;

@Entity
@Table(name = "lt_movie_crew")
@IdClass(MovieCrew.class)
public class MovieCrew implements Serializable {

	@Id
	@ManyToOne
	@JoinColumn(name = "movie_id")
	private Movie movie;

	@Id
	@ManyToOne
	@JoinColumn(name = "person_id")
	private Person person;

	@Column(name = "renumeration")
	private int renumeration;

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

	public int getRenumeration() {
		return renumeration;
	}

	public void setRenumeration(int renumeration) {
		this.renumeration = renumeration;
	}

	public String getCrewRole() {
		return crewRole;
	}

	public void setCrewRole(String crewRole) {
		this.crewRole = crewRole;
	}

	@Override
	public String toString() {
		return "MovieCast [movie=" + movie + ", person=" + person + ", renumeration=" + renumeration + ", actorRole="
				+ crewRole + "]";
	}

}
