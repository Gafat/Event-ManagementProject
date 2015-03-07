package gafat.repository;

import java.util.List;

public interface WeddingRepository {

	public List<String> getCountryNameList();
	public List<String> getStateNameList(String country);
	public List<String> getCityNameList(String state);
	public String getState(String country);
	public String getCity(String state);
	public String getSelectedCountry();
}
