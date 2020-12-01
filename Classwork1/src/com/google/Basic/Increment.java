package com.google.Basic;

public class Increment {

	public static void main(String[] args) {
		
		// post incremt
		int b=10;
		int x=b++ + b++ + b;
			  // 10^11 +11^12+12;
			 // 10+11+12
			// 33
		System.out.println("post incrment"+x);

		// pre increment
		
		int a=10;
		
		int c=++a + ++a +a;
			//10(11)+12+12
				
		
		System.out.println("Pre increment"+c);
		
	}

}
