package daoDB;

import java.util.ArrayList;

import daoDB.DataInterface;
import model.Address;
import model.Admin;
import model.Cashier;
import model.Cleaner;
import model.Employee;
import model.Security;

public class Data implements DataInterface {

	public Data() throws Exception {
		try{
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
		throw new Exception("Error Code: 404");
		}
		
		catch(Exception exception){
			System.out.printf("Error caught in fDAO: " + exception.toString());
			exception.printStackTrace();
			throw new Exception("");
		}
		
	}
	
}
