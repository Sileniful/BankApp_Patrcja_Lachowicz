package model;

import java.util.ArrayList;
import java.util.List;

public class Boss extends Manager {
	
	private List<Branch> branchList = new ArrayList<Branch>();
	
	public Boss(){
		
	}

	public Boss(String name, String surname, Address address, int ID,
			String dateOfBirth, int payRoleID, int salary, Branch branch,
			List<Branch> branchList) {
		super(name, surname, address, ID, dateOfBirth, payRoleID, salary,
				branch);
		this.branchList = branchList;
	}



	public List<Branch> getBranchList() {
		return branchList;
	}

	public void setBranchList(List<Branch> branchList) {
		this.branchList = branchList;
	}
	
}