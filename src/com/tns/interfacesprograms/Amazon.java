package com.tns.interfacesprograms;

public interface Amazon {
	void welcome();
	void thankyou();
	
	default void serviceCharges() {
		int amt= 100;
		System.out.println("service charges is"+amt);
		
	}
	
	
	static void aboutUs() {
		System.out.println("Its a ecommerce website");
	}

}
