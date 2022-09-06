package com.programming.class3;

public class ThisKeywordUsage31 {

	//instance variable
	int uniqueId;
	
	ThisKeywordUsage31(int uniqueId){
		//instance variable = method parameter
		this.uniqueId = uniqueId;
	}
	
	//Method
	void message() {
		//this - current class object
		display(this);
	}
	
	//Function
	void display(ThisKeywordUsage31 obj) {
		System.out.println("Id is " + obj.uniqueId);
	}
	
	public static void main(String[] args) {
		
		ThisKeywordUsage31 obj = new ThisKeywordUsage31(20);
		//System.out.println("Id is " + obj.uniqueId);
		obj.message();
	}
	
	
}
