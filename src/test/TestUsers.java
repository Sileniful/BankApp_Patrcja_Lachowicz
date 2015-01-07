package test;
import java.util.ArrayList;

import model.*;

public class TestUsers {


	public static void testEmployee() {
		Address newAddress = new Address("Wroclawska", "1","Zielona Gora");
		Admin newAdmin = new Admin("Jan1", "Kowalski1", newAddress, 1, "10.11.1852", 1, 1500);
		Cashier newCashier = new Cashier("Jan2", "Kowalski2", newAddress, 2, "110.11.1852", 2, 2500);
		Cleaner newCleaner = new Cleaner("Jan3", "Kowalski3", newAddress, 3, "10.121.1852", 3, 3500);
		Security newSecurity = new Security("Jan5", "Kowalski5", newAddress, 5, "10.141.1852", 5, 5500);
	
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(newAdmin);
		employeeList.add(newCashier);
		employeeList.add(newCleaner);
		employeeList.add(newSecurity);
		
		
		Branch newBranch = new Branch(new Address("Ulica","15","Zielona Gora"),employeeList);
		Manager newManager = new Manager("Stefan","Kowalski",new Address("Ulica","15","ZG"),5,"30.11.1994",5,12000,newBranch);
		for (int i=0;i<newManager.getBranch().getEmployeeList().size();i++)
		{
			System.out.println("Name: " + newManager.getBranch().getEmployeeList().get(i).getName());
			System.out.println("Surname:" + newManager.getBranch().getEmployeeList().get(i).getSurname());
			System.out.println("Salary: " + newManager.getBranch().getEmployeeList().get(i).getSalary());
			System.out.println("DOB:" + newManager.getBranch().getEmployeeList().get(i).getDateOfBirth());
			System.out.println("City" + newManager.getBranch().getEmployeeList().get(i).getAddress().getCity());
			System.out.println("=========================================");
			
			
		}
		
	}
	
	
	


	
 
}