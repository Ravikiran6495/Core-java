package com.hefshine.ArrayCh;

import java.util.Scanner;

public class Addition {
	
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of array:");
		int size=sc.nextInt();

		int[] arr=new int[size];
		System.out.println("Enter your values:");
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i]=sc.nextInt();
		}
		// 1 2 3 4 5 
		
		// for Each
		System.out.println("arrray by using for each loop");
		for(int i:arr)
		{
			System.out.println(i);
		}
		
		
		
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			
			sum=sum+arr[i];
			
		}
		System.out.println("Sum is: "+sum);
		
		
		
	}

}
