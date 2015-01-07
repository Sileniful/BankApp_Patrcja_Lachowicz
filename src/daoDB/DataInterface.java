package daoDB;
import java.util.List;
import model.Employee;


public interface DataInterface {

	
	
	public interface CustomerDaoInterface{
		public List< Employee > getEmployees()  throws Exception;
	}
	
}
