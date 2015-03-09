package gafat.domain;

public class PackagePrice {
	
	private double price;
	
	private Packages packages;
	
	
	

	public PackagePrice() {
		
	}

	public PackagePrice(double price, Packages packages) {
		
		this.price = price;
		this.packages = packages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Packages getPackages() {
		return packages;
	}

	public void setPackages(Packages packages) {
		this.packages = packages;
	}
	
	
}
