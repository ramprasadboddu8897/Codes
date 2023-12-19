/*Write a program to find the sum and average of elements in an integer array.*/
package com.phenom.trainee1;

public class ArraySumAverage {
	public static void main(String[] args) {
		int numbers[]= {10,20,30,40,50};
		int a[]=new int[5];
		int sum=0;
		
		for (int number:numbers) {
			sum+=number;
		}
		double average =(double) sum/numbers.length;
		
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+average);
	}
}

