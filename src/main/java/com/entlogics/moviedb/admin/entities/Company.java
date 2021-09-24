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

import com.entlogics.moviedb.movie.entities.MovieCompany;

@Entity
@Table(name = "dt_company")
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "company_id")
	private int companyId;

	@Column(name = "company_name")
	private String companyName;

	@Column(name = "ceo")
	private String ceo;

	@Column(name = "established_in")
	private Date establishedIn;

	@Column(name = "email_id")
	private String emailId;

	@Column(name = "headquarter")
	private String headquarter;

	@Column(name = "country")
	private String country;

	@Column(name = "website")
	private String website;

	@Column(name = "description")
	private String desciption;

	@OneToMany(mappedBy = "company", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<MovieCompany> moviesOfThisCompany;

	public Company() {
		super();

	}

	public Company(int companyId, String companyName, String ceo, Date establishedIn) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.ceo = ceo;
		this.establishedIn = establishedIn;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public Date getEstablishedIn() {
		return establishedIn;
	}

	public void setEstablishedIn(Date establishedIn) {
		this.establishedIn = establishedIn;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getHeadquarter() {
		return headquarter;
	}

	public void setHeadquarter(String headquarter) {
		this.headquarter = headquarter;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}

	public List<MovieCompany> getMoviesOfThisCompany() {
		return moviesOfThisCompany;
	}

	public void setMoviesOfThisCompany(List<MovieCompany> moviesOfThisCompany) {
		this.moviesOfThisCompany = moviesOfThisCompany;
	}

	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", ceo=" + ceo + ", establishedIn="
				+ establishedIn + ", emailId=" + emailId + ", headquarter=" + headquarter + "]";
	}

}
