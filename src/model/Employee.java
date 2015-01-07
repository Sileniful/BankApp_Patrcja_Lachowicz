package model;

public class Employee extends Person {
	
	
	private int payRoleID;
	private int salary;
	
	
	
	public Employee() {
		
	}



	public Employee(String name, String surname, Address address, int ID,
			String dateOfBirth, int payRoleID, int salary) {
		super(name, surname, address, ID, dateOfBirth);
		this.payRoleID = payRoleID;
		this.salary = salary;
	}



	public void setPayRoleID(int payRoleID) {
		this.payRoleID = payRoleID;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getPayRoleID(){
		return payRoleID;
	}
	
	public int getSalary(){
		return salary;
	}
	
	
}