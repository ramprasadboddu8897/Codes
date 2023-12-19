/*Implement a simple calculator that performs addition, subtraction, multiplication, and division based on user input.*/
package com.phenom.trainee1;

import java.util.Scanner;

public class SphereVolumeCalculator {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the radius of the Sphere: ");
		double radius=input.nextDouble();
		double volume=(4.0/3.0) *3.41*Math.pow(radius,3);
		
		System.out.println("The volume of the sphere with radius "+volume);
	}

}
