package controler;

import java.util.ArrayList;

import daoDB.CustomerDAOInterface;
import daoDB.CustomerDBDAO;
import model.*;

public class BankManager {

	private CustomerDAOInterface customerDAO;
	
	public BankManager() {
		super();
		CustomerDAOInterface customerDAO = new CustomerDBDAO();
	}

	public ArrayList<Customer> getAllCustomers() {
		Customer newCustomer1 = new Customer("Tadeusz", "Kowalski", 1, 0, 0);
		Customer newCustomer2 = new Customer("Jan", "Kowalski", 2, 0, 0);
		Customer newCustomer3 = new Customer("Mateusz", "Kowalski", 3, 0, 0);
		Customer newCustomer4 = new Customer("Adam", "Kowalski", 4, 0, 0);
		Customer newCustomer5 = new Customer("Tadek", "Kowalski", 5, 0, 0);
	
		ArrayList<Customer> newCustomerList = new ArrayList<Customer>();
		newCustomerList.add(newCustomer1);
		newCustomerList.add(newCustomer2);
		newCustomerList.add(newCustomer3);
		newCustomerList.add(newCustomer4);
		newCustomerList.add(newCustomer5);
		
		return getAllCustomers();
	
	}
	
	public ArrayList<Employee> getAllEmployees() throws Exception {
		
		
		
		Address newEmployeeAddress = new Address("Wroclawska", "1","Zielona Gora");
		Admin newAdmin = new Admin("Jan1", "Kowalski1", newEmployeeAddress, 1, "10.11.1852", 1, 1500);
		Cashier newCashier = new Cashier("Jan2", "Kowalski2", newEmployeeAddress, 2, "110.11.1852", 2, 2500);
		Cleaner newCleaner = new Cleaner("Jan3", "Kowalski3", newEmployeeAddress, 3, "10.121.1852", 3, 3500);
		Security newSecurity = new Security("Jan5", "Kowalski5", newEmployeeAddress, 5, "10.141.1852", 5, 5500);

		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(newAdmin);
		employeeList.add(newCashier);
		employeeList.add(newCleaner);
		employeeList.add(newSecurity);
		
	return getAllEmployees();
	}
	
	
	
}
