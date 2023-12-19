package com.phenom.trainee3;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
//         int[] arr = {64, 25, 12, 22, 11};
    	int[] arr= {3,5,1,12,7,8,0};
        bubbleSort(arr);
//        binarySearch(arr,12);
        if (binarySearch(arr,12)!=-1) {
        	System.out.println(binarySearch(arr,12));
        }else {
        	System.out.println("index Not found");
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

//    static void bubbleSort(int[] arr) {
//        int n = arr.length;
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    // swap temp and arr[i]
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//    }
    static int binarySearch(int[] arr1,int target) {
    	int n=arr1.length;
    	int low=0;
    	int high=n-1;
    	while (low<=high) {
    		int mid=low+(high-low)/2;
    		//int mid =(low+high)/2;
    		if (arr1[mid]==target) {
    			return mid;
    		}
    		if(arr1[mid]<target) {
    			low=mid+1;
    		}
    		else{
    		high=mid-1;
    		}
    	}
    	return -1;
    }
    	
    static void bubbleSort(int[] arr) {
    	int n=arr.length;
    	for (int i=0;i<n-1;i++) {
    		for (int j=0;j<n-i-1;j++) {
    			if (arr[j]>arr[j+1]){
//    				swapping
    				int temp=arr[j];
    				arr[j]=arr[j+1];
    				arr[j+1]=temp;		
    			}
    		}
    	}
    }
}

