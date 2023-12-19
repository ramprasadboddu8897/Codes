package com.phenom.trainee2;

public class Cat extends Animal{
	
	@Override
	public void sound() {
		System.out.println("Cat meow");
	}

	public static void main(String[] args) {
		Cat c1=new Cat();
		c1.sound();
	}

}
