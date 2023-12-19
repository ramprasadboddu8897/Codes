/*Create a function that checks if a number is even or odd.*/
package com.phenom.trainee1;

import java.util.Scanner;

public class EvenOdd {
	public static boolean isEven(int num) {
		return num%2==0;
	}

	public static void main(String[] args) {
		System.out.println("Enter a Number: ");
		Scanner n=new Scanner(System.in);
		int number=n.nextInt();
		
		if(isEven(number)) {
			System.out.println(number+" is even.");
		}else {
			System.out.println(number+" is odd.");
		}
	}

}
