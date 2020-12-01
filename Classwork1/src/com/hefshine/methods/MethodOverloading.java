package com.hefshine.methods;

public class MethodOverloading {
	
	
	public void addition()
	{
		int c=10+10;
		System.out.println("add is"+10);
	}
	
	public void addition(int a,int b)
	{
		int c=a+b;
		System.out.println("add is"+c);
	}
	
	 static public void addition(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println("add is"+c);
	}
	
	
	public static void main(String[] args) {
		
//		MethodOverloading ob=new MethodOverloading();
//		
//		ob.addition(10, 20);
//		
//		ob.addition(10,20, 30);
		
		MethodOverloading.addition(10, 20, 30);
		
	}

}
