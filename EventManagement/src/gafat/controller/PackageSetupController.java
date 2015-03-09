package gafat.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import gafat.domain.PackagePrice;
import gafat.domain.Packages;
import gafat.domain.Wedding;
import gafat.service.PackageSetupService;










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
	PackageSetupService pkgService;
		@RequestMapping(value = {"/abiy","/packageSetup"}, method=RequestMethod.GET)
	    public String packageSetup(@ModelAttribute("packages") Packages pack) {
			
			return "PackageSetup";
		}
		

		@RequestMapping(value={"/addPackage"})
		 public String registerWedding(@Valid @ModelAttribute  Packages packages, BindingResult bindingResult,
					Model model) 
		 	{
				if(bindingResult.hasErrors()){
					pkgService.savePackageSetup(packages);
					return "PackageSetup";
				}
				model.addAttribute("packagePrice", new PackagePrice());
				return "PackagePriceEntry";
					
						 
		 	}
		
		@RequestMapping(value = {"/addPackagePrice"}, method=RequestMethod.GET)
	    public String addPrice(@ModelAttribute("packagePrice") PackagePrice pack) {
			
			return "PackagePriceEntry";
		}
		

}
