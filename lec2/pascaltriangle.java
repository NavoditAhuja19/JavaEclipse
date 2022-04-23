package lec2;

import java.util.Scanner;

public class pascaltriangle {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 0;
		int nst = 0;
		int fact1 = 1;
		int fact2 = 1;
		int fact3 = 1;
		int i, j, k;
		while (row < n) {
			int cst = 0;

			while (cst <= nst) {
				fact1 = fact2 = fact3 = 1;
				for (i = 1; i <= row; i++) {
					fact1 = fact1 * i;
				}
				for (j = 1; j <= cst; j++) {
					fact2 = fact2 * j;
				}
				if (row == 0) {
					fact3 = 1;
				} else {
					for (k = 1; k <= row - cst; k++) {

						fact3 = fact3 * k;
					}
				}
				int c = fact1 / (fact2 * fact3);
				System.out.print(c + "\t");
				cst = cst + 1;
			}
			System.out.println();
			row = row + 1;
			nst = nst + 1;

		}
	}
}
