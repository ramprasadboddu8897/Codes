/*Create a program that converts Celsius to Fahrenheit and vice versa based on user input.*/
package com.phenom.trainee1;

import java.util.Scanner;

public class CelsiusFahrenheit_2b {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Choose an Option ");
		System.out.println("1. Convert fron Celcius to Fahrenheit");
		System.out.println("2. Convert From Fahrenheit to Celcius");
		int choice =scanner.nextInt();
		
		if (choice ==1) {
			System.out.println("Enter Temperature in Celsius: ");
			double celsius=scanner.nextDouble();
			double fahrenheit=(celsius*9/5)+32;
			System.out.println("Temperature in Fahrenheit: "+fahrenheit);
		}else{
			System.out.println("Enter Temperature in Fahrenheit: ");
			double fahrenheit=scanner.nextDouble();
			double celsius=(fahrenheit-32)*5/9;
			System.out.println("Temperature in Fahrenheit: "+celsius);
		}
	}

}
