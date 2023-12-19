package com.phenom.trainee3;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesFromArray {
	public static void main(String[] args) {
        int[] array = {3, 5, 2, 7, 5, 8, 2};
        int[] uniqueArray = removeDuplicates(array);
        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueArray));
    }

    static int[] removeDuplicates(int[] array) {
        List<Integer> uniqueList = new ArrayList<>();
        for (int value : array) {
            if (!uniqueList.contains(value)) {
                uniqueList.add(value);
            }
        }
        return uniqueList.stream().mapToInt(Integer::intValue).toArray();
    }
}
