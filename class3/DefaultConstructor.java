package com.programming.class3;

public class DefaultConstructor {

	int age;

	DefaultConstructor(int age){
		this.age = age;
	}
	
	//No Constructor As such
	public static void main(String[] args) {
		
		DefaultConstructor obj = new DefaultConstructor(24);
		System.out.println("Default Value for Age is " + obj.age); //0
	}
}
