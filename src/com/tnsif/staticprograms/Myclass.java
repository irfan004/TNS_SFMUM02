package com.tnsif.staticprograms;

public class Myclass {
	
	private int section ; // instance var
	private static int srNo; // static variable
	static {// static block
		System.out.println("----Static Block");
		srNo=1000;
		
	}
	Myclass(){// Default constructor
		
		System.out.println("-----default constructor-----");
		srNo++;
		section++;
	}
	static void display() {// static method
		
		System.out.println("-----static method-----");
		System.out.println("serial no is :"+ srNo);
		
	}
	@Override
	public String toString() {
		return "Myclass [section=" + section + "]";
	}
	

	
}
