package com.phenom.trainee2;

public class TriangleInterface implements Drawable {
	public String draw() {
		return "Drawing a Triangle";
	}
	public static void main(String[] args) {
		TriangleInterface triangle1=new TriangleInterface();
		System.out.println(triangle1.draw());
	}
}
