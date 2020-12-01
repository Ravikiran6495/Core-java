package com.hefshine.String1;

public class Demo {
	
	int a=5;
	public void m()
	{
		
	}
	
	public static void main(String[] args) {
		
		char ch='a';
		
		//literal
		String name="Pranita";   
		System.out.println("name is:"+name);

		String name1="Pranita";
		
		
		// String constant pool (SCP)
		// String is immutable
		
		
		//new keyword
//		String name1=new String("Pranita1");
//		System.out.println("name is:"+name1);
		
		
		//when we create object Heap memory will be inilize to instance varible and instance method
		Demo d=new Demo();
		
		
		System.out.println("Lenghth is"+name.length());
		
		System.out.println("concation is:"+name.concat(" Patil"));
		
		System.out.println("comapar "+name.compareTo("Pranita"));
		
		System.out.println(name.charAt(2));
		
		// A to z  95 to 90
		// a to z  97 to 122 
	}

}
