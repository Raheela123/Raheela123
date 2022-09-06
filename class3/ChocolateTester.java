package com.programming.class3;

public class ChocolateTester {

	//member variables
	int barCode;
	String name;
	int weight;
	int cost;
	
	public int getBarCode() {
		return barCode;
	}

	public void setBarCode(int barCode) {
		this.barCode = barCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	//Constructor
	ChocolateTester(int barCode, String name, int weight, int cost){
		this.barCode = barCode;
		this.name = name;
		this.weight = weight;
		this.cost = cost;
	}

	public static void main(String[] args) {
		ChocolateTester obj = new ChocolateTester(101, "Cadbury", 12, 10);
		System.out.println(obj.barCode);
		System.out.println(obj.name);
		System.out.println(obj.weight);
		System.out.println(obj.cost);
		
		obj.setBarCode(102);
		obj.setName("Hershey's");
		obj.setCost(50);
		obj.setWeight(24);
		
		System.out.println(obj.barCode);
		System.out.println(obj.name);
		System.out.println(obj.weight);
		System.out.println(obj.cost);
		
	}
}
