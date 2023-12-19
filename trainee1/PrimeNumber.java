/*Implement a program to check if a number is prime or not using a while loop.*/
package com.phenom.trainee1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number to check Prime or Not: ");
		int number = input.nextInt();
		
//		boolean isPrime=true;
//		
//		if(number<=1) {
//			isPrime=false;
//		}else {
//			int i=2;
//			while(i*i<=number) {
//				if(number%i==0) {
//					isPrime=false;
//					break;
//				}
//				i++;
//			}
//		}
		int i=2,count=0;
		while(i<number-1) {
			if(number%i==0) {
				count++;
				break;
			}
			i++;
		}
		
		if(count==0) {
			System.out.println(number+" is a prime number.");
		}else {
			System.out.println(number+" is not a prime number");
		}
	}
}
