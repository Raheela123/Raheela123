package com.programming.class3;

public class Duration {

	long start, end; //0
	
	//Initialize instance variables
	Duration(){
		start = 15;
		end = 25;
	}
	
	//Constructor - Identify - Will never have a return type
	//Parameterized Constructor or Arg Based Constructor
	Duration(long start, long end){
		this.start = start;
		this.end = end;
	}
	
	//Method
	//Function - Business Functionality - Method - BUC - Wireframe 
	long difference() {
		return end - start;
	}
	
	public static void main(String[] args) {
		//No Arg Constructor is called here
		Duration obj = new Duration();
		System.out.println("The value of start is " + obj.start);
		System.out.println("The value of start is " + obj.end);
		//Called the method 
		System.out.println("Difference is " + obj.difference());
		
		Duration obj2 = new Duration(25, 100);
		System.out.println("The value of start is " + obj2.start); //25
		System.out.println("The value of start is " + obj2.end); //100
		//Called the method 
		System.out.println("Difference is " + obj2.difference()); //75
		
	}
	
}
