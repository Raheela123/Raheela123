package com.programming.class3;

public class ThisKeywordUsage3 {
	// instance variable
	int id;

	ThisKeywordUsage3() {
		// initialize - Constructor
		id = 15; // initialized as part of a constructor
	}

	//Parameterized Constructor
	ThisKeywordUsage3(int id) { //25
		//id = 25
		this.id = id; // initialized as part of a constructor
	}

	void show() {
		// Object
		display(this); // usage of this keyword
	}

	// expects the object
	void display(ThisKeywordUsage3 obj) {
		System.out.println("The id value is " + obj.id); // 15 //25
	}

	public static void main(String[] args) {
		ThisKeywordUsage3 obj = new ThisKeywordUsage3();
		obj.show();

		ThisKeywordUsage3 obj2 = new ThisKeywordUsage3(65);
		obj2.show();

	}
}
