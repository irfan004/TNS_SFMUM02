package com.tnsif.exceptionhandeling;

public class WithoutException {
	public static void  main(String args[]) {
		int d =0;
		try{
			int a =42/d;
		}
		catch(ArithmeticException e){
			System.out.println("Excpetion Caught"+e.getMessage());
			
		}
		
		System.out.println("Will not be printed");
		
	}

}
