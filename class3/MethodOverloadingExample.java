package com.programming.class3;

public class MethodOverloadingExample {

	int num;
	//Method Overloading
	//Compile Time Polymorphism
	//Never happen on the basis of return type
	void show() {
		num = 10;
	}
	
	//Compile Time Polymorphism
	//One action - multiple forms
	void show(int a) {
		num = a;
	}
	
	//Method Executed - First
	void show(int a, int b) {
		num = a+ b;
	}
	
	public static void main(String[] args) {
		MethodOverloadingExample obj = new MethodOverloadingExample();
		obj.show(10, 20);
		System.out.println(obj.num);
		
		obj.show(40);
		System.out.println(obj.num);
		
		obj.show();
		System.out.println(obj.num);
	}
}
