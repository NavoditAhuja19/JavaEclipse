package lec2;

import java.util.Scanner;

public class doublearrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nsp1 = n - 1;
		int nsp2 = -1;
		int nst = 1;
		int val = 1;
		while (row <= n) {
			int csp1 = 1;
			while (csp1 <= nsp1) {
				System.out.print(" ");
				csp1 = csp1 + 1;
			}
			int cst = 1;
			while (cst <= nst) {
				System.out.print(val);
				val = val - 1;
				cst = cst + 1;
			}
			int csp2 = 1;
			while (csp2 <= nsp2) {
				System.out.print(" ");
				csp2 = csp2 + 1;
			}
			if (row == 1 || row == n) {
				cst = 1;
				val = val + 1;
				while (cst < nst) {

					System.out.print(val);
					cst = cst + 1;
				}
			} else {
				cst = 1;
				while (cst <= nst) {
					val = val + 1;
					System.out.print(val);
					cst = cst + 1;
				}
			}
			System.out.println();
			if (row <= n / 2) {
				nsp1 = nsp1 - 2;
				nsp2 = nsp2 + 2;
				nst = nst + 1;
				val = val + 1;

			} else {
				nsp1 = nsp1 + 2;
				nsp2 = nsp2 - 2;
				nst = nst - 1;
				val = val - 1;
			}
			row = row + 1;

		}

	}

}
