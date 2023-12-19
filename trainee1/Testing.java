package com.phenom.trainee1;

public class Testing {
	public static double k=1.5;
	public static int y=15;
	public static String x="Ram";
	
	public Testing(String x,int y,double k) {
		this.x=x;
		this.y=y;
		this.k=k;
	}
	public static double display() {
		double k=4.5;
		System.out.println(k);
		System.out.println(Testing.k);
		System.out.println("Display");
		return y;
	}
	public void show() {
		System.out.println(Testing.display());
		System.out.println("Show");
	}
	public void run() {
		System.out.println("non-Static Method calling");
	}
	public static void main(String[] args) {
		System.out.println("Main Starts");
		display();
		Testing m1=new Testing("Vikas",22,4.8);
		System.out.println(display());
//		m1.show();
//		m1.run();
		System.out.println("Main Ends");
	}
}
