package model;

import java.util.ArrayList;

public class CustomerList extends Customer {

	private ArrayList<Customer> customerList = new ArrayList<Customer>();

	public CustomerList(ArrayList<Customer> customerList) {
		super();
		this.customerList = customerList;
	}

	public ArrayList<Customer> getNewCustomerList() {
		return customerList;
	}

	public void setNewCustomerList(ArrayList<Customer> customerList) {
		this.customerList = customerList;
	}
	
	
}
