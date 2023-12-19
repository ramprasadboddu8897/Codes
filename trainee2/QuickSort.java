package com.phenom.trainee2;

public class QuickSort {

    public static void main(String[] args) {
        // Example usage
        int[] array = {9, 7, 5, 11, 12, 2, 14, 3, 10, 6};
        
        System.out.println("Original array:");
        printArray(array);

        quickSort(array, 0, array.length - 1);

        System.out.println("\nSorted array:");
        printArray(array);
    }

    static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Find the partition index such that elements smaller than pivot are on the left
            int partitionIndex = partition(array, low, high);

            // Recursively sort the sub-arrays
            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
    }

    static int partition(int[] array, int low, int high) {
        // Choose the rightmost element as the pivot
        int pivot = array[high];

        // Index of smaller element
        int i = low - 1;

        // Traverse the array and rearrange elements such that elements smaller than pivot are on the left
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;

                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap array[i+1] and array[high] (put the pivot in its correct place)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
    

    static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    
    
}
