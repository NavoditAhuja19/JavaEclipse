package lec6;

import java.util.Scanner;

public class ip_op {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int a[][] = takeinput();
		display(a);
	}

	public static int[][] takeinput()

	{
		System.out.println("row");
		int row = scn.nextInt();
		int[][] arr = new int[row][];
		for (int r = 0; r < arr.length; r++) {
			System.out.println("col for" + r + "row");
			int col = scn.nextInt();

			arr[r] = new int[col];
			for (int c = 0; c < arr[r].length; c++)

			{
				arr[r][c] = scn.nextInt();

			}
		}

		return arr;
	}

	public static void display(int[][] arr)

	{
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[r].length; c++) {
				System.out.print(arr[r][c]);
			}
			System.out.println();

		}
	}
}
