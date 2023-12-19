/*Create a program that uses a loop to print the Fibonacci series up to a specified number of terms.*/
package com.phenom.trainee1;

import java.util.Scanner;

public class FibonacciSeriesWhileLoop {

	public static void main(String[] args) {
		System.out.println("Enter a Number: ");
		Scanner n=new Scanner(System.in);
		int number=n.nextInt();
		int first=0,second=1;
		if (number<=2) {
		System.out.print(first+" "+second+" ");
		}
		int i=2;
		while (i<number) {
			int next =first+second;
			System.out.print(next+" ");
			first=second;
			second=next;
			i++;
		}
		
	}
}
