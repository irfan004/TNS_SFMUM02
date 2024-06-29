package com.irfan.assignment5;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         TaxPay tp = new TaxPay();
         
         System.out.println("Enter your name: ");
         tp.name=sc.nextLine();
         System.out.println("Enter your Salary : ");
         tp.salary=sc.nextDouble();
         tp.calTax();
         tp.show();
         
         
         
	}

}
