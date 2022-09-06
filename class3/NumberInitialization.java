package com.programming.class3;

public class NumberInitialization {

	// default value of a integer is 0
	int number;
	String str;

	// Constructor
	// no return type
	// No Arg Constructor
	// Constructor Overloading
	NumberInitialization() {
		//initialize these instance variables at the time of object creation
		number = 100; //initializing the value of number as 100
	}
	
	NumberInitialization(int number) { //Parameter
		//initialize these instance variables at the time of object creation
		//this refers to current class object
		//resolves the ambiguity between instance variable and a method parameter
		this.number = number; //-50
	}
	
	NumberInitialization(int number, String str) {
		//initialize these instance variables at the time of object creation
		//this refers to current class object
		//resolves the ambiguity between instance variable and a method parameter
		this.number = number; //-50
		this.str = str;
	}
	
	//Parameterized Constructor or Arg Based Constructor

	public static void main(String[] args) {
		//Constructor will be automatically called
		NumberInitialization obj = new NumberInitialization();
		System.out.println("The value of number is " + obj.number); //100

		NumberInitialization obj2 = new NumberInitialization(-50); //Parameter
		System.out.println("The value of number is " + obj2.number); //-50
		
		NumberInitialization obj3 = new NumberInitialization(200, "Hello Everyone! Welcome to Java");
		System.out.println("The value of number is " + obj3.number); //200
		System.out.println("Message str is " + obj3.str);

	}
}
