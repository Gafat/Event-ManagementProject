package gafat.repository;

import gafat.domain.Car;

import java.util.ArrayList;

public interface CarRepositoryInterface {
	public void addCar(Car car);
	public ArrayList<Car> getAllCars();
	public ArrayList<Car> listOfCars=new ArrayList<Car>();

}
