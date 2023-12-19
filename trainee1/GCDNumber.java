/*Implement a method to find the GCD (Greatest Common Divisor) of two numbers*/
package com.phenom.trainee1;

import java.util.Scanner;
public class GCDNumber {

		public static int findGCD(int a,int b) {
			if(b==0) {
				return a;
			}
			return findGCD(b,a%b);
		}

		public static void main(String[] args) {
			System.out.println("Enter the two Numbers space Sperated: ");
			Scanner n=new Scanner(System.in);
			int a=n.nextInt();
			int b=n.nextInt();
			
			int gcd=findGCD(a,b);
			System.out.println("GCD of "+a+" and "+b+" is "+gcd);
		}
}
