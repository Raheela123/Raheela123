package com.programming.class3;

public class DataHiding {

	public static void main(String[] args) {
		
		Encapsulation obj = new Encapsulation();
		//account Balance should not be accessed outside the class
		//System.out.println(obj.accountBalance);
		System.out.println(obj.getBalance());
	}
}
