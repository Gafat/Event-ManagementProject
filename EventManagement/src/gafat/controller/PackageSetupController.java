package gafat.controller;



import javax.validation.Valid;

import gafat.domain.PackageServicePrice;
import gafat.domain.ServiceTypes;

import gafat.service.ServiceTypesService;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PackageSetupController {
	@Autowired
	ServiceTypesService pkgService;
		@RequestMapping(value = {"/abiy","/packageSetup"}, method=RequestMethod.GET)
	    public String packageSetup(@ModelAttribute("packages") ServiceTypes pack) {
			
			return "PackageSetup";
		}
		

		@RequestMapping(value={"/addPackage"})
		 public String registerWedding(@Valid @ModelAttribute  ServiceTypes packages, BindingResult bindingResult,
					Model model) 
		 	{
				if(bindingResult.hasErrors()){
					
					return "PackageSetup";
				}
				pkgService.save(packages);
				model.addAttribute("packagePrice", new PackageServicePrice());
				return "PackagePriceEntry";
					
						 
		 	}
		
		@RequestMapping(value = {"/addPackagePrice"}, method=RequestMethod.GET)
	    public String addPrice(@ModelAttribute("packagePrice") PackageServicePrice pack) {
			
			return "PackagePriceEntry";
		}
		

}
