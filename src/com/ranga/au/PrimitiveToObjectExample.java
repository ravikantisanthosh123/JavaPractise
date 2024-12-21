package com.ranga.au;

public class PrimitiveToObjectExample {
	
	public static void main(String args[]) {
		int number=100;
		
		// 1. Autoboxing (Automatic conversion)
		Integer obj1=number;
		System.out.println("Using Autoboxing:"+obj1);
		
		//2. Explicit conversion using Integer.valueOf()
		Integer obj2=Integer.valueOf(number);
		System.out.println("Using interger.valueof "+obj2);
		
		System.out.println("\nAdding to an ArrayList:");
	    java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
	    list.add(number); // Autoboxing happens here
	    System.out.println("ArrayList: " + list);
		
	}
	

}
