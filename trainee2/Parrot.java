package com.phenom.trainee2;

public class Parrot extends Bird{
	
	public String sound() {
		return "Squak";
	}
	
	public static void main(String[] args) {
		Parrot p1=new Parrot();
		p1.sound();
		System.out.println(p1.sound());
	}
}
