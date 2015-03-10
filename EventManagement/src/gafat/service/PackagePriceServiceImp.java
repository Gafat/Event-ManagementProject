package gafat.service;

import org.springframework.beans.factory.annotation.Autowired;

import gafat.domain.PackageServicePrice;
import gafat.repository.PackagePriceRepository;

public class PackagePriceServiceImp implements PackagePriceService {
	@Autowired
	PackagePriceRepository packagePriceRepository;
	
	public void savePackaagePrice(PackageServicePrice packagePrice){
		packagePriceRepository.savePackaagePrice(packagePrice);
		
	}

}
