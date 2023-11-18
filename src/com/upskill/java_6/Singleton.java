package com.upskill.java_6;

public class Singleton {

	private Singleton(){
		
		
	}
	
	private static Singleton SingletonObj =new Singleton();
	
	public static Singleton getInstance()
	{
		return SingletonObj;
	}
	
	
	protected static void demo1()
	{
		System.out.println(" Demo I method for Singleton Class");
	}
	
	protected static void demo2()
	{
		System.out.println(" Demo II method for Singleton Class");
	}
	
	protected static void demo3()
	{
		System.out.println(" Demo III method for Singleton Class");
	}
	// Singleton is a  class that can have only one object.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
