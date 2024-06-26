package utilities;


import employee.*;

public class EmployeeUtilities {
	
public void getEmpinfo() {
		
		Employees obj = new Employees();
		
		obj.setName("Irfan");
		obj.setSalary(85000);
		
		System.out.println("Employee Name: " + obj.getName());
		System.out.println("Employee Salary: " + obj.getSalary());
	}
	

}
