package com.hefshine.Single_Inheritance;

public class Child extends Parent {

	int a=20;
	Child(int a)
	{
		super(a);
		System.out.println("child ");
		
		
	}
	
	public void display()
	{
		System.out.println("value is: "+a);
		System.out.println("Valu from parent: "+super.a);
	}
	
	@Override
	public void Bike()
	{
		System.out.println("Pulsar");
	}
	
	public static void main(String[] args) {
		
		Child c=new Child(10);
		//c.HardWork();
		System.out.println(c.a);
		c.display();
		c.Bike();
		
	}
}
