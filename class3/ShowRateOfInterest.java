package com.programming.class3;

class Bank2{
	void location() {
		System.out.println("Bank Square");
	}
	
	float getRateOfInterest() {
		return 7.2f;
	}
}

//Inheritance - overriding the parent - child
//extends only one class at a time in Java
class ICICI extends Bank2{
	@Override
	float getRateOfInterest() {
		location();
		return 6.9f;
	}
}

class SBI extends Bank2{
	//overriding the functionality from Parent
	@Override
	float getRateOfInterest() {
		location(); //using from Parent
		return 6.7f;
	}
}

public class ShowRateOfInterest {

	public static void main(String[] args) {
		ICICI obj = new ICICI();
		System.out.println("ROI of ICICI is " + obj.getRateOfInterest());
		
		SBI obj2 = new SBI();
		System.out.println("ROI of SBI is " + obj2.getRateOfInterest());
		
		//one last way of object creation
	}
	
}
