package gafat.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gafat.domain.Car;
//import gafat.repository.CarRepositoryImplementation;
import gafat.repository.CarRepositoryInterface;

@Service
@Transactional
public class ServiceImplementation  implements ServiceInterface{
	
	@Autowired
	CarRepositoryInterface carsRepository;

	public ArrayList<Car> findAllCars(String state,Date pickup,Date dropOff) {
		ArrayList<Car> listOfCars=new ArrayList<Car>();
		for(Car car :carsRepository.findAll())
		{
		  if(car.getState().equals(state))	
		  {
			  double total=CalculateTotalCost(pickup, dropOff, car.getPrice());
			  car.setTotalCost(total);
			  listOfCars.add(car);
		  }
			  
		
		}
			
			return listOfCars;
		
		
	}

	public void saveCar(Car car) {
		carsRepository.save(car);
		
	}
  public double CalculateTotalCost(Date pickup,Date dropOff,double price)
  {
	  if(dropOff.getTime()==pickup.getTime())
		  return price;
	  else
	  {
	  long numofDays=(dropOff.getTime()-pickup.getTime())+1;
		double totalCost=numofDays / (1000 * 60 * 60 * 24)*price;
	  
		
	  return totalCost;
	  }
  }
	public ArrayList<Car> getAllCars() {
		
		return (ArrayList<Car>) carsRepository.findAll();
	}

	@Override
	public List<String> getStateNameList(String country) {
		// TODO Auto-generated method stub
		return null;
	}

}
