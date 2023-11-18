package com.upskill.assignment_2;

public class Assignment_2G {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a = 25;
		int b = 30;

        System.out.println("--Before swap--");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);

        // Value of first is assigned to temporary
        int temporary = a;

        // Value of second is assigned to first
        a = b;

        // Value of temporary (which contains the initial value of first) is assigned to second
        b = temporary;

        System.out.println("--After swap--");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
	}

}
