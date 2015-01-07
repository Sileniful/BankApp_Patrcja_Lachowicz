package model;


public class Cashier extends Employee {

	
	public Cashier(){

	}

	public Cashier(String name, String surname, Address address, int ID,
			String dateOfBirth, int payRoleID, int salary) {
		super(name, surname, address, ID, dateOfBirth, payRoleID, salary);
	}

	
}