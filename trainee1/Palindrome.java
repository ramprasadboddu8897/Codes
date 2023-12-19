/*Write a program to check whether a string is palindrome or not. Palindrome is a string which reads the same forward and backward.*/
package com.phenom.trainee1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String to Check Palindrome or Not: ");
		String string1=sc.nextLine();
		sc.close();
		char ch;
		String string2="";
		for (int i=string1.length()-1;i>=0;i--) {
			ch=string1.charAt(i);
			string2+=ch;
		}
		if(string2.equals(string1)) {
			System.out.println("Entered String is a Palindrome");
		}else {
			System.out.println("Entered String is not a Palindrome");
		}
	}
}
