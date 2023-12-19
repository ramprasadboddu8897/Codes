//**Inheritance, Method Overloading, and Method Overriding:**

//2. Define a class "Calculator" with a method "add" that accepts two integers and returns their sum. Overload this method to handle different data types such as double and float

package com.phenom.trainee2;

public class Calculator {
	public int add(int a,int b) {
		return a+b;
	}
	
	public double add(double a,double b) {
		return a+b;
	}
	
	public float add(float a,float b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		Calculator c1=new Calculator();
		
		System.out.println("Sum of Integers :"+c1.add(4, 6));
		System.out.println("Sum of Doubles :"+c1.add(4.5, 6.5));
		System.out.println("Sum of Floats :"+c1.add(4.0005, 6.0005));
	}

}
