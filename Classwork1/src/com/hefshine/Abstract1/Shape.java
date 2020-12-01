package com.hefshine.Abstract1;

abstract public class Shape {
	
	int a;
	Shape()
	{
		this(10);
		System.out.println("default const of shape");
	}
	
	Shape(int a)
	{
		System.out.println("para shape con");
	}
	
	
	 abstract public void numberofsize(); 

}
