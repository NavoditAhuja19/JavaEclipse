package lec2;

import java.util.Scanner;

public class pattern_with_zeroes {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nst = 1;
		int val = 1;
		int val1 = 0;
		while (row <= n) {
			val = row;
			int cst = 1;
			while (cst <= nst) {
				if (cst == nst || cst == 1)
					System.out.print(val + "\t");
				else
					System.out.print(val1 + "\t");

				cst = cst + 1;
			}
			System.out.println();
			row = row + 1;
			nst = nst + 1;

		}
	}
}
