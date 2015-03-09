package gafat.repository;

import gafat.domain.Packages;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;



@Repository
public class PackageSetupRepositoryImp implements PackageSetupRepository {
	List<Packages> listOfPackages=new ArrayList<Packages>();
	public List<String> getPackageList()
	{
		List<String> packageList=new ArrayList<>();
		packageList.add("Package1");
		packageList.add("Package2");
		packageList.add("Package3");
		return packageList;
	}
	
	
	public List<Packages> getPackageSetUp(){
		return listOfPackages;
		
	}
	
	public void savePackageSetup(Packages pack){
		listOfPackages.add(pack);
		return ;
		
	}
	

}
