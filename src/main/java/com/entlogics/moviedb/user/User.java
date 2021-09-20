package com.entlogics.moviedb.user;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "dt_user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id", nullable = false)
	private int userId;

	@Column(name = "password")
	private String password;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "username")
	private String userName;

	@Column(name = "email")
	private String email;

	@Column(name = "role")
	private String role;

	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "created_date")
	private LocalDate createdDate;
	
	@Column(name = "last_password_change")
	private LocalDate lastPasswordChange;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	List<UserMovie> moviesOfUser;

	@OneToMany(mappedBy = "userActivity", cascade = CascadeType.ALL)
	private List<UserActivity> userActivities;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDate getLastPasswordChange() {
		return lastPasswordChange;
	}

	public void setLastPasswordChange(LocalDate lastPasswordChange) {
		this.lastPasswordChange = lastPasswordChange;
	}

	public List<UserMovie> getMoviesOfUser() {
		return moviesOfUser;
	}

	public void setMoviesOfUser(List<UserMovie> moviesOfUser) {
		this.moviesOfUser = moviesOfUser;
	}

	public List<UserActivity> getUserActivities() {
		return userActivities;
	}

	public void setUserActivities(List<UserActivity> userActivities) {
		this.userActivities = userActivities;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", firstName=" + firstName + ", lastName="
				+ lastName + ", userName=" + userName + ", email=" + email + ", role=" + role + ", moviesOfUser="
				+ moviesOfUser + "]";
	}

}
