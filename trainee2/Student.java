//**Constructors:**
/*3. Define a class "Student" with a no-argument constructor and a parameterized constructor that takes a student's name and roll number. Initialize these values in the constructors. Create two student objects, one using the no-argument constructor and another using the parameterized constructor.*/
package com.phenom.trainee2;

import java.util.Scanner;

public class Student {
	String name;
	int rollNumber;
	
	public Student() {
		System.out.println("Student Name: "+name);
		System.out.println("Student RollNumber: "+rollNumber);
	}
	
	public Student(String studentName,int studentRollNo) {
		this.name =studentName ;
		this.rollNumber=studentRollNo;
		System.out.println("Student Name: "+name);
		System.out.println("Student RollNumber: "+rollNumber);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name: ");
		String studentName=sc.nextLine();
		System.out.println("Enter RollNumber: ");
		int studentRollNo=sc.nextInt();
		sc.close();
				
		Student student1=new Student();
		Student student2=new Student(studentName,studentRollNo);
	}

}
