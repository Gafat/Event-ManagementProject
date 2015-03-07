package gafat.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gafat.domain.Car;
import gafat.repository.CarRepositoryImplementation;
import gafat.repository.CarRepositoryInterface;

@Service

public class ServiceImplementation  implements ServiceInterface{
	
	@Autowired
	CarRepositoryInterface carsRepository;

	public Car searchCars(String state) {
		for(Car car :carsRepository.getAllCars())
		  if(car.getState().equals(state))	
			   return car;
		
		  
			
			return null;
		
		
	}

	public void addCar(Car car) {
		carsRepository.addCar(car);
		
	}

	public ArrayList<Car> getAllCars() {
		
		return carsRepository.getAllCars();
	}

}
