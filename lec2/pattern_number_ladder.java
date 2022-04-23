package lec2;

import java.util.Scanner;

public class pattern_number_ladder {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nst = 1;
		int val = 1;
		while (row <= n) {
			int cst = 1;
			while (cst <= nst) {
				System.out.print(val + "\t");
				val = val + 1;
				cst = cst + 1;
			}
			System.out.println();
			row = row + 1;
			nst = nst + 1;

		}
	}
}
