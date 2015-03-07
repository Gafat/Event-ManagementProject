package gafat.service;

import gafat.domain.Wedding;
import gafat.repository.WeddingRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class WeddingServiceImpl implements WeddingService {
	
	@Autowired 
	WeddingRepository weddinRepository;
	
	public List<String> getCountryNameList()
	{
		List<String> countryNameList=new ArrayList();
		countryNameList=weddinRepository.getCountryNameList();
		return countryNameList;		
	}
	
	public List<String> getStateNameList(String country) {
		List<String> stateNameList=new ArrayList();
		stateNameList=weddinRepository.getStateNameList(country);
		return stateNameList;
	}



	public List<String> getCityNameList(String state) {
		
		return null;
	}

	public String getState(String country) {
		
		return null;
	}


	@Override
	public String getCity(String state) {
		// TODO Auto-generated method stub
		return null;
	}


	public String getSelectedCountry() {
		
		return weddinRepository.getSelectedCountry();
	}

}
