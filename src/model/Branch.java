package model;

import java.util.ArrayList;

public class Branch {

	private Address address;
	private ArrayList<Employee> employeeList = new ArrayList<Employee>();
	private Manager manager;
	
	public Branch(Address address, ArrayList<Employee> employeeList,
			Manager manager) {
		super();
		this.address = address;
		this.employeeList = employeeList;
		this.manager = manager;
	}
	
	public Branch(Address address, ArrayList<Employee> employeeList) {
		super();
		this.address = address;
		this.employeeList = employeeList;
		this.manager = null;
	}



	public Address getAddress() {
		return address;
	}
	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public ArrayList<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(ArrayList<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	
	
}