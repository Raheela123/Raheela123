package com.programming.class3;

public class ThisKeywordUsage1 {

	//id is a instance variable(non static) or a property or attribute
	int id;
	//byte, short, int, long - 0 
	//float and double - 0.0f and 0.0D
	//boolean - false
	//char - '' 
	
	void display(int id) {
		//resolves the ambiguity between instance and local(method parameter)
		this.id = id; //this keyword initializes the value
	}
	
	public static void main(String[] args) {
		
		ThisKeywordUsage1 obj = new ThisKeywordUsage1();
		obj.display(50); //using this keyword, set the data
		System.out.println("The value of id is " + obj.id); // 10
	}
}
