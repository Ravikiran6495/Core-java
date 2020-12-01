package com.hefshine.ArrayCh;

import java.util.Scanner;

public class Demo2D {

	public static void main(String[] args) {

		int[][] arr = new int[3][3];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your nunber:");

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				arr[i][j] = sc.nextInt();
			}

		}

		System.out.println("Your 2d Array is:");

		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr.length; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();

		}
		
//		1 2 3   [0][0] [0][1] [0][2]
//		4 5 6 	[1][0] [1][1] [1][2]
//		7 8 9   [2][0] [2][1] [2][2]

	}

}
