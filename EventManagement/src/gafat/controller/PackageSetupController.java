package gafat.controller;

import java.util.ArrayList;
import java.util.List;

import gafat.domain.Packages;
import gafat.service.PackageSetupService;






import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PackageSetupController {
	@Autowired
	PackageSetupService pkgService;
		@RequestMapping(value = {"packageSetup"}, method=RequestMethod.GET)
	    public String packageSetup(@ModelAttribute("packages") Packages pack) {
			
			return "PackageSetup";
		}
		
		@RequestMapping(value = {"/","packageSetup"})
	    public String addPackageSetup(@ModelAttribute("packages") Packages pack) {
			
			return "PackageSetup";
		}
		
		
		

}
