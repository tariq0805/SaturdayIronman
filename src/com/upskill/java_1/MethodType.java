package com.upskill.java_1;

public class MethodType {

	
	/*
	 1. Void Method = empty space
	 2.Static Method
	 3. Return Method
	 */
	
	
	public static int hourlyIncome = 65;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodType obj = new MethodType();// class name object name 
		obj.annualIncomeVoid();
		System.out.println("My Monthly Income:" + obj.monthlyIncomeReturn());
	    WeeklyIncomeStatic();
		
	}

	// void method
	
	public void annualIncomeVoid(){
		
		int calculateAnnualIncome = hourlyIncome * 2000;
		System.out.println(" My Annual Income = " + calculateAnnualIncome);
	}

	
	// return type
	
	public int monthlyIncomeReturn(){
		int calculateMonthlylIncome = hourlyIncome * 180;
		return calculateMonthlylIncome;
	}
	
	
	//static Method
	
	public static void WeeklyIncomeStatic(){
		int calculateWeeklyIncome = hourlyIncome * 40;
		System.out.println("My weekly Income :" + calculateWeeklyIncome);
	}
	
	
}
