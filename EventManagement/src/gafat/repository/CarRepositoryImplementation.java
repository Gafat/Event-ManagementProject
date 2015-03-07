package gafat.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import gafat.domain.Car;

@Repository

public class CarRepositoryImplementation implements CarRepositoryInterface {

	public void addCar(Car car)
	{
		listOfCars.add(car);
	}

	public ArrayList<Car> getAllCars() {
		
		return listOfCars;
	}

	
}
