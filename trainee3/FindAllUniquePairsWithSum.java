package com.phenom.trainee3;

import java.util.HashSet;
import java.util.Set;
import java.util.AbstractMap.SimpleEntry;

public class FindAllUniquePairsWithSum {

    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15, 3, 6, 8, 10};
        int targetSum = 18;

        findAllUniquePairsWithSum(array, targetSum);
    }

    static int findIndex(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1; // Return -1 if the value is not found (not expected in this context)
    }

    static void findAllUniquePairsWithSum(int[] array, int targetSum) {
        Set<SimpleEntry<Integer, Integer>> uniquePairs = new HashSet<>();
        Set<Integer> seenValues = new HashSet<>();

        for (int num : array) {
            int complement = targetSum - num;

            if (seenValues.contains(complement)) {
                uniquePairs.add(new SimpleEntry<>(num, complement));
            }

            seenValues.add(num);
        }

        // Display unique pairs
        System.out.println("Unique Pairs with sum " + targetSum + ":");
        for (SimpleEntry<Integer, Integer> pair : uniquePairs) {
//        	int index1 = findIndex(array, pair.getKey());
//          int index2 = findIndex(array, pair.getValue());
//        	System.out.println("(" + pair.getKey() + " at index " + index1 + ", " +
//                    pair.getValue() + " at index " + index2 + ")");
        	
            System.out.println("(" + pair.getKey() + ", " + pair.getValue() + ")");
        }
    }

//    static void findAllUniquePairsWithSum(int[] array, int targetSum) {
//        Map<Integer, Integer> uniquePairs = new HashMap<>();
//
//        for (int num : array) {
//            int complement = targetSum - num;
//
//            if (uniquePairs.containsKey(complement)) {
//                System.out.println("(" + num + ", " + complement + ")");
//            }
//
//            uniquePairs.put(num, complement);
//        }
//
//        // Note: If order matters, consider using a List<Map.Entry<Integer, Integer>> instead of a Map.
//    }
    
}



