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
		/*countryNameList.add("Benin
		countryNameList.add("Bhutan
		countryNameList.add("Bolivia
		countryNameList.add("Bosnia and Herzegovina
		countryNameList.add("Botswana
		countryNameList.add("Brazil
		countryNameList.add("Brunei 
		countryNameList.add("Bulgaria
		countryNameList.add("Burkina Faso
		countryNameList.add("Burma
		countryNameList.add("Burundi
		countryNameList.add("Cambodia
		Cameroon
		Canada
		Cape Verde
		Central African Republic
		Chad
		Chile
		China
		Colombia
		Comoros
		Congo, Democratic Republic of the
		Congo, Republic of the
		Costa Rica
		Cote d'Ivoire
		Croatia
		Cuba
		Curacao
		Cyprus
		Czech Republic
		Denmark
		Djibouti
		Dominica
		Dominican Republic
		East Timor (see Timor-Leste)
		Ecuador
		Egypt
		El Salvador
		Equatorial Guinea
		Eritrea
		Estonia
		Ethiopia
		Fiji
		Finland
		France
		Gabon
		Gambia, The
		Georgia
		Germany
		Ghana
		Greece
		Grenada
		Guatemala
		Guinea
		Guinea-Bissau
		Guyana
		Haiti
		Holy See
		Honduras
		Hong Kong
		Hungary
		Top of Page
		Iceland
		India
		Indonesia
		Iran
		Iraq
		Ireland
		Israel
		Italy
		Top of Page
		Jamaica
		Japan
		Jordan
		Top of Page
		Kazakhstan
		Kenya
		Kiribati
		Korea, North
		Korea, South
		Kosovo
		Kuwait
		Kyrgyzstan
		Laos
		Latvia
		Lebanon
		Lesotho
		Liberia
		Libya
		Liechtenstein
		Lithuania
		Luxembourg
		Top of Page
		Macau
		Macedonia
		Madagascar
		Malawi
		Malaysia
		Maldives
		Mali
		Malta
		Marshall Islands
		Mauritania
		Mauritius
		Mexico
		Micronesia
		Moldova
		Monaco
		Mongolia
		Montenegro
		Morocco
		Mozambique
		Namibia
		Nauru
		Nepal
		Netherlands
		Netherlands Antilles
		New Zealand
		Nicaragua
		Niger
		Nigeria
		North Korea
		Norway
		Oman
		Pakistan
		Palau
		Palestinian Territories
		Panama
		Papua New Guinea
		Paraguay
		Peru
		Philippines
		Poland
		Portugal
		Qatar
		Top of Page
		Romania
		Russia
		Rwanda
		Saint Kitts and Nevis
		Saint Lucia
		Saint Vincent and the Grenadines
		Samoa 
		San Marino
		Sao Tome and Principe
		Saudi Arabia
		Senegal
		Serbia
		Seychelles
		Sierra Leone
		Singapore
		Sint Maarten
		Slovakia
		Slovenia
		Solomon Islands
		Somalia
		South Africa
		South Korea
		South Sudan
		Spain 
		Sri Lanka
		Sudan
		Suriname
		Swaziland 
		Sweden
		Switzerland
		Syria
		Top of Page
		Taiwan
		Tajikistan
		Tanzania
		Thailand 
		Timor-Leste
		Togo
		Tonga
		Trinidad and Tobago
		Tunisia
		Turkey
		Turkmenistan
		Tuvalu
		Top of Page
		Uganda
		Ukraine
		United Arab Emirates
		United Kingdom
		United State of America
		Uruguay
		Uzbekistan
		Vanuatu
		Venezuela
		Vietnam
		Top of Page
		Yemen
		Top of Page
		Zambia
		Zimbabwe*/


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
