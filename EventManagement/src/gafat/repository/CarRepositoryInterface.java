package gafat.repository;

import gafat.domain.Car;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CarRepositoryInterface extends  CrudRepository<Car, Long> {
//	public void addCar(Car car);
//	public List<String> getStateNameList(String country);
//	public ArrayList<Car> getAllCars();
//	public ArrayList<Car> listOfCars=new ArrayList<Car>();

}
