package com.phenom.trainee1;

import java.util.Scanner;

public class BankAccount {
	int balance;
	
	public BankAccount() {
		balance+=5000;
	}
	
	public void deposite(int amount){
		balance+=amount;
		System.out.println("Current Balance Amount: "+balance);
	}
	public void withdraw(int amount) {
		balance-=amount;
		System.out.println("Current Balance Amount: "+balance);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to SBI Bank initial Amount 5000");
		System.out.println("To Deposite Enter 1: ");
		System.out.println("To withdraw Enter2: ");
		
		int value=sc.nextInt();
		System.out.println("Enter the Amount: ");
		int amount=sc.nextInt();
	
		sc.close();

		if (value==1) {
			BankAccount b1=new BankAccount();
			b1.deposite(amount);
		}else {
			BankAccount b1=new BankAccount();
			b1.deposite(amount);
		}
		
	}

}
