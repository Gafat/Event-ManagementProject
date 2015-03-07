package gafat.domain;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Packages {
	
	@NotNull
	private String name;
	@NotNull
	private String description;
	private String packageType;
	private String priceType;
	
	
	
	
	public Packages() {
		
	}
	
	
	public Packages(String name, String description, String packageType,
			String priceType) {
		this.name = name;
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


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
