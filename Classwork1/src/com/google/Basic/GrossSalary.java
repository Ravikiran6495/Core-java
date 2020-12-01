package com.google.Basic;

import java.util.Scanner;

public class GrossSalary {
	
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your salary");
		long sal=sc.nextLong();
		
		double hra,da,GS;
		
		if(sal<10000)
		{
			hra=sal*0.20;
			da=sal*.80;
			GS=sal+hra+da;
			System.out.println("Salary is first"+GS);
		}
		else if(sal>1000 && sal<20000)
		{
			hra=sal*0.25;
			da=sal*.90;
			GS=sal+hra+da;
			System.out.println("Salary is second"+GS);
	
		}
		else  
		{
			hra=sal*0.30;
			da=sal*.95;
			GS=sal+hra+da;
			System.out.println("Salary is third:"+GS);
		}
		
	}

}
