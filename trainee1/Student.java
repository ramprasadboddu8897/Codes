/*Design a class called "Student" with attributes like name and roll number, and create instances of this class.*/
package com.phenom.trainee1;

public class Student {
	int Roll_Number;
	String Name;

	public static void main(String[] args) {
		Student obj = new Student();
		obj.Name = "Ramprasad";
		obj.Roll_Number = 25;
		
		System.out.println("Name of the student: " + obj.Name);
		System.out.println("Roll number of the student: " + obj.Roll_Number);

	}

}
