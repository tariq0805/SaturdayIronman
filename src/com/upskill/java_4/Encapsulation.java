package com.upskill.java_4;

public class Encapsulation {

	
	private String name;// ="Upskill";
	private int ssn;// = 987650;
	private String username;// ="Amir Khan";
	
	
	// Setter Method -name
	public void setName (String value){
		name = value;
	}
	
	// Setter Method -name
		public void setSSN (int value){
			ssn = value;
		}
		// Getter Methos - name
		 public String getName(){
			 return name;
		 }
			 public String getUsename(){
				 return username;
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation obj = new Encapsulation();
		obj.setName(" amu");
		obj.setSSN(987650);
		
		System.out.println(obj.getName ());
		System.out.println(obj.getUsename());
	}

}
