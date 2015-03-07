package gafat.controller;

import gafat.domain.Wedding;
import gafat.service.WeddingService;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller

public class WeddingController {
	
@Autowired
WeddingService weddingService;
	@RequestMapping(value = {"/","/wedding"})
    public String weddingEventRegistration(Model model) {
		List<String> countrys=new ArrayList();
		List<String> states=new ArrayList();
		countrys=weddingService.getCountryNameList();
		String country=getSelectedCountry();
		states=weddingService.getStateNameList(country);
		model.addAttribute("countrys",countrys);
		model.addAttribute("states", states);
		return "wedding";
	}
public String getSelectedCountry()
{
	return weddingService.getSelectedCountry();
}
 @RequestMapping(value={"/weddingR"})
 public String registerWedding(@Valid @ModelAttribute  Wedding weding, BindingResult bindingResult,
			Model model) 
 	{
	 if (bindingResult.hasErrors()) {
			return "wedding";
		}
	 return "weddingDetail";
 	}
}
