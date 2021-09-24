package com.entlogics.moviedb.admin.entities;

import java.sql.Date;
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

import com.entlogics.moviedb.movie.entities.MovieCast;
import com.entlogics.moviedb.movie.entities.MovieCrew;

@Entity
@Table(name = "dt_person")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "person_id")
	private int personId;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "gender")
	private String gender;

	@Column(name = "role")
	private String role;

	@Column(name = "email_id")
	private String emailId;

	@Column(name = "date_of_birth")
	private Date dateOfBirth;

	@Column(name = "age")
	private int age;

	@Column(name = "is_alive")
	private int isAlive;

	@Column(name = "nationality")
	private String nationality;

	@Column(name = "imdb_link")
	private String imdbLink;

	@OneToMany(mappedBy = "person", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<MovieCast> personMoviesAsCast;

	@OneToMany(mappedBy = "person", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<MovieCrew> personMoviesAsCrew;

	public Person() {
		super();

	}

	public Person(int personId, String firstName, String lastName) {
		super();
		this.personId = personId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getIsAlive() {
		return isAlive;
	}

	public void setIsAlive(int isAlive) {
		this.isAlive = isAlive;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getImdbLink() {
		return imdbLink;
	}

	public void setImdbLink(String imdbLink) {
		this.imdbLink = imdbLink;
	}

	public List<MovieCast> getPersonMoviesAsCast() {
		return personMoviesAsCast;
	}

	public void setPersonMoviesAsCast(List<MovieCast> personMoviesAsCast) {
		this.personMoviesAsCast = personMoviesAsCast;
	}

	public List<MovieCrew> getPersonMoviesAsCrew() {
		return personMoviesAsCrew;
	}

	public void setPersonMoviesAsCrew(List<MovieCrew> personMoviesAsCrew) {
		this.personMoviesAsCrew = personMoviesAsCrew;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", firstName=" + firstName + ", lastName=" + lastName + ", role=" + role
				+ ", dateOfBirth=" + dateOfBirth + ", age=" + age + "]";
	}

}
