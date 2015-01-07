package model;

public class Manager extends Employee {

	private Branch branch;
	
	public Manager() {
	
	}

	public Manager(String name, String surname, Address address, int ID,
			String dateOfBirth, int payRoleID, int salary, Branch branch) {
		super(name, surname, address, ID, dateOfBirth, payRoleID, salary);
		this.branch = branch;
	}
	
	

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	
	
	
}