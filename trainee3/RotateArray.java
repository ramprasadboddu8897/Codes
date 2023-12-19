package com.phenom.trainee3;

public class FrequencyCounter {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 1, 5, 3, 4, 5, 2, 1, 100001, 1001,1001};

        // Assuming the array contains positive integers
        int maxElement = findMaxElement(array);

        // Initialize a frequency array with zeros
        int[] frequencyArray = new int[maxElement + 1];

        // Update the frequencies
        updateFrequencies(array, frequencyArray);

        // Display the frequencies
        displayFrequencies(frequencyArray);

        // Finding Most Frequent Element
        int maxFreqEle = maxFrequencyEle(array);
        System.out.println(maxFreqEle);
    }

    static int findMaxElement(int[] array) {
        int maxIndex = 0; // Assume the first element is the maximum

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i; // Update the maxIndex if a larger element is found
            }
        }
        return array[maxIndex]; // Return the maximum element itself, not its index
    }

    static int maxFrequencyEle(int[] array) {
        int maxFreqEle = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > maxFreqEle) {
                maxFreqEle = num;
            }
        }
        return maxFreqEle;
    }

    static void updateFrequencies(int[] array, int[] frequencyArray) {
        for (int value : array) {
            if (value < frequencyArray.length) {
                frequencyArray[value]++;
            } else {
                System.out.println("Ignoring out-of-bound value: " + value);
            }
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
