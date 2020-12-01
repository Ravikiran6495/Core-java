package com.hefshine.constr;

public class Employee {

	int id;
	String name;
	
	
	public Employee()
	{
		this(10);
		System.out.println("Default const called 2");
	}
	
	public Employee(int c)
	{
		System.out.println("Default const called 3");
	}
	
	
	public Employee(int id, String name) {
		this();
		this.id = id;
		this.name = name;
		System.out.println("caled 1");
	}
	
	
	
	public void display()
	{
		System.out.println("id is:: "+id+"name is:+  "+name);
	}


	public static void main(String[] args) {
		
		Employee ob=new Employee(10,"Pranita");
		
		ob.display();
	}
	
	
	
	

}
