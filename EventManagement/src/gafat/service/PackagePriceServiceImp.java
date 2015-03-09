package gafat.service;

import org.springframework.beans.factory.annotation.Autowired;

import gafat.domain.PackagePrice;
import gafat.repository.PackagePriceRepository;

public class PackagePriceServiceImp implements PackagePriceService {
	@Autowired
	PackagePriceRepository packagePriceRepository;
	
	public void savePackaagePrice(PackagePrice packagePrice){
		packagePriceRepository.savePackaagePrice(packagePrice);
		
	}

}
