package com.programming.class3;

//constructors are chained together
public class ExplicitConstructorChaining {

	//Using this keyword
	//No Arg Constructor
	ExplicitConstructorChaining(){
		this("ABC");
		System.out.println("No Arg Constructor"); //3rd
	}
	
	ExplicitConstructorChaining(String str){
		this("XYZ", 100);
		System.out.println("Arg Based Constructor - " + str); //2nd
	}
	
	ExplicitConstructorChaining(String str, int id){
		System.out.println("Arg Based Constructor - " + str + " and id is " + id); //1st
	}
	
	public static void main(String[] args) {
		ExplicitConstructorChaining obj = new ExplicitConstructorChaining();
	}
}
