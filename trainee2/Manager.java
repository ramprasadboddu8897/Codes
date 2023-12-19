//**Inheritance, Method Overloading, and Method Overriding:**
//
//
//1. Create a class "Employee" with a method "calculateSalary" that calculates the salary of an employee. Create a subclass "Manager" that overrides the "calculateSalary" method to add a bonus to the manager's salary.

package com.phenom.trainee2;

public class Manager extends Employee {
	
	int bonus=3000;
	int salary=40000;
	
	public double calculateSalary(){
		return salary+bonus;
	}

	public static void main(String[] args) {
		Manager m1=new Manager();
		System.out.println("Salary including bonus: "+m1.calculateSalary());

	}

}
