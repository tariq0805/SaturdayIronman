package com.upskill.assignment_1;

public class Assignment_1_4 {

	public static void main(String[] args) {
		// A function returns 30, another function returns 50. Write a java program which will display subtraction value from bigger number to smaller.
 
		int a=30;
		int b=50;
		
		boolean c1 = (a > b);
		System.out.println(c1);
		
		boolean c2 = (b > a);
		System.out.println(c2);
		
		int d = (b-a);
		System.out.println("Subtraction of two numbers: " + d);
	}

}
