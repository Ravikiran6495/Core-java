package com.google.Basic;

public class LoopDemo {

	// *
	// * *
	// * * *
	// * * * *
	// * * * * *

	public static void main(String[] args) {

		/*
		 * for (int i = 1; i <= 4; i++) { // i=1,2,3,4
		 * 
		 * for (int j = 1; j <= 4; j++) { System.out.print("* "); }
		 * System.out.println(); }
		 */
		// * * * *
		// * * * *
		// * * * *
		// * * * *

		/*
		 * for (int i = 1; i <=5; i++) {
		 * 
		 * for (int j = 1; j <=i; j++) { System.out.print("*");
		 * 
		 * } System.out.println(); }
		 */

		// 1
		// 1 2
		// 1 2 3
		// 1 2 3 4
		// 1 2 3 4 5

		for (int i = 1; i <= 4; i++) 
		{
			// i=1,2,3,4

			for (int j = 1; j <= i; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	
		// A=65 to 90  a=97 to 122  
		
		// A
		// A B
		// A B C
		// A B C D
		
		
	

	}

}
