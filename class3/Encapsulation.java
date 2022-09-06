package com.programming.class3;

public class Encapsulation {

	//variable should NOT be accessed outside the class
	//non static or a instance
	private double accountBalance = 20000;
	
	public double getBalance() {
		System.out.println("Account Balance is " + accountBalance);
		return accountBalance;
	}
	
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		System.out.println(obj.accountBalance);
		System.out.println(obj.getBalance());
	}
}
