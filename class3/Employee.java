package com.programming.class3;
//Is always - Package Name 

// public is a access modifier - 
// class is a keyword
// Employee is a name of a class 
// {} = curly brackets to wrap classes

public class Employee {

	// attributes/properties/non static instance variables
	int empAge; // 0
	String name; // null
	String designation; // null
	double salary; // 0.0

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	//JVM
	// getter is to get the data of these fields - Age
	public static void main(String[] args) {
		//Object
		Employee obj = new Employee(); //OBJECT - new - mandatory
		//revolve around objects
		//JVM allocate the memory
		// setting the data in the attributes
		//Set the data
		obj.setName("ABC"); // data the properties - Behaviour - Method - Functions
		obj.setEmpAge(25);
		obj.setDesignation("Software Engineer");
		obj.setSalary(5000);

		//Get the data
		// getting the data - retrieving the date
		System.out.println("Name of an employee is " + obj.getName());
		System.out.println("Age of an employee is " + obj.getEmpAge());
		System.out.println("Designation of an employee is " + obj.getDesignation());
		System.out.println("Salary of an employee is " + obj.getSalary());

	}

}
