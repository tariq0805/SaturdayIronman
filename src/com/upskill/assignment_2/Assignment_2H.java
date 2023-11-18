package com.upskill.assignment_2;

public class Assignment_2H {

	
	static int fact(int n) 
    { 
        if (n == 0) 
            return 1; 
  
        return n * fact(n - 1); 
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int num = 6; 
        System.out.println("Factorial of "/* + num + " is " */ + fact(7)); 
    } 
	}

