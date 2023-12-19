//**Constructors:**
/*1. Write a Java class called "Person" with a parameterized constructor that takes a name and an age as arguments. Create an object of the class and display the name and age.*/
package com.phenom.trainee2;

public class Person {
	String name;
	int age;
	
	public Person(String Name,int Age){
		this.name=Name;
		this.age=Age;
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
	
	
	
	public static void main(String[] args) {
		Person person1=new Person("ravi",10);
	}

}
