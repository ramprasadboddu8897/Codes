package com.phenom.trainee2;

public class Dog extends Animal {

	@Override
	public void sound() {
		System.out.println("Dog brak");
	}

	public static void main(String[] args) {
		Dog d1= new Dog();
		d1.sound();
	}
	
}
