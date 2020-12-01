package com.hefshine.ArrayCh;

import java.util.Scanner;

public class Demo {

	int a=10,b=2, c=30,d=40, e=50;
	
	public static void main(String[] args) {
		
		
		//int[] arr= {10,20,30,40,50};
		
		int[] arr1=new int[5];
		
		System.out.println("Enter youe values:");
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i]=sc.nextInt();
		}
		
		
		System.out.println("Yor added this values in your array:");
		
		
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}
		
	}
	
}
