package gafat.domain;



import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class CarRentalSearch {
	@NotEmpty
private String searchState;
@NotNull
private Date pickUpDate;

private String pickUpTime;
@NotNull
private Date dropOffDate;

private String dropOffTime;
public String getSearchState() {
	return searchState;
}
public void setSearchState(String searchState) {
	this.searchState = searchState;
}


public String getPickUpTime() {
	return pickUpTime;
}
public void setPickUpTime(String pickUpTime) {
	this.pickUpTime = pickUpTime;
}
public String getDropOffTime() {
	return dropOffTime;
}
public void setDropOffTime(String dropOffTime) {
	this.dropOffTime = dropOffTime;
}
public Date getPickUpDate() {
	return pickUpDate;
}
public void setPickUpDate(Date pickUpDate) {
	this.pickUpDate = pickUpDate;
}

public Date getDropOffDate() {
	return dropOffDate;
}
public void setDropOffDate(Date dropOffDate) {
	this.dropOffDate = dropOffDate;
}
//public Date getDropOffTime() {
//	return dropOffTime;
//}
//public void setDropOffTime(Date dropOffTime) {
//	this.dropOffTime = dropOffTime;
//}


}
