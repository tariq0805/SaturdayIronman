package com.upskill.java_1;

public class Variables {

	
	// Variables inJava
		// instance or Global variable: Variables declared in Class level, outside method
			// Local variables: Variables declared in method
			//Static variables:variables belong to class and don't require creating object
			// Method parameter: variables used as method parameter
			
public String country = "USA"; // global variable

public static String region = "North America";//Static Variable

	public static void main(String[] args) {
		
		String city ="New York"; // Local method
		String Police ="NYPD";
		System.out.println (city);
		System.out.println (region);
		nj("Essex");
		pa("Bensalem");
		
		Variables obj = new Variables();
		System.out.println(obj.country);
	}

	
	public static void nj (String county){ // method parameter
		String city ="Bloomfield";
		String Police ="BPD";
		System.out.println (city);
		System.out.println (region);
		System.out.println (county);
	}
	
	public static void pa (String county){
		String city ="Phili";
		String Police ="PPD";
		System.out.println (city);
		System.out.println (region);
		System.out.println (county);
	}
	
}
