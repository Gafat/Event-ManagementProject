package gafat.controller;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.validation.Valid;

import gafat.domain.Car;
import gafat.domain.CarRentalSearch;
import gafat.service.ServiceImplementation;
import gafat.service.ServiceInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller 
public class CarRentalController {
@Autowired
ServiceInterface service;
	//ServiceImplementation service=new ServiceImplementation();
	@RequestMapping({"/","/searchCar"})
	public String carSearchForm( @ModelAttribute("rentalSearch") CarRentalSearch search)
	{
		return "CarSearch";
			
	}
	@RequestMapping(value={"/searchCar"}, method=RequestMethod.POST)
	public String SearchCar(@Valid  @ModelAttribute("rentalSearch") CarRentalSearch search,BindingResult result,Model model)
	{
		if(result.hasErrors())
		{
			System.out.println("hello");
			return "CarSearch";
		}
		//double totalCost=service.CalculateTotalCost(search.getPickUpDate(), search.getDropOffDate());
		//System.out.println(search.getSearchState());
		//long numofDays=search.getDropOffDate().getTime()-search.getPickUpDate().getTime();
//		System.out.println(numofDays / (1000 * 60 * 60 * 24));
//		System.out.println();
	ArrayList<Car> listOfCars=service.findAllCars(search.getSearchState(),search.getPickUpDate(),search.getDropOffDate());
   //model.addAttribute("totalCost",totalCost);
  	model.addAttribute("listOfCars", listOfCars);
		return "carForRent";
			
	}
	@RequestMapping(value={"/addCar"},method=RequestMethod.GET)
	public String addCarForm(@ModelAttribute("car") Car car)
	{
		return "addCarForm";
			
	}
	@RequestMapping(value={"/addCar"},method=RequestMethod.POST)
	public String addCar(@Valid @ModelAttribute Car car,BindingResult result, Model model)
	{
		if(result.hasErrors())
		{
			System.out.println("hello");
			return "addCarForm";
		}
	
	
		service.saveCar(car);
		model.addAttribute("car",car);
		
		return "carDetail";
			
	}
	
	@InitBinder
	  public void initBinder(WebDataBinder binder) {
//	    SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
//	    dateFormat.setLenient(false);
//	    binder.registerCustomEditor(Date.class,
//	        new CustomDateEditor(dateFormat, false));
  }

}
