package com.ranga.au;

public class SampleJavaProgram3 {
	
	public static void main(String args[]) {
		
		Integer number1, number2;
		String operation;
		Float result = null;
		
		number1=Integer.parseInt(args[0]);
		number2=Integer.parseInt(args[1]);
		operation= args[2];
		
		/* In Java, the conversion of Integer to int involves moving from a wrapper class (Integer) to its corresponding primitive type (int).
		 * Key Concepts
			Primitive Type (int): A basic data type that directly holds the value. Example: int x = 5;
			Wrapper Class (Integer): A class in the Java java.lang package that wraps a primitive value in an object.
			Example: Integer obj = Integer.valueOf(5);
		 * Why Convert? int is lightweight and used for performance-critical operations, Integer allows null values and is used when objects are needed 
		 * (e.g., in collections like ArrayList<Integer>)
		 * 
		 * 
		 * ****Object to Primitive type*******
		 * Integer -> int : intValue
		 * Float -> float: floatValue
		 * Double -> double: doubleValue
		 * 
		 * ****Primitive type to Object type*******
		 * int -> Integer : Integer.valueof
		 * 	float-> Float : Float.valueof
		 */
	}

}
