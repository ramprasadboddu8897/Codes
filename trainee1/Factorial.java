/*Define a method to calculate the factorial of a number and use it in a program.*/
package com.phenom.trainee1;

import java.util.Scanner;

public class Factorial {
	public static long calculateFactorial(int n) {
		if(n<=0) {
			return n;
		}
		long factorial=1;
		for(int i=1;i<=n;i++) {
			factorial*=i;
		}
		return factorial;
	}

	public static void main(String[] args) {
		System.out.println("Enter a Number: ");
		Scanner n=new Scanner(System.in);
		int number=n.nextInt();
		long factorial=calculateFactorial(number);
		
		System.out.println("Factorial of "+number+" is "+factorial);
	}

}
