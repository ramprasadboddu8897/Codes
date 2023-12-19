package com.phenom.trainee2;

import java.util.Arrays;

public class FrequencyCounter {

	    public static void main(String[] args) {
	        int[] array = {1, 2, 3, 2, 4, 1, 5, 3, 4, 5, 2, 1};

	        // Assuming the array contains positive integers
	        int maxElement = findMaxElement(array);

	        // Initialize a frequency array with zeros
	        int[] frequencyArray = new int[maxElement + 1];
	        
	        //System.out.println(Arrays.toString(frequencyArray));

	        // Update the frequencies
	        updateFrequencies(array, frequencyArray);

	        // Display the frequencies
	        displayFrequencies(frequencyArray);
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

	    static void updateFrequencies(int[] array, int[] frequencyArray) {
	        for (int value : array) {
	            frequencyArray[value]++;
	        }
	    }

	    static void displayFrequencies(int[] frequencyArray) {
	        System.out.println("Frequency of each number:");
	        for (int i = 0; i < frequencyArray.length; i++) {
	            if (frequencyArray[i] > 0) {
	                System.out.println(i + ": " + frequencyArray[i] + " times");
	            }
	        }
	    }
	}
