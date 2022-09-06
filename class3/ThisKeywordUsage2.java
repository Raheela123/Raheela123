package com.programming.class3;

//this keyword resolves the ambiguity between local variable(Method Parameter) and instance variables
public class ThisKeywordUsage2 {
	
	//Global Variable - which is not defined inside methods
	int id = 10;//Instance Variable
	
	void show(int id) {
		//this.id = id;
		System.out.println("Local Variable Value -  " + id); //Local Variable - 15
		System.out.println("Instance Variable Value - " + this.id); //10 -- this refers 
		// current class object
	}
	
	void display() {
		//Local Variable = Method
		int id = 20;
		System.out.println("Local Variable Value -  " + id); //Local Variable - 20
		System.out.println("Instance Variable Value - " + this.id); //10 -- this refers 
		// current class object
	}
	public static void main(String[] args) {
		//OOPs
		ThisKeywordUsage2 obj = new ThisKeywordUsage2();
		obj.show(15); 
		obj.display();
	}

}
