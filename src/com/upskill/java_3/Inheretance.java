package com.upskill.java_3;


import com.upskill.java_1.MethodType;
public class Inheretance extends MethodType{
	
	
	/* The process of obtaining the data members and methods from one class to another class is known as inheritance.
	-	Single Inheritance
	-	Multiple Inheritance	(Java doesn't support Multiple Inheritance directly rather through Interfaces)
	-	Multilevel Inheritance

	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Inheritance obj = new Inheritance ();
		obj.annualIncomeVoid();
		obj.weeklyIncomeVoid();
		System.out.println("my Monthly Income " + obj.momthlyIncome());
	}

}
