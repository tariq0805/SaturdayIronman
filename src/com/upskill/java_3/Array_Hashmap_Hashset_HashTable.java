package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 30;                                       //  variable
		int [] ageIronMan = new int [] {24,32,37,21,27,35};   // Array
		
		     //Aray index [0],[1],[2],[3],[4]		
		
		System.out.println("Student Age :" +  ageIronMan[4]);
		System.out.println("Total Student :" + ageIronMan.length);

	
	                                      //  variable
	String[] nameIronMan = new String [] {"Tom", "Jerry", "Scoby", "Eddie","Nany","Many"};   // Array
	
	     //Aray index [0],[1],[2],[3],[4]		
	
	System.out.println("Student name :" +  nameIronMan[4]);
	System.out.println("Total Student :" + nameIronMan.length);
	
	
	//multi-Dimentional Array
	
	int [][] ageIronMan2D = {{25,23,24,21,43,26},{29,28,25,33,31,27}};

	System.out.println("Student Age 2D :" +  ageIronMan2D[1][1]);
	
	// Hashmap Store multiple data using key value pair, implementation of Map interface
	
	HashMap<String,Integer> Student = new HashMap<String, Integer>();
	Student.put("Yousuf", 27);
	Student.put("Abdullah", 28);
	Student.put("Madan", 29);
	Student.put("jannat", 24);
	
	System.out.println("HashMap Stusent Age :" + Student.get("Madan"));
	
	HashMap<String,String> Capital = new HashMap<String, String>();
	Capital.put("USA","DC");
	Capital.put("Bangladesh", "Dhaka");
	Capital.put("Maxico", "Maxicocity");
	Capital.put("CANADA", "Toronto");
	
	System.out.println("HashMap Capital :" + Capital.get("USA"));
	
	
	// Hashset Store unordered collection containing unique value, implementation of interface 
	
	HashSet<String> car = new HashSet<String>();
	car.add("BMW");
	car.add("Toyota");
	car.add("Tesla");
	System.out.println("Car :"+ car);
	
	// HashTable Store multiple data using key value pair no duplicate
	// also is Synchronized (only one thread can be modified)
	
	Hashtable<String,String> Region = new Hashtable<String, String>();
	Region.put("BANGLADESH","Asia");
	Region.put("USA", "America");
	
	
	System.out.println("Hashtable Capital :" + Region.get("BANGLADESH"));
	
	}
}
