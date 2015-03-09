package gafat.domain;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

public class Car {
	@NotEmpty
	private String companyName;
   @Min(1)
	private double price;
    
   	private String Type; // compact , mid size, economy, standard, full size
   	@Min(1)
	private int numOfPeople;
   	@Min(1)
	private int numOfBags;
   	@NotEmpty
	private String model;
	@Min(1)
	private int numOfCars;
	@NotEmpty
	private String state;
	@NotEmpty
	private String city;
//	public Car(double price, String type , int numOfPeople,int numOfBags,String model,int numOfCars,String state)
//	{
//		this.price=price;
//		this.Type=type;
//		this.numOfPeople=numOfPeople;
//		this.numOfBags=numOfBags;
//		this.model=model;
//		this.state=state;
//		this.numOfCars=numOfCars;
//		
//	}
	public Car()
	{
		
	}
	
	public int getNumOfCars() {
		return numOfCars;
	}
	public void setNumOfCars(int numOfCars) {
		this.numOfCars = numOfCars;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public int getNumOfPeople() {
		return numOfPeople;
	}
	public void setNumOfPeople(int numOfPeople) {
		this.numOfPeople = numOfPeople;
	}
	public int getNumOfBags() {
		return numOfBags;
	}
	public void setNumOfBags(int numOfBags) {
		this.numOfBags = numOfBags;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	

}
