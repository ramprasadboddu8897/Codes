/*Write a Java program to find the largest of three numbers using if-else statements.*/
package com.phenom.trainee1;

import java.util.Scanner;

public class LargestNumber_3a {

	public static void main(String[] args) {
		System.out.println("Enter First Value: ");
		Scanner value1=new Scanner(System.in);
		int a=value1.nextInt();
		
		System.out.println("Enter Second Value: ");
		Scanner value2=new Scanner(System.in);
		int b=value2.nextInt();
		
		System.out.println("Enter Third Value: ");
		Scanner value3=new Scanner(System.in);
		int c=value3.nextInt();
		int result;
		if (a>b && a>c) {
			result=a;
		}else if(b>c && b>a) {
			result=b;
		}else {
			result=c;
		}
		System.out.println("Largest Number among the Three: "+result);

	}

}
