package gafat.repository;

import java.util.ArrayList;
import java.util.List;

import gafat.domain.PackageServicePrice;

public class PackagePriceRepositoryImp implements PackagePriceRepository{
	List<PackageServicePrice> listOfPackagePrice=new ArrayList<PackageServicePrice>();
	public void savePackaagePrice(PackageServicePrice packagePrice){
		listOfPackagePrice.add(packagePrice);
	}

}
