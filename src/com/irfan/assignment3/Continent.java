package com.irfan.assignment3;

public class Continent {

	protected String Name;
	protected int Area;
	
	
	public Continent(String name,int Area) {
		this.Name=Name;
		this.Area=Area;
		
		
	}


	@Override
	public String toString() {
		return "Continent [Name=" + Name + ", Area=" + Area + "]";
	}
	
	
}
