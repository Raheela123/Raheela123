package com.programming.class3;

public class Bank {

	//member variables or instance variables
	private String bankName, area;
	private String phoneNumber;
	
	Bank(){
		bankName = "IBank";
		area = "Gandhi Nagar";
		phoneNumber = "987654321";
	}
	
	Bank(String bankName, String area, String phoneNumber){
		this.bankName = bankName;
		this.area = area;
		this.phoneNumber = phoneNumber;
	}
	
	void display() {
		System.out.println("Bank Name is " + bankName + " and area is " +
				area + " and Phone number is " + phoneNumber);
	}
	
	public static void main(String[] args) {
		Bank obj = new Bank(); //Non Parameterized
		obj.display();
		
		Bank obj2 = new Bank("ICICI","Saket","9878787876"); //Parameterized
		System.out.println(obj2.bankName);
		System.out.println(obj2.area);
		System.out.println(obj2.phoneNumber);
		
	}
}
