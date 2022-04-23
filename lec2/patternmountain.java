package lec2;

import java.util.Scanner;

public class patternmountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = 1;
		int row = 1;
		int nsp = 2 * n - 3;
		int val = 1;
		while (row <= n) {
			val = 1;
			int cst = 1;
			while (cst <= nst) {
				System.out.print(val + "\t");
				cst = cst + 1;
				val = val + 1;
			}
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("\t");
				csp = csp + 1;
			}
			cst = 1;
			if (row == n) {
				val = val - 1;
				while (cst < nst) {
					val = val - 1;
					System.out.print(val + "\t");

					cst = cst + 1;
				}
			} else {
				while (cst <= nst) {
					val = val - 1;
					System.out.print(val + "\t");

					cst = cst + 1;
				}
			}
			System.out.println();
			nst = nst + 1;
			nsp = nsp - 2;
			row = row + 1;

		}
	}

}
