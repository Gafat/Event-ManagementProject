package gafat.domain;

import java.util.Date;

import java.io.Serializable;
import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class Wedding {
	@NotEmpty
	@NotNull
	
	String startDate;
	@NotEmpty
	@NotNull
	
	Date endDate;
	String State;
	@NotNull
	String city;
	String NumberOfAttendants;	
	String Country="United State of America";
	@NotNull
	String budget;
	public String getBudget() {
		return budget;
	}

	public void setBudget(String budget) {
		this.budget = budget;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	
	public Wedding() {
		
	}
	
	public String getStartDate() {
		return startDate;
	}
	public void setWeddingDate(String startDate) {
		this.startDate = startDate;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		city = city;
	}
	public String getNumberOfAttendants() {
		return NumberOfAttendants;
	}
	public void setNumberOfAttendants(String numberOfAttendies) {
		NumberOfAttendants = numberOfAttendies;
	}

	public Wedding(String startDate, String country, String state,
			String city, String NumberOfAttendants, Date endDate) {
		super();
		this.startDate = startDate;
		this.Country = country;
		this.State = state;
		this.city = city;
		this.NumberOfAttendants = NumberOfAttendants;
		this.endDate=endDate;
	}
	



}
