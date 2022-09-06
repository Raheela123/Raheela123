package com.programming.class3;

class ParentClass{

	//Parent Class Variable
	int data = 10;
	
	//Parent Class Method
	void display() {
		System.out.println("Parent Class Method");
	}
}

//using extends, we implement Inheritance
public class MethodOverriding extends ParentClass{

	int data = 20;
	
	@Override
	void display() {
		System.out.println("Child Class Method - Display");
	}
	
	public static void main(String[] args) {
		
		ParentClass obj = new ParentClass();
		System.out.println(obj.data); //10
		obj.display(); //Parent Class Method
		
		MethodOverriding obj2 = new MethodOverriding();
		System.out.println(obj2.data); //20
		obj2.display(); //Child Class Method - Display
	}
	
}
