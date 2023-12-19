package com.phenom.trainee3;

public class MissingNumber {
	public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 3, 7, 8};
        int missingNumber = findMissingNumber(array, 8);
        System.out.println("Missing number: " + missingNumber);
    }

    static int findMissingNumber(int[] array, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : array) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
