package gafat.controller;

import javax.validation.Valid;

import gafat.domain.Reservation;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ReservationController {

@RequestMapping(value={"/","/getReservation"}, method=RequestMethod.GET)

public String getReservationForm(@ModelAttribute("reservation") Reservation reservation)
    {
	  return "ReservationForm";
    }


@RequestMapping(value={"/","/addReservation"}, method=RequestMethod.POST)

public String saveResrvation(@Valid @ModelAttribute("reservation") Reservation reservation, BindingResult result)
    {
	
	if(result.hasErrors()){ System.out.println("invalid..."); return "ReservationForm";
		
	}
	  System.out.println("valid...");
	  
	  
	  
	  return "paymentForm";
    }

	
}
