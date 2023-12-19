package com.phenom.trainee2;

import java.util.Scanner;

public class Circle extends Shape{

	int radius;

	@Override
	public double area() {
		return 3.14*(radius*radius);
	}
	Circle(int Radius){
		this.radius=Radius;
	}
	
	public static void main(String[] args) {
		System.out.print("Enter radius of Circle: ");
		Scanner sc=new Scanner(System.in);
		
		int enteredRadius=sc.nextInt();
		
		Circle c1=new Circle(enteredRadius);
		
		System.out.println("Area of Circle :"+c1.area());
	}
}
