package com.hefshine.methods;

public class DemoMethods {
	
	
	
//	Access_modifier return_type method_name()
//	{
//		
//	}
	
	
	
	public void addition()
	{
		int a=10+10;
		System.out.println("Sum is:"+a);
	}
	
	public int substraction()
	{
		int a=20-10;
		//System.out.println("Sum is:"+a);
		return  a;
	}
	
	
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println("Add is: "+c);
	}
	
	public double sub(int a, int b)
	{
		int c=a-b;
		System.out.println("Add is: "+c);
		return c;
	}
	
	
	public void additionDemo()
	{
		
	}
	
	
	
	public static void main(String[] args) {
	
		
		DemoMethods ob=new DemoMethods();
		ob.addition();
		
		
		int num=ob.substraction();
		System.out.println("sub is:"+num);
		
		ob.add(20, 30);
		
		double ans = ob.sub(30, 10);
		System.out.println("sub is:"+ans);
	}

}
