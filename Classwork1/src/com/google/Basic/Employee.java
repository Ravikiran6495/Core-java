package com.google.Basic;

public class Employee {

	// instance variable
	String firstName="Ravi";
	String lastdName="Takale";
	
	static String city="Pune";
	 
	// 1. local
	// 2. instance
	// 3. static variable
	
	 public void Working()
	{
		int num2=10;
		System.out.println("Hiii");
		System.out.println("Hiii");
		System.out.println("Hiii");
		System.out.println("Hiii");
		System.out.println("Hiii");
				System.out.println(city);
	}
	
	
	static public void sum()
	{
		int num3=10;//local variable
		System.out.println("static method");
		
	}
	
	public void mul()
	{
		
	}
	
	public static void main(String[] args) {
		//Employee emp=new Employee();
		//emp.Working();
		
		//System.out.println(emp.firstName);
		//System.out.println(firstName);
	
		sum();
		System.out.println("Main method:"+city);
	
	}
}
