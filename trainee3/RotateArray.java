package com.phenom.trainee3;

import java.util.Arrays;

public class RotateArray {
	public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int steps = 2;
        rotateArray(array, steps);
        System.out.println("Rotated array: " + Arrays.toString(array));
    }

    static void rotateArray(int[] array, int steps) {
        int n = array.length;
        steps = steps % n;
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i + steps) % n] = array[i];
        }

        System.arraycopy(temp, 0, array, 0, n);
    }
}
