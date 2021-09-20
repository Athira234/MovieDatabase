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
