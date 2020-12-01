package com.hefshine.Hirachical_inhrtitance;

public class B extends A {
	
	
	public void dis()
	{
		System.out.println("calling from B");
	}
	
	
	public static void main(String[] args) {
		
		
		B b=new B();
		b.display();
		b.dis();
	}

}
