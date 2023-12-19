package com.phenom.trainee3;

public class MaxElementInArray {
	public static void main(String[] args) {
        int[] array = {5, 10, 2, 8, 7};
        int maxElement = findMaxElement(array);
        System.out.println("Maximum element: " + maxElement);
    }

    static int findMaxElement(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}
