package gafat.domain;

import java.io.Serializable;
import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class Packages {

	@NotNull
	@NotEmpty
	String serviceName;
	@NotNull
	@NotEmpty
	String description;
	String packageType;
	String priceType;

	public Packages() {

	}

	

	public Packages(String serviceName, String description, String packageType,
			String priceType) {
		super();
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

}
