package com.irfan.assignment8;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
            // Outer try block
            int[] numbers = {1, 2, 3};
            System.out.println("Array element at index 5: " + numbers[5]); // This will throw ArrayIndexOutOfBoundsException

            try {
                // Inner try block
                int result = numbers[1] / 0; // This will throw ArithmeticException
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException caught inside inner try block: " + e.getMessage());
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught in outer try block: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
		
		
	}

}
