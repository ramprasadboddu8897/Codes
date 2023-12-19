package com.phenom.trainee3;

public class nthLargestEle {
	public static int findThirdLargestEle(int[] arr){
        if (arr==null || arr.length<3){
            System.out.println("Array size is Less");
            return -1;
        }
        int ThirdEle=Integer.MIN_VALUE;
        int SecondEle=Integer.MIN_VALUE;
        int FirstEle=Integer.MIN_VALUE;
        
        for (int num: arr){
            if (num>FirstEle){
                ThirdEle=SecondEle;
                SecondEle=FirstEle;
                FirstEle=num;
            }
            else if (num>SecondEle){
                ThirdEle=SecondEle;
                SecondEle=num;
            }
            else if(num>ThirdEle){
                ThirdEle=num;
            }
        }
        return ThirdEle;
    }
	
	public static void main(String[] args) {
		int [] arr1={1,4,3,5,5,5,6,7,8,912,210,1000};
		int result=findThirdLargestEle(arr1);
        if (result!=-1){
            System.out.println("Third Largest Element: "+ result);
        }
        //System.out.println(result);
	}

}
