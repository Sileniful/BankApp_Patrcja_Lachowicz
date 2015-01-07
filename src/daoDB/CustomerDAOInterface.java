package daoDB;

import java.util.List;

import model.Customer;

public interface CustomerDAOInterface 
{
	public boolean create(Customer customer);
	public boolean delete(Customer customer);
	public Customer getCustomerWithID(int customerID);
	public List<Customer> getAllCustomers() throws Exception;

}