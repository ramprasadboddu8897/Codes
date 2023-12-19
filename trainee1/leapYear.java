/*Create a program that checks if a year is a leap year or not.*/
package com.phenom.trainee1;

import java.util.Scanner;

public class leapYear {
		public static void main(String[] args) {
			System.out.println("Enter Year :");
			Scanner value=new Scanner(System.in);
			int year=value.nextInt();
			
			boolean isLeapYear;
			
			isLeapYear=(year %4==0);
			
			isLeapYear=isLeapYear&&(year %100!=0 || year%400==0);
			
			if(isLeapYear) {
				System.out.println(year+" is a leap year.");
			}else {
				System.out.println(year+ " is not a leap year.");
			}

	}

}
