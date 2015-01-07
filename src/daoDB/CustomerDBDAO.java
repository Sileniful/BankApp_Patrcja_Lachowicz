package daoDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.List;

import model.Customer;

public class CustomerDBDAO implements CustomerDAOInterface {

	private Connection connect = null;
	  private Statement statement = null;
	  private PreparedStatement preparedStatement = null;
	  private ResultSet resultSet = null;

	  public void readDataBase() throws Exception {
	    try {
	    	 Class.forName("com.mysql.jdbc.Driver");
	         // setup the connection with the DB.
	         connect = DriverManager
	             .getConnection("jdbc:mysql://localhost/Person?"
	                 + "user=customer&password=customerpw");
	    
	     statement = connect.createStatement();
	   
	      resultSet = statement
	          .executeQuery("select * from Person.Customer");
	      writeResultSet(resultSet);

	     
	      preparedStatement = connect
	          .prepareStatement("insert into  Person.Customer values (default, ?, ?, ?, ? , ?, ?)");
	     
	      preparedStatement.setString(1, "TestName");
	      preparedStatement.setString(2, "TestSurname");
	      preparedStatement.setString(3, "TestAddress");
	      preparedStatement.setDate(4, new java.sql.Date(2009, 12, 11));
	      preparedStatement.setString(5, "TestPayRoleID");
	      preparedStatement.setString(6, "TestSalary");
	      preparedStatement.executeUpdate();

	      preparedStatement = connect
	          .prepareStatement("SELECT name, surname, address, dateOfBirth, Customer from Person.Customer");
	      resultSet = preparedStatement.executeQuery();
	      writeResultSet(resultSet);

	      // remove again the insert comment
	      preparedStatement = connect
	      .prepareStatement("delete from Person.Customer where myuser= ? ; ");
	      preparedStatement.setString(1, "Test");
	      preparedStatement.executeUpdate();
	      
	      resultSet = statement
	      .executeQuery("select * from Person.Customer");
	      writeMetaData(resultSet);
	    
	  } 
	  catch (Exception e) {
	      throw e;
	    } finally {
	      close();
	    }
	    }


	    private void writeMetaData(ResultSet resultSet) throws SQLException {
	        
	        System.out.println("The columns in the table are: ");
	        System.out.println("Table: " + resultSet.getMetaData().getTableName(1));
	        for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++){
	          System.out.println("Column " +i  + " "+ resultSet.getMetaData().getColumnName(i));
	        }
	      }

	      private void writeResultSet(ResultSet resultSet) throws SQLException {
	       
	        while (resultSet.next()) {
	         
	          String user = resultSet.getString("myuser");
	          String website = resultSet.getString("webpage");
	          String summary = resultSet.getString("summary");
	          Date date = resultSet.getDate("datum");
	          String comment = resultSet.getString("comments");
	          System.out.println("User: " + user);
	          System.out.println("Website: " + website);
	          System.out.println("Summary: " + summary);
	          System.out.println("Date: " + date);
	          System.out.println("Comment: " + comment);
	        }
	      }

	      
	      private void close() {
	        close(resultSet);
	        close(statement);
	        close(connect);
	      }
	      
	      private void close(AutoCloseable c) {
	        try {
	          if (c != null) {
	            c.close();
	          }
	        } catch (Exception e) {
	        // don't throw now as it might leave following closables in undefined state
	        }
	
	      }


		@Override
		public boolean create(Customer customer) {
			// TODO Auto-generated method stub
			return false;
		}


		@Override
		public boolean delete(Customer customer) {
			// TODO Auto-generated method stub
			return false;
		}


		@Override
		public Customer getCustomerWithID(int customerID) {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public List<Customer> getAllCustomers() throws Exception {
			// TODO Auto-generated method stub
			return null;
		}
	      
}
