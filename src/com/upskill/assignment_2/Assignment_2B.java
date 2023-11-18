package com.upskill.assignment_2;

public class Assignment_2B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int marks = 89;
		
		if ( marks < 60)
		{
			System.out.println(" Fail");
		}
		else if (marks >=60 && marks <= 69)
		{
			System.out.println(" Grade : D ");
		}	
		else if (marks >=70 && marks <= 79)
		{
			System.out.println(" Grade : C ");
		}	
			
		else if (marks >=80 && marks <=89)
		{
			System.out.println(" Grade : B ");
		}
		else if (marks >=90 && marks <=100)
		{
			System.out.println(" Grade : A ");
		}
		
		else
		{
			System.out.println(" Marks Invalid ");
		}
			
	}

}
