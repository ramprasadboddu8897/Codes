package com.phenom.trainee3;

//import java.util.*;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.List;

public class commonEle {
	// Finding Common Elements in Two Array
    public static List<Integer> findCommonEleArray(int[] arr1,int[] arr2){
        Set<Integer> set1=new HashSet<>();
        Set<Integer> CommonEleSet=new HashSet<>();
        
        for (int num: arr1){
            set1.add(num);
        }
        
        for (int num: arr2){
            if(set1.contains(num)){
                CommonEleSet.add(num);
            }
        }
        
        return new ArrayList<>(CommonEleSet);
    }

	public static void main(String[] args) {
		int [] arr1={1,4,3,5,5,5,6,7,8,912,210,1000};
        int [] arr2={2,43,43,5,5,56,1,3,4,210,1000};
        List<Integer> result=findCommonEleArray(arr1,arr2);
        System.out.println(result);

	}

}
