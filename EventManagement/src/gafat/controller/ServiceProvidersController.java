package gafat.controller;

import gafat.domain.ServiceProviders;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ServiceProvidersController {
	@RequestMapping(value = { "addServProv" })
	public String addServiceProviders(
			@ModelAttribute("providers") ServiceProviders providers) {

		return "ServiceProviders";
	}

}
