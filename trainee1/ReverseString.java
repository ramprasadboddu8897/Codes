/*Write a program to reverse a given string. Take string as input.*/
package com.phenom.trainee1;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String string1=sc.nextLine();
		sc.close();
		char ch;
		String string2="";
		for (int i=string1.length()-1;i>=0;i--) {
			ch=string1.charAt(i);
			string2+=ch;	
		}	
		System.out.println("ReversedString: "+string2);
	}
}