package com.programming.class3;

public class CompileTimePolymorphism {

	//Method Overloading 
	//Differs in the parameter list
	//Compile Time Polymorphism
	int add(int a, int b) {
		return a + b;
	}
	
	//3 Parameters 
	int add(int a, int b, int c) {
		return a + b + c;
	}
	
	public static void main(String[] args) {
		CompileTimePolymorphism obj = new CompileTimePolymorphism();
		System.out.println(obj.add(10, 20));
		System.out.println(obj.add(10,20,30));
	}
	
}
