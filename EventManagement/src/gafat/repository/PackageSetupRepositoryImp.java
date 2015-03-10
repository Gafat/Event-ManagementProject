package gafat.repository;

import gafat.domain.ServiceTypes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;




public class PackageSetupRepositoryImp {
	List<ServiceTypes> listOfPackages=new ArrayList<ServiceTypes>();
	public List<String> getPackageList()
	{
		List<String> packageList=new ArrayList<>();
		packageList.add("Package1");
		packageList.add("Package2");
		packageList.add("Package3");
		return packageList;
	}
	
	
	public List<ServiceTypes> getPackageSetUp(){
		return listOfPackages;
		
	}
	
	public void savePackageSetup(ServiceTypes pack){
		listOfPackages.add(pack);
		return ;
		
	}
	

}
