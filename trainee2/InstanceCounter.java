//**Static and Final:**
//Create a class "Counter" with a static variable "count" that keeps track of the number of instances created. Write a constructor to increment the count when an object is created. Display the total count of objects created.

package com.phenom.trainee2;

public class InstanceCounter {
	static int count=0;
	
	InstanceCounter(){
		count+=1;
	}

	public static void main(String[] args) {
		
		InstanceCounter c1=new InstanceCounter();
		InstanceCounter c2=new InstanceCounter();
		InstanceCounter c3=new InstanceCounter();
		System.out.println(c3.count);
	}
}


