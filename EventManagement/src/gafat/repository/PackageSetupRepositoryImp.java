package gafat.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;



@Repository
public class PackageSetupRepositoryImp implements PackageSetupRepository {
	
	public List<String> getPackageList()
	{
		List<String> packageList=new ArrayList<>();
		packageList.add("Package1");
		packageList.add("Package2");
		packageList.add("Package3");
		return packageList;
	}
	

}
