package gafat.controller;

import gafat.domain.Event;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.stereotype.Controller

public class EventController {
	
	private static final Log logger = LogFactory.getLog(EventController.class);
		
	@RequestMapping(value="/event")
	public String inputEmployee(Event event) {
		return "Event";
	}

	@RequestMapping(value="/continue")
	public String saveEmployee(@Valid @ModelAttribute  Event event, BindingResult bindingResult,
			Model model) {
 		
		if (bindingResult.hasErrors()) {
			return "Event";
		}
		
	   model.addAttribute("event", event);
	    
	   
		return "EventDetail";
	}
	
	
	@InitBinder
    public void initBinder(WebDataBinder binder) {
//         binder.setDisallowedFields("id");
//        binder.setRequiredFields("username", "password", "emailAddress");
        logger.info("initBinderin EventController");
    }
}
