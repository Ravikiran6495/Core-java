package com.google.Basic;

public class Modifier {

	// within class only
	private int num4 = 40;

	// same pacjake
	int num1 = 20;

	// same packae and subclass
	protected int num3 = 30;

	// anywhere in project
	public int num = 10;
	
	
	public int addition()
	{
		int c=10+10;
		
		return c;
	}

	public static void main(String[] args) {

		Modifier ob = new Modifier();
		System.out.println(ob.num);

		System.out.println(ob.num1);

		System.out.println(ob.num4);

	}

}
