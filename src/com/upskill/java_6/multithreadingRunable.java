package com.upskill.java_6;

public class multithreadingRunable  implements Runnable{

	
	public void run(){
		try {
			System.out.println(" Thread Number #" + Thread.currentThread().getId() + " is Running");
		} catch (Exception e){
			System.out.println("Exception is caught");
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
