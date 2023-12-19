/*Write a program to calculate the area of a rectangle using user input for length and width.*/
package com.phenom.trainee1;

import java.util.Scanner;

public class AreaOfRectangle_2a {

	public static void main(String[] args) {
		System.out.println("Enter length: ");
		Scanner enteredLn=new Scanner(System.in);
		int length=enteredLn.nextInt();
		
		System.out.println("Enter width: ");
		Scanner enteredWidth=new Scanner(System.in);
		int width=enteredWidth.nextInt();
		double area=length*width;
		System.out.println(area);
	}

}
