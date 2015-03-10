package gafat.domain;

import java.util.HashMap;






public class Reservation {
	
    //@NotEmpty(message="String.empty")
	private String firstName;
	
	private String lastName;
	
	private String tel;
	private String email;
	
	private String street;
	private String city;
	private String state;
	private String zip;
	
	//billing Address
    private String bfirstName;
	
	private String blastName;
	
	private String btel;
	private String bemail;
	
	private String bstreet;
	private String bcity;
	private String bstate;
	private String bzip;
	
	private boolean sameAddress=true;

	
	//payment info
	private String paymentMethod ;
	private String cardNumber;
	private String expDate;
	private String ccv;
	
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
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	public String getCcv() {
		return ccv;
	}
	public void setCcv(String ccv) {
		this.ccv = ccv;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getBfirstName() {
		return bfirstName;
	}
	public void setBfirstName(String bfirstName) {
		this.bfirstName = bfirstName;
	}
	public String getBlastName() {
		return blastName;
	}
	public void setBlastName(String blastName) {
		this.blastName = blastName;
	}
	public String getBtel() {
		return btel;
	}
	public void setBtel(String btel) {
		this.btel = btel;
	}
	public String getBemail() {
		return bemail;
	}
	public void setBemail(String bemail) {
		this.bemail = bemail;
	}
	public String getBstreet() {
		return bstreet;
	}
	public void setBstreet(String bstreet) {
		this.bstreet = bstreet;
	}
	public String getBcity() {
		return bcity;
	}
	public void setBcity(String bcity) {
		this.bcity = bcity;
	}
	public String getBstate() {
		return bstate;
	}
	public void setBstate(String bstate) {
		this.bstate = bstate;
	}
	public String getBzip() {
		return bzip;
	}
	public void setBzip(String bzip) {
		this.bzip = bzip;
	}
	public boolean isSameAddress() {
		return sameAddress;
	}
	public void setSameAddress(boolean sameAddress) {
		this.sameAddress = sameAddress;
	}
	
	
	
	
}
