package lec6;

import java.util.Scanner;

public class spiral_clockwise {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { { 10, 20, 30 },
				{ 40, 50, 60 },
				{ 70, 80, 90 } };
		//int a[][] = takeinput();

	
		spiral(a);
	}

	public static void spiral(int[][] arr) {
		int minrow = 0;
		int mincol = 0;
		int maxrow = arr.length - 1;
		int maxcol = arr[0].length - 1;
		int total = arr.length * arr[0].length;
		int cnt = 0;

		while (cnt < total) {
			for (int c = mincol; c <= maxcol && cnt < total; c++) {
				cnt++;
				System.out.print(arr[minrow][c] + ", ");
			}
			minrow++;
			for (int r = minrow; r <= maxrow && cnt < total; r++) {
				cnt++;
				System.out.print(arr[r][maxcol] + ", ");
			}
			maxcol--;
			for (int c = maxcol; c >= mincol && cnt < total; c--) {
				cnt++;
				System.out.print(arr[maxrow][c] + ", ");
			}
			maxrow--;
		
			for (int r = maxrow; r >= minrow && cnt < total; r--) {
				cnt++;
				System.out.print(arr[r][mincol] + ", ");
			}
			mincol++;
		

		}
		System.out.print("END");
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



}
