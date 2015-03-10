package gafat.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class ServiceProviders {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="COMPANY_NAME")
	private String companyName;
	@Column(name="SERVICE_TYPE")
	private String serviceType;
	@Column(name="SERVICE_DESCRIPTION")
	private String serviceDescription;
	private String street;
	private String city;
	private String zipCode;
	private String state;
	private String note;
	
	@OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name="SERVICE_PROVIDER_ID")  
    private List<PackageServicePrice> packageServicePrice;
	
	
	
	public ServiceProviders() {
		
	}
	
	
	public ServiceProviders(String companyName, String serviceType,
			String serviceDescription, String street, String city,
			String zipCode, String state, String note) {
		
		this.companyName = companyName;
		this.serviceType = serviceType;
		this.serviceDescription = serviceDescription;
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
		this.state = state;
		this.note = note;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public String getServiceDescription() {
		return serviceDescription;
	}
	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}


	public List<PackageServicePrice> getPackageServicePrice() {
		return packageServicePrice;
	}


	public void setPackageServicePrice(List<PackageServicePrice> packageServicePrice) {
		this.packageServicePrice = packageServicePrice;
	}
	
	
	

}
