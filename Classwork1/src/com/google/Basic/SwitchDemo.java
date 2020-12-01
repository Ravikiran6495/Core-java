package com.google.Basic;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {

		// byte,short ,int ,long ,string
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int num = sc.nextInt();

		switch (num) {

		case 1:
			System.out.println("Monday");
			break;
			
		case 2:
			System.out.println("Tue");
			break;
			
		case 3:
			System.out.println("Wen");
			break;
			
		case 4:
			System.out.println("Thu");
			break;
			
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Sat");
			break;
		case 7:
			System.out.println("Sunday");
			break;
			
			default: System.out.println("invalid input");
		}

	}

}
