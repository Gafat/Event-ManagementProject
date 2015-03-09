package gafat.repository;

import java.util.ArrayList;
import java.util.List;

import gafat.domain.PackagePrice;

public class PackagePriceRepositoryImp implements PackagePriceRepository{
	List<PackagePrice> listOfPackagePrice=new ArrayList<PackagePrice>();
	public void savePackaagePrice(PackagePrice packagePrice){
		listOfPackagePrice.add(packagePrice);
	}

}
