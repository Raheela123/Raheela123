package com.programming.class3;

class Loan{
	//state or member variable or instance variable
	double tenure, principle, interestRate;
	
	//method
	void calculateEMI() {
		interestRate = (principle * tenure)/100;
	}
}

class HomeLoan extends Loan{
	
	@Override //Annotation - Not mandatory
	//Way to let everyone know that method is overridden from Parent
	//to Child - Good Programming Practice
	void calculateEMI() {
		tenure = 120;
		principle = 2000000;
		interestRate = 0.5 * tenure/100;
		System.out.println("Interest Rate is " + interestRate);
	}
}

//Inheritance - extends
class VehicleLoan extends Loan{
	double tenure = 60;
	double principle = 800000;
	
	void calculateEMI() {
		interestRate = principle * tenure/100;
		System.out.println("Interest Rate is " + interestRate);
	}
}

class GoldLoan extends Loan{
	double tenure = 240;
	double principle = 3000000;
	
	void calculateEMI() {
		interestRate = principle * tenure/100;
		System.out.println("Interest Rate is " + interestRate);
	}
}

public class InheritanceTest {

	public static void main(String[] args) {
		HomeLoan hLoan = new HomeLoan();
		hLoan.calculateEMI();
		
	}
}
