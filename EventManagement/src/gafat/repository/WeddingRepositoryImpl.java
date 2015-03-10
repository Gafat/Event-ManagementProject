package gafat.repository;

import gafat.domain.Wedding;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class WeddingRepositoryImpl implements WeddingRepository {
	//@Autowired
	Wedding wedding=new Wedding();
	
	List<String> countryNameList=new ArrayList<>();
	List<String> stateNameList=new ArrayList<>();
	public void setCountry()
	{
		
		countryNameList.add("Afghanistan");
		countryNameList.add("Albania");
		countryNameList.add("Algeria");
		countryNameList.add("Andorra");
		countryNameList.add("Angola");
		countryNameList.add("Antigua and Barbuda");
		countryNameList.add("Argentina");
	    countryNameList.add("Armenia");
		countryNameList.add("Aruba");
		countryNameList.add("Australia");
		countryNameList.add("Austria");
		countryNameList.add("Azerbaijan");
		countryNameList.add("Bahamas");
		countryNameList.add("Bahrain");
		countryNameList.add("Bangladesh");
		countryNameList.add("Barbados");
		countryNameList.add("Belarus");
		countryNameList.add("Belgium");
		countryNameList.add("Belize");
		countryNameList.add("Canada");
		countryNameList.add("United State of America");
		


	}
	public void setState(String country)
	
	{
		stateNameList.clear();
		if(country.equals("United State of America"))
			
		{
			
			stateNameList.add("Alabama");
			stateNameList.add("Alaska");
			stateNameList.add("Alabama");
			stateNameList.add("Arizona");
			stateNameList.add("California");			
			stateNameList.add("Iowa");			
		}
		else if(country.equals("Canada"))
		{
			stateNameList.add("Ontario");
			stateNameList.add("Quebec");
			stateNameList.add("New Brunswick");
			stateNameList.add("Manitoba");
			stateNameList.add("British Columbia");			
			stateNameList.add("Prince Edward Island");
			stateNameList.add("Saskatchewan");
			stateNameList.add("Alberta");
			stateNameList.add("Newfoundland and Labrador");
			
		}
	}
	public List<String> getCountryNameList()
	{
		setCountry(); 

		return countryNameList;
	}


	public List<String> getStateNameList(String country) {
		
		setState(country);
		return stateNameList;
	
	}


	public List<String> getCityNameList(String state) {
	
		return null;
	}


	public String getState(String country) {
	
		return null;
	}


	public String getCity(String state) {
	
		return null;
	}
	@Override
	public String getSelectedCountry() {
		
		return wedding.getCountry();
	}
	
}
