package com.phenom.trainee2;

import java.util.Scanner;

public class Rectangle extends Shape{
	int length;
	int breadth;
	
	@Override
	public double area() {
		return 2*(this.length+this.breadth);
		
	}
	
	Rectangle(int len,int Breadth){
		this.length=len;
		this.breadth=Breadth;
	}
	
	public static void main(String[] args) {
		System.out.print("Enter length and breadth: ");
		Scanner sc=new Scanner(System.in);
		int enteredLength=sc.nextInt();
		int enteredBreadth=sc.nextInt();
		
		Rectangle R1=new Rectangle(enteredLength,enteredBreadth);
		System.out.println("Area of Rectangle :"+R1.area());
	}
}
