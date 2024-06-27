package com.tns.interfacesprograms;

public class Demo {
public static void main(String[] args) {
	
	Amazon.aboutUs();
//	Amazon ob=new PrimeAccount();
//	
//	ob.welcome();
//	ob.thankyou();
	Amazon obtwo=new NonPrimeAccount();
	obtwo.welcome();
	obtwo.serviceCharges();
	obtwo.thankyou();
}
}
