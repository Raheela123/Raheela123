package com.programming.class3;

//this refers to current class object
public class ThisKeywordDefinition {
	
	public static void main(String[] args) {
		ThisKeywordDefinition obj = new ThisKeywordDefinition();
		System.out.println("The value of obj " + obj); //obj
		obj.display();
		
		ThisKeywordDefinition obj2 = new ThisKeywordDefinition();
		System.out.println("The value of obj2 " + obj2); //obj2
		obj2.display();
		
	}
	
	
	//Message is just a function name
	//non static function
	//this refers to current class object
	//method - Business Functionalities for my Project
	void display() {
		System.out.println("The value of this keyword is " + this); // this keyword
	}

}
