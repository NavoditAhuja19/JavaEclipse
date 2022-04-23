package lec2;

import java.util.Scanner;

public class pattern32c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int row = 1;
		int nst = 1;
		int nsp = n - 1;
		int val = 1;

		while (row <= 2 * n - 1) {
			if (row <= n)
				val = row;
			else
				// val=total-row+1
				// here total=2*n-1
				val = 2 * n - row;

			int csp = 1;
			while (csp <= nsp) {
				System.out.print("\t");
				csp = csp + 1;
			}
			int cst = 1;
			while (cst <= nst) {

				System.out.print(val + "\t");
				if (cst <= nst / 2)
					val = val + 1;
				else
					val = val - 1;

				cst = cst + 1;
			}
			System.out.println();

			if (row <= n - 1) {
				nst = nst + 2;
				nsp = nsp - 1;
			} else {
				nst = nst - 2;
				nsp = nsp + 1;
			}
			row = row + 1;
		}

	}

}
