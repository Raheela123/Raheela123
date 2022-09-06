package com.programming.class3;

abstract class Shape{
	//unique functionality
	//declaration
	abstract void draw();
	
	int area;
	
	//Common Functionality
	//definition
	void purpose() {
		System.out.println("Area Calculation");
	}
}

class Rectangle extends Shape{

	int b = 15, h = 45;
	@Override
	void draw() {
		area = (b*h);
		System.out.println("Area of Rectangle is " + area);
		purpose();
	}
	
}

class Triangle extends Shape{
	int b = 15, h = 45;
	@Override
	void draw() {
		area = (b*h)/2;
		System.out.println("Area of Triangle is " + area);
		purpose();
	}
}


public class Calculation {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		rect.draw();
		
		Triangle tri = new Triangle();
		tri.draw();
	}
}
