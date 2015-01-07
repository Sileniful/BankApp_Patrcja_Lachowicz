package view;

import test.*;


public class Startup {
	
	public static void main(String[] args){

		new Startup(args);

	}
	
	public Startup(){
		
	}
	
	public Startup(String[] args){
		TestUsers.testEmployee();
			
	}
	
	

}