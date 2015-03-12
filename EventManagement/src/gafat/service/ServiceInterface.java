package gafat.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import gafat.domain.Car;

public interface ServiceInterface {
	public ArrayList<Car> findAllCars(String state,Date pickup,Date dropOff);
	public void saveCar(Car car);
	public List<String> getStateNameList(String country);
	public double CalculateTotalCost(Date pickup,Date dropOff,double price);
	public ArrayList<Car> getAllCars();
	public ArrayList<Car> findAllCarsByCompany(String companyName);
	public ArrayList<Car> listOfCars=new ArrayList<Car>();

}
