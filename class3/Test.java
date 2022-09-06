package com.programming.class3;

public class Test {

	String bankName, area, phoneNumber;
	int i;
	Test(String bankName, String area, String phoneNumber){
		this.bankName = bankName;
		this.area = area;
	}
	
	Test(int i){
		System.out.println(i);
		this.i = i;
	}
	public static void main(String[] args) {
		Test obj = new Test("abc", "xyz", "pqr");
		System.out.println(obj.bankName);
		System.out.println(obj.area);
		
		Test obj2 = new Test(10);
		System.out.println(obj2.i);
	}
}
