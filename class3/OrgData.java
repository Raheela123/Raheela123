package com.programming.class3;

public class OrgData {
	
	// 3 instance variables(non static)
	int empId;
	String empName;
	int empAge;
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	//Default Data
	//initialize the instance variables
	OrgData(){
		empId = 0;
		empName = "XYZ";
		empAge = 22;
	}
	
	OrgData(int empId, String empName, int empAge){
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
	}
	
	//never recommended
	void OrgData() {
		System.out.println("Method");
	}
	
	public static void main(String[] args) {
		
		OrgData obj = new OrgData();
		System.out.println("Default Data - Constructor");
		System.out.println("Emp Id is " + obj.getEmpId());
		System.out.println("Emp Name is " + obj.getEmpName());
		System.out.println("Emp Age is " + obj.getEmpAge());
		
		System.out.println("Using Parameterized Constructor");
		
		OrgData obj2 = new OrgData(97, "Amit", 24); //Parameterized Constructor
		System.out.println("Emp Id is " + obj2.getEmpId());
		System.out.println("Emp Name is " + obj2.getEmpName());
		System.out.println("Emp Age is " + obj2.getEmpAge());
		
		System.out.println("Using Setter Functions");
		OrgData obj3 = new OrgData();
		obj3.setEmpId(94);
		obj3.setEmpName("Ritu");
		obj3.setEmpAge(23);
		
		System.out.println("Emp Id is " + obj3.getEmpId());
		System.out.println("Emp Name is " + obj3.getEmpName());
		System.out.println("Emp Age is " + obj3.getEmpAge());
		obj3.OrgData();
	}
	
	
	
	

}
