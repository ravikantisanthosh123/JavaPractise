package com.ranga.au;

class Animal{
	public void sound() {
		System.out.println("This is a generic animal sound.");
	}
	
	class Cat extends Animal{
		@Override
		public void sound() {
			  System.out.println("The cat meows.");
		}
	}
}

public class RunTimePolymorphism {

	
	public static void main(String args[]) {
		
		 Animal myAnimal = new Cat(); // Up-Casting
		 myAnimal.sound();
		 
		
	}
	
}
