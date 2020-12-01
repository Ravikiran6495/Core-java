package com.google.Basic;

import java.util.Scanner;

public class Even {
	
	
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your number:");
		int number=sc.nextInt();
		
		if(number%2==0)
		{
			System.out.println("Your number is even");
		}
		else 
		{
			
			System.out.println("Your number is odd");
		}
	}

}
