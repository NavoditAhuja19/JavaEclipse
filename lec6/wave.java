package lec6;

import java.util.Scanner;

public class wave {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		//int a[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		int a[][] = takeinput();
		wave(a);

	}
	public static int[][] takeinput()

	{

		int row = scn.nextInt();
		int col = scn.nextInt();
		int[][] arr = new int[row][col];
		for (int r = 0; r < arr.length; r++) {
	
		
		

			
			for (int c = 0; c < arr[0].length; c++)

			{
				arr[r][c] = scn.nextInt();

			}
		}

		return arr;
	}

	public static void wave(int[][] arr) {
		int cnt = 0, i, j;
		for (j = 0; j < arr[0].length; j++) {
			if (j % 2 == 0) {

				for (i = 0; i < arr.length; i++) {
					System.out.print(arr[i][j]+", ");

				}
		//	System.out.println();

			} else {

				for (i = arr.length - 1; i >= 0; i--) {
					System.out.print(arr[i][j]+", ");

				}
			//	System.out.println();
			}

		}
		System.out.print("END");

	}

}
