package gafat.service;

import java.util.List;

public interface WeddingService {
	public List<String> getCountryNameList();
	public List<String> getStateNameList(String country);
	public List<String> getCityNameList(String state);
	public String getSelectedCountry();
	
	public String getState(String country);
	public String getCity(String state);

}
