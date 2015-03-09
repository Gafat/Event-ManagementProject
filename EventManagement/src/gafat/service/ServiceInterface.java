package gafat.service;

import java.util.ArrayList;

import gafat.domain.Car;

public interface ServiceInterface {
	public ArrayList<Car> searchCars(String state);
	public void addCar(Car car);
	public ArrayList<Car> getAllCars();
	public ArrayList<Car> listOfCars=new ArrayList<Car>();

}
