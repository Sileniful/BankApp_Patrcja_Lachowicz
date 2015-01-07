package model;

public class Person {
	
	private String name;
	private String surname;
	private Address address;
	private int ID;
	private String dateOfBirth;	

	
	public static void main(String name, String surname,Address address, int ID, String dateOfBirth){

		new Person(name, surname, address, ID, dateOfBirth);

	}
	
	public Person(){
		
	}
	
	public Person(String name, String surname, int iD) {
		super();
		this.name = name;
		this.surname = surname;
		ID = iD;
	}

	public Person(String name, String surname, Address address, int ID,
			String dateOfBirth) {
		this.name = name;
		this.surname = surname;
		this.address = address;
		this.ID = ID;
		this.dateOfBirth = dateOfBirth;
	}

	public String getName(){
		return name;
	}
	
	public String getSurname(){
		return surname;
	}
	
	public Address getAddress(){
		return address;
	}
	
	public int getID(){
		return ID;
	}
	
	public String getDateOfBirth(){
		return dateOfBirth;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
		
}