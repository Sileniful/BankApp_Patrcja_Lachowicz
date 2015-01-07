package model;

public class Address {
	
	String street;
	String homeNumber;
	String city;
	
	public Address(String street, String homeNumber, String city) {
		super();
		this.street = street;
		this.homeNumber = homeNumber;
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getHomeNumber() {
		return homeNumber;
	}

	public void setHomeNumber(String homeNumber) {
		this.homeNumber = homeNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	

}
