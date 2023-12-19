package com.phenom.trainee3;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] array = {3, 5, 2, 7, 5, 8, 2};
        int[] uniqueArray = removeDuplicates(array);
        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueArray));
    }

    static int[] removeDuplicates(int[] array) {
        Set<Integer> uniqueSet = new HashSet<>();
        for (int value : array) {
            uniqueSet.add(value);
        }

        int[] uniqueArray = new int[uniqueSet.size()];
        int index = 0;
        for (int value : uniqueSet) {
            uniqueArray[index++] = value;
        }

        return uniqueArray;
    }
}
