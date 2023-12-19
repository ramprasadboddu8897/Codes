/*Define a class "Circle" with attributes like radius and methods to calculate area and circumference.*/
package com.phenom.trainee1;

import java.util.Scanner;

public class Circle {
	double radius;
	
	public double area() {
		return (3.14*radius*radius);
	}
	
	public double circumference() {
		return (2*3.14*radius);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius: ");
		int value=sc.nextInt();
		sc.close();
		
		Circle c =new Circle();
		c.radius=value;
		System.out.println("The area of the circle :"+c.area());
		System.out.println("The Circumference of the circle: "+c.circumference());

	}

}
