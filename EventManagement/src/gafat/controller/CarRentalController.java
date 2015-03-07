package gafat.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import gafat.domain.Car;
import gafat.domain.CarRentalSearch;
import gafat.service.ServiceImplementation;
import gafat.service.ServiceInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller 
public class CarRentalController {
	@Autowired
	ServiceInterface service;
	@RequestMapping({"/searchCar"})
	public String carSearchForm( @ModelAttribute("rentalSearch") CarRentalSearch search)
	{
		return "CarSearch";
			
	}
	@RequestMapping(value={"/searchCar"}, method=RequestMethod.POST)
	public String SearchCar( @ModelAttribute("rentalSearch") CarRentalSearch search,Model model)
	{
		System.out.println(search.getSearchState());
//		ArrayList<Car> listOfCars=new ArrayList<Car>();
//		Car car=service.searchCars(search.getSearchState());
//		listOfCars.add(car);
//		System.out.println(car.getState());
//		model.addAttribute("listOfCars", listOfCars);
		return "carForRent";
			
	}
	@RequestMapping(value={"/addCar"},method=RequestMethod.GET)
	public String addCarForm(@ModelAttribute("car") Car car)
	{
		return "addCarForm";
			
	}
	@RequestMapping(value={"/addCar"},method=RequestMethod.POST)
	public String addCar(@Valid @ModelAttribute("car") Car car,BindingResult result,Model model)
	{
		if(result.hasErrors())
		{
			return "addCarForm";
		}
		service.addCar(car);
		model.addAttribute(car);
		for(Car c:service.getAllCars())
	     System.out.println(c.getCompanyName());
		return "carDetail";
			
	}

}
