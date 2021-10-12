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
@Table(name = "tt_movie_cost")
@IdClass(MovieCast.class)
public class MovieCast implements Serializable {

	
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

	@Column(name = "remuneration")
	private int remuneration;

	@Column(name = "actor_role")
	private String actorRole;
	
	@Column(name = "character_name")
	private String characterName;

	public MovieCast() {
		super();

	}

	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
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


	public String getActorRole() {
		return actorRole;
	}

	public void setActorRole(String actorRole) {
		this.actorRole = actorRole;
	}

	public int getRemuneration() {
		return remuneration;
	}

	public void setRemuneration(int remuneration) {
		this.remuneration = remuneration;
	}
	

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

	@Override
	public String toString() {
		return "MovieCast [movie=" + movie + ", person=" + person + ", remuneration=" + remuneration + ", actorRole="
				+ actorRole + "]";
	}

	

}
