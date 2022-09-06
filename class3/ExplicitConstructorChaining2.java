package com.programming.class3;

public class ExplicitConstructorChaining2 {

	//intance variables
	int num;

	ExplicitConstructorChaining2(){
		//exlicit constructor chaining
		this(65);
	}

	ExplicitConstructorChaining2(int num) {	
		this(66, "ABC");
	}

	ExplicitConstructorChaining2(int num, String str) {
		this.num = num;
	}

	public static void main(String[] args) {

		ExplicitConstructorChaining2 obj = new ExplicitConstructorChaining2();
		System.out.println(obj.num); //66
	}
}
