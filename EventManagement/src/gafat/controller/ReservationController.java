package gafat.controller;



import gafat.domain.Reservation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ReservationController {
	//update
	
@RequestMapping(value="/gez" ,method=RequestMethod.GET)

public String addReservation( @ModelAttribute("newReservation")Reservation reservation, Model model)
 {
   
	return "ReservationForm";
  }          

}
