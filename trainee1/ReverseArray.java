/*Implement a program to reverse an array of integers without using additional storage.*/
package com.phenom.trainee1;

public class ReverseArray {

	public static void main(String[] args) {
		int[] numbers= {10,20,30,40,50};
		 for (int i=0;i<numbers.length-1;i++) {
			 int temp=numbers[i];
			 numbers[i]=numbers[numbers.length-1-i];
			 numbers[numbers.length-1-i]=temp;
		 }
		 System.out.println("Reversed Array: ");
		 for(int number:numbers) {
			 System.out.print(number+" ");
		 }
	}

}
