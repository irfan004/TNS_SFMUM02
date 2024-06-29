package com.irfan.assignment5;

public class TaxPay extends Person {

	
	String name;
	double salary;
	
	public TaxPay() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public TaxPay(String name,double salary) {
		super();
		this.name=name;
		this.salary=salary;
		
	}
	
	@Override
	void calTax() {
		// TODO Auto-generated method stub
		
		if(salary <= 50000) {
			tax = salary * 0.1;
		} else if(salary <= 100000) {
			tax = salary * 0.2;
		} else {
			tax = salary * 0.4;
		}	
	}
		
	}


