package com.upskill.java_2;

public class Loops {

	
	/*
	 * 
	 * For
	 * While
	 * do
	 * Infinite */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          practiceForLoop();
          practiceWhileLoop();
          practiceDoWhileLoop();
          //practiceinfiniteLoop();
          practiceNestedForLoop();
          
	}

	
	public static void practiceForLoop(){
		
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.println("For The Loop Number =" + i); 
		}
	}
		/*int i;
		for(i=10;i>=1;i--)
		{
			System.out.println("For The Loop Number =" +i);
		}*/
		
		
		public static void practiceWhileLoop(){
			
			int j = 1;
			while(j<=10)
			{
				System.out.println("while The Loop Number =" + j);
				j++;
			}
	}
	
		
public static void practiceDoWhileLoop(){
			
			int k = 1;
			do
			{
				System.out.println("Dowhile The Loop Number =" + k);
				k++;
			} while(k<=0);
	}


/*public static void practiceinfiniteLoop(){
	
	int l;
	for(l=1; ;l++)
	{
		System.out.println("For The Loop Number =" + l); 
	}
}*/

public static void practiceNestedForLoop(){
	
	int a;
	int b;
	for(a=1;a<=10;a++)
	{
		for(b=1;b<=10;b++)
	{
			int multiplicationTable = a * b;
		System.out.print(multiplicationTable  + " |"); 
	}
	System.out.println(" ..");
}
                       }


}
