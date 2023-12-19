/*Create a program that generates a multiplication table for a given number using a do-while loop.*/
package com.phenom.trainee1;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=input.nextInt();
		
		int i=1;
		do {
			System.out.println(number+" x "+i+" = "+(number*i));
			i++;
		}while(i<=10);
	}
}
