package com.irfan.assignment3;

public class Country extends Continent {
	protected String Capital;
	protected int Population;
	
	public Country(String name, int Area,String Capital,int Population) {
		super(name, Area);
		// TODO Auto-generated constructor stub
		
		this.Capital=Capital;
		this.Population=Population;
	}

	@Override
	public String toString() {
		return "Country [Capital=" + Capital + ", Population=" + Population + "]";
	}
	
	
	

}
