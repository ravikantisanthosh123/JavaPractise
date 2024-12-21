package com.ranga.au;

public class SampleJavaProgram2 {
	
	public static void main(String args[]) {
		
		int num1, num2;
		String operation;
		float result = 0;
		
		
	/*Integer.parseInt: This is a method provided by the Integer class in Java, It converts a String to an int. If the String cannot be converted to a valid integer 
	 (e.g., it contains non-numeric characters), the program will throw a NumberFormatException, Integer.parseInt: This is a method provided by the Integer class in Java.
	 It converts a String to an int. If the String cannot be converted to a valid integer (e.g., it contains non-numeric characters), 
	 the program will throw a NumberFormatException.
	 Usage: The code takes the first two command-line arguments (which are String by default), converts them into integers, and assigns them to num1 and num2.*/
		
		num1=Integer.parseInt(args[0]);
		num2=Integer.parseInt(args[1]);
		operation = args[2];
		
		switch(operation) {
		case "+": {result = num1+num2; break;}
		case "-": {result = num1-num2; break;}
		case "*": {result = num1*num2; break;}
		case "/": {result = num1/num2; break;}
		default: System.out.println("Operation not found");
		}
		
		System.out.println("Result of the operation:" +result);
		

	}

}
