package com.phenom.trainee2;

public class CircleInterface implements Drawable {

	
	public String draw() {
		return "Drawing a circle";
	}
	public static void main(String[] args) {
		CircleInterface c1=new CircleInterface();
		System.out.println(c1.draw());
	}
}
