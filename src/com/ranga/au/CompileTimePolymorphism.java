package com.ranga.au;

class Calculator{
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public double add(double a, double b) {
		return a+b;
	}
	
	
}

//cMethod Overloading (Compile-Time Polymorphism) --Polymorphism allows methods to perform different actions based on the object that calls them.

public class CompileTimePolymorphism {
	
	public static void main(String args[]) {
		
		Calculator calc= new Calculator();
		System.out.println("Addition of Integers: " +calc.add(2,3));
		System.out.println("Addition of doubles: " +calc.add(3.5, 4.5));		
		
	}

}
