package gafat.service;



import gafat.repository.PackageSetupRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PackageSetupServiceImp implements PackageSetupService {
	@Autowired 
	PackageSetupRepository pkgRepository;
	public List<String> getPackageList()
	{
		List<String> countryNameList=new ArrayList();
		countryNameList=pkgRepository.getPackageList();
		return countryNameList;		
	}
}
