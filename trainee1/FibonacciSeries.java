/*Write a Java program to print the Fibonacci series up to a specified number of terms using a for loop.*/
package com.phenom.trainee1;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println("Enter a Number: ");
		Scanner n=new Scanner(System.in);
		int num=n.nextInt();
		int first=0,second=1;
		
		for (int i=1;i<=num;i++) {
			System.out.print(first+" ");
			int next=first+second;
			first=second;
			second=next;
		}
	}
}
