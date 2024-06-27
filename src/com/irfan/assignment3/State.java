package com.irfan.assignment3;

public class State extends Country {
	
	protected String Governer;

	public State(String name, int Area, String Capital, int Population,String Governer) {
		super(name, Area, Capital, Population);
		this.Governer=Governer;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "State [Governer=" + Governer + ", Capital=" + Capital + ", Population=" + Population + ", Name=" + Name
				+ ", Area=" + Area + "]";
	}

	
	

}
