//**Constructors:**
/*2. Create a Java class "Car" with a default constructor and a parameterized constructor. The default constructor sets the car's model to "Unknown," and the parameterized constructor allows you to specify the model. Create an object and print the model of the car.*/
package com.phenom.trainee2;

import java.util.Scanner;

public class CarModel {
	String model;
	
	public CarModel() {
		System.out.println("Unknown Model");
	}
	
	public CarModel(String Model) {
		this.model = Model;
		System.out.println("Model: "+model);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Model: ");
		String modelName=sc.nextLine();
		
		CarModel model1=new CarModel();
		CarModel model2=new CarModel(modelName);
	}

}
