package com.irfan.assignment2;

import java.util.Scanner;

public class Commission {
	
	Scanner sc = new Scanner(System.in);
	private String name;
	private String Address;
	private int Phone;
	private double Sales_amount,commission;
	
	
	
	public void getDetails() {
		System.out.println("Enter your name: ");
		this.name=sc.nextLine();
		System.out.println("Enter your address: ");
		this.Address=sc.nextLine();
		System.out.println("Enter your Phone: ");
		this.Phone=sc.nextInt();
		System.out.println("Enter Sales Amt: ");
		this.Sales_amount=sc.nextDouble();
		
		
		
	}
	
	
	public void calc() {
		if (Sales_amount >= 100000) {
			commission = Sales_amount * 10/100;
		} else if (Sales_amount >= 50000) {
			commission = Sales_amount * 5/100;
		} else if (Sales_amount >= 30000) {
			commission = Sales_amount * 3/100;
		} else {
			System.out.println("No Commission");
		}


	}
	
	
	public void display() {
		System.out.println("Employee Name: "+ name);
		System.out.println("Employee Location: "+ Address);
		System.out.println("Employee PhoneNo: "+ Phone);
		System.out.println("Employee Sales: "+ Sales_amount);
		System.out.println("Employee Commission: "+ commission);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Commission c =new Commission();
		c.getDetails();
		c.calc();
		c.display();
		
	}
}

