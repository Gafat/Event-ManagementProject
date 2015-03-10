package gafat.domain;

import java.io.Serializable;
import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

public class Event  implements Serializable {
    private static final long serialVersionUID = -908L;

	private long id;
	private boolean wedding;
	public boolean isWedding() {
		return wedding;
	}
	public void setWedding(boolean wedding) {
		this.wedding = wedding;
	}
	public boolean isBirthDay() {
		return birthDay;
	}
	public void setBirthDay(boolean birthDay) {
		this.birthDay = birthDay;
	}
	public boolean isMeeting() {
		return meeting;
	}
	public void setMeeting(boolean meeting) {
		this.meeting = meeting;
	}
	private boolean birthDay;
	private boolean meeting;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	public double getNumberOfAttendants() {
		return numberOfAttendants;
	}
	public void setNumberOfAttendants(Double numberOfAttendants) {
		this.numberOfAttendants = numberOfAttendants;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Min(100)
	private double budget;
	
	private double numberOfAttendants;

	
	@NotNull
	private Date startDate;
	
	
	@NotNull
	private Date endDate;
	
	@NotEmpty()
	private String state;
	@NotEmpty()
	private String city;
	@NotEmpty()
	private String street;
	

	

}
