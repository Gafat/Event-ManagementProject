package gafat.domain;

import java.io.Serializable;
import java.util.Date;
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
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class ServiceTypes {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@NotNull
	@NotEmpty
	@Column(name="SERVICE_NAME")
	String serviceName;
	@NotNull
	@NotEmpty
	String description;
	@Column(name="PACKAGE_TYPE")
	String packageType;
	@Column(name="PRICE_TYPE")
	String priceType;
	
	@OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name="SERVICE_TYPE_ID")  
    private List<PackageServicePrice> packageServicePrice;

	public ServiceTypes() {

	}

	

	public ServiceTypes(String serviceName, String description, String packageType,
			String priceType) {
		
		this.serviceName = serviceName;
		this.description = description;
		this.packageType = packageType;
		this.priceType = priceType;
	}



	public String getPriceType() {
		return priceType;
	}

	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}

	

	public String getServiceName() {
		return serviceName;
	}



	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}



	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPackageType() {
		return packageType;
	}

	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}



	public List<PackageServicePrice> getPackageServicePrice() {
		return packageServicePrice;
	}



	public void setPackageServicePrice(List<PackageServicePrice> packageServicePrice) {
		this.packageServicePrice = packageServicePrice;
	}
	
	

}
