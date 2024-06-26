package utilities;

import employee.Developer;
import employee.Manager;

public class AssignmentManin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager mg = new Manager();
		mg.setName("Alice");
        
        mg.setSalary(80000);
        mg.setMngrName("Alice Johnson");
        mg.setRating(5);
		
		EmployeeUtilities obj=new EmployeeUtilities();
		obj.getEmpinfo();
		 
	        System.out.println("Name: " + mg.getName());
	        System.out.println("Salary: " + mg.getSalary());
	        System.out.println("Manager Name: " + mg.getMngrName());
	        System.out.println("Rating: " + mg.getRating());
		
		
		
		

	}

}
