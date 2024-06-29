package com.irfan.assignment5;

public  abstract class  Person {
	
	abstract void calTax();
		
	protected double tax;
	
	void show() {
		System.out.println("the tax for this perso is "+tax);
		
	}
	
	

}
