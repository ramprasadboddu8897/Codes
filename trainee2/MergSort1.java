package com.phenom.trainee2;

import java.util.*;
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.Set;

public class MergSort1 {
	public static void conquer(int arr[],int si,int mid,int ei) {
		int mergedArr[]=new int[ei-si+1];
//		int mergedArr[]=new int[arr.length];
		
		int idx1=si;
		int idx2=mid+1;
		
		int x=0;
		
		while(idx1<=mid && idx2<=ei) {
			if(arr[idx1]<=arr[idx2]) {
				mergedArr[x++]=arr[idx1++];
			}
			else {
				mergedArr[x++]=arr[idx2++];
			}
		}
		while(idx1<=mid) {
			mergedArr[x++]=arr[idx1++];
		}
		while(idx2<=ei) {
			mergedArr[x++]=arr[idx2++];
		}
		for (int i=0,j=si;i<mergedArr.length;i++,j++) {
			arr[j]=mergedArr[i];
		}
		
	}

	public static void divide(int arr[],int si,int ei) {
		if (si>=ei) {
			return;
		}
		int mid=si+(ei-si)/2;
		divide(arr,si,mid);
		divide(arr,mid+1,ei);
		conquer(arr,si,mid,ei);
//		Set<String> uniqueNames = new HashSet<>();
//		uniqueNames.add("Alice");
//		uniqueNames.add("Bob");
//		uniqueNames.add("Charlie");
//		for (String name : uniqueNames) {
//		    System.out.println(name);
//		}
		
	}
	
	public static void main(String[] args) {
		int[] arr= {3,54,44,54,664,675,77,12};
		
//		int[] arr=new int[4];
//		Scanner sc =new Scanner(System.in);
//		for (int i=0;i<arr.length;i++) {
//			arr[i]=sc.nextInt();
//		}
		
		System.out.println(Arrays.toString(arr));
		int n=arr.length;
		divide(arr,0,n-1);
		System.out.println(Arrays.toString(arr));
	}
}