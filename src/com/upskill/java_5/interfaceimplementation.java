package com.upskill.java_5;

public class interfaceimplementation implements Interface {

	@Override
	public void iDoor() {
		// TODO Auto-generated method stub
		System.out.println(" My Car has 4 Doors " );
	}

	@Override
	public String iEngine() {
		// TODO Auto-generated method stub
		System.out.println(" My Car has Dual Motors " );
		return "Dual Motors";
	}

	@Override
	public void icolor() {
		// TODO Auto-generated method stub
		System.out.println(" My Car has Red Color " );
	}

	@Override
	public int iwheel() {
		// TODO Auto-generated method stub
		
		System.out.println(" My Car has4 wheels " );
		return 4;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
