package com.programming.class3;

//this - current class obj
public class ThisKeywordUsage5 {
	
	//This function will give me the object of a class
	//return type is ThisKeywordUsage5
	//giving me the object of my class
	ThisKeywordUsage5 getMeTheObject() {
		//returning the current class object
		return this;
	}
	
	void message() {
		System.out.println("Message Method");
	}
	
	public static void main(String[] args) {
		
		ThisKeywordUsage5 obj = new ThisKeywordUsage5();
		obj.message();
		
		//Another way of object creation
		//Both mechanisms are absolutely same
		new ThisKeywordUsage5().getMeTheObject().message();
	}
}
