package gafat.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import gafat.domain.Reservation;
import gafat.exception.UserNotFoundException;
import gafat.service.ReservationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReservationController {
	
	@Autowired
	ReservationService reservationService;

@RequestMapping(value={"/","/ReservationForm"}, method=RequestMethod.GET)

public String getReservationForm(@ModelAttribute("reservation") Reservation reservation)
    {
	  return "ReservationForm";
    }


@RequestMapping(value={"/saveReservation"}, method=RequestMethod.POST)

public String saveReservation(@Valid @ModelAttribute("reservation") Reservation reservation, BindingResult result)
    {
	
	if(result.hasErrors()){ System.out.println("invalid..."); return "ReservationForm";
		
	}
	  System.out.println("valid...");
	  
	  
	  
	  return "paymentForm";
    }

@RequestMapping(value={"/thankyoupage"}, method=RequestMethod.POST)

public String thankyouReservation(@Valid @ModelAttribute("reservation") Reservation reservation, BindingResult result)
    {
	
	if(result.hasErrors()){ System.out.println("invalid..."); return "paymentForm";
		
	}
	  System.out.println("Thank you valid...");
	  
	  reservationService.saveReservation(reservation);
	  
	  return "thankyoupage";
    }	

@RequestMapping(value={"/authenticationPage"}, method=RequestMethod.GET)

public String authenticationPage(@ModelAttribute("reservation") Reservation reservation)
    {System.out.println("in auth");
	  return "authenticationPage";
    }



@RequestMapping(value={"/authenticate"}, method=RequestMethod.POST)

public String authenticate( @ModelAttribute("reservation") Reservation reservation ,Model model)
    {
	     //if(result.hasErrors()){ System.out.println("validatin Failed..."); return "registerationForm"; }	   
	     reservation = reservationService.authenticate(reservation);
	  if(reservation!=null){ model.addAttribute(reservation);return "ReservationForm";}
	  else throw new UserNotFoundException();
	  //return "authenticationPage";
    }

@RequestMapping(value={"/registerationForm"}, method=RequestMethod.GET)
public String registrationForm(@ModelAttribute("reservation") Reservation reservation)
{
   return "registerationForm";
}
@RequestMapping(value={"/saveRegisteration"}, method=RequestMethod.POST)
public String saveRegisteration(@Valid @ModelAttribute("reservation") Reservation reservation, BindingResult result)
{


  reservationService.saveReservation(reservation);
  
  return "ReservationForm";
}


/*
@ExceptionHandler(value=UserNotFoundException.class)	
public ModelAndView exhandler(HttpServletRequest request, UserNotFoundException e)
{  ModelAndView mav = new ModelAndView();
   mav.addObject("exceptionMsg", e.getMessage());
 mav.setViewName("UserNotFound");
 return mav;
	  
	  
}
*/
}
