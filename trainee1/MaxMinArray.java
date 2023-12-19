/*Create a program to find the maximum and minimum elements in an array.*/
package com.phenom.trainee1;

public class MaxMinArray {
	public static void main(String[] args) {
		int[] numbers= {10,20,5,40,50};
		int max=numbers[0];
		int min=numbers[0];
		
		for(int number:numbers) {
			if(number>max) {
				max=number;
			}
			if(number<min) {
				min=number;
			}
		}
		System.out.println("Maxmium Element: "+max);
		System.out.println("Minium Element: "+min);
	}
}
