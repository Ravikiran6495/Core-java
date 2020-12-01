package com.google.Basic;

public class NumberOfDigits {
	
	
	public static void main(String[] args) {
		
		
		int num=1234;
		
		int cnt=0;
		
		while(num!=0)
		{
			num=num/10; // num=12  12/10  1  o/1  0
			cnt++;  //cnt=1 ,2, 3
		}
		
		
		System.out.println("Number of digits is: "+cnt);
		
		
		
		
	}

}
