package gafat.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;



@Entity

public class Packages {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="PACKAGE_NAME")
	private String packageName;
	
	@OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name="PACKAGE_ID")  
    private List<ServiceTypes> serviceTypes;

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public List<ServiceTypes> getServiceTypes() {
		return serviceTypes;
	}

	public void setServiceTypes(List<ServiceTypes> serviceTypes) {
		this.serviceTypes = serviceTypes;
	}	

}
