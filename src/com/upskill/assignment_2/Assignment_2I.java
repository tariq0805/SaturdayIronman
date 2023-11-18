package com.upskill.assignment_2;

public class Assignment_2I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Talen";
		String b = "Tech";

        System.out.println("--Before swap--");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);

        // Value of first is assigned to temporary
        String temporary = a;

        // Value of second is assigned to first
        a = b;

        // Value of temporary (which contains the initial value of first) is assigned to second
        b = temporary;

        System.out.println("--After swap--");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
		
	}

}
