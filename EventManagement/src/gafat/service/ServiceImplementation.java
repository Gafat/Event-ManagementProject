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

	public ArrayList<Car> searchCars(String state) {
		ArrayList<Car> listOfCars=new ArrayList<Car>();
		for(Car car :carsRepository.getAllCars())
		  if(car.getState().equals(state))	
			   listOfCars.add(car);
		
		  
			
			return listOfCars;
		
		
	}

	public void addCar(Car car) {
		carsRepository.addCar(car);
		
	}

	public ArrayList<Car> getAllCars() {
		
		return carsRepository.getAllCars();
	}

}
