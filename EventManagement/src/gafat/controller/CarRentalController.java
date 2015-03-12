package gafat.controller;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
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
import org.springframework.web.multipart.MultipartFile;

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
		
			return "CarSearch";
		}
	
	ArrayList<Car> listOfCars=service.findAllCars(search.getSearchState(),search.getPickUpDate(),search.getDropOffDate());
   //model.addAttribute("totalCost",totalCost);
	if(listOfCars.isEmpty())
	
		 model.addAttribute("Notfound", "We dont have Cars registerd on   " +search.getSearchState() );
		 
	else
  	   model.addAttribute("listOfCars", listOfCars);
	return "carForRent";
			
	}
	@RequestMapping(value={"/addCar"},method=RequestMethod.GET)
	public String addCarForm(@ModelAttribute("car") Car car)
	{
		return "addCarForm";
			
	}
	@RequestMapping(value={"/addCar"},method=RequestMethod.POST)
	public String addCar(@Valid @ModelAttribute Car car,BindingResult result, Model model,HttpServletRequest request)
	{
		if(result.hasErrors())
		{
			
			return "addCarForm";
		}
		MultipartFile carImage = car.getImage();
		String rootDirectory = request.getSession().getServletContext().getRealPath("/");
				
			if (carImage!=null && !carImage.isEmpty()) {
		       try {
		      	carImage.transferTo(new File(rootDirectory+"\\images\\"+car.getCompanyName() + ".jpeg"));
		       } catch (Exception e) {
				throw new RuntimeException("Product Image saving failed", e);
		   }
		   }
	//MultipartFile image=
		service.saveCar(car);
		model.addAttribute("car",car);
		
		return "carDetail";
			
	}
	@RequestMapping(value={"/delete"},method=RequestMethod.GET)
	public String deleteCarForm(@ModelAttribute("car") Car car)
	{
		return "delete";
		
	}
	@RequestMapping(value={"/delete"},method=RequestMethod.POST)
	public String deleteCar(@ModelAttribute Car car,BindingResult result, Model model)
	{
		System.out.println("hello");
		ArrayList<Car> listOfCars=service.findAllCarsByCompany(car.getCompanyName());
		for(Car car2:listOfCars)
			 System.out.println(car2.getCompanyName());
		model.addAttribute("listOfCars",listOfCars);
		return "delete";
		
	}
//	@InitBinder
//	  public void initBinder(WebDataBinder binder) {
////	    SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
////	    dateFormat.setLenient(false);
////	    binder.registerCustomEditor(Date.class,
////	        new CustomDateEditor(dateFormat, false));
//  }

}
