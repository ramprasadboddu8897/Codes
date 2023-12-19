package com.phenom.trainee2;
import java.util.*;

public class MergeSort2 {
	public static void conquer(int arr[],int si,int mid,int ei) {
		int mergedArr[]=new int[ei-si+1];
		int idx1=si;
		int idx2=mid+1;
		
		int x=0;
		while(idx1<=mid && idx2<=ei) {
			if (arr[idx1]<=arr[idx2]) {
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
		for (int i=0,j=si;i<mergedArr.length;j++,i++) {
			arr[j]=mergedArr[i];
		}
	}
	
	public static void divide(int arr[],int si,int ei) {
		if (si>=ei) {
			return ;
		}
		int mid=si+(ei-si)/2;
		divide(arr,si,mid);
		divide(arr,mid+1,ei);
		conquer(arr,si,mid,ei);
		
	}

	public static void main(String[] args) {
		int[] arr= {4,4,5,56,43,12,23,9};
		int n=arr.length;
		divide(arr,0,n-1);
		System.out.println(Arrays.toString(arr));
	}

}
