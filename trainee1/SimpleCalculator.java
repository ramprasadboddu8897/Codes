/*Implement a simple calculator that performs addition, subtraction, multiplication, and division based on user input.*/
package com.phenom.trainee1;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		Double num1=input.nextDouble();

		System.out.print("Enter an Operator(+,-,*,/): ");
		char operator=input.next().charAt(0);
		
		System.out.print("Enter the second number: ");
		double num2=input.nextDouble();
		
		double result=0;
		
		switch (operator) {
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			if(num1/num2<=0) {
				System.out.println("Cannot divide by zero.");
			}
			result=num1/num2;
			break;
		default:
			System.out.println("invalid operator");
		}
		System.out.println("Result: "+result);
	}

}
