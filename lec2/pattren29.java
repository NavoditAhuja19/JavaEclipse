package lec2;

import java.util.Scanner;

public class pattren29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nst = 1;
		int nsp = n - 1;
		int val = 1;
		int val1 = 0;
		while (row <= n) {
			val = row;
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("\t");
				csp = csp + 1;

			}
			int cst = 1;
			while (cst <= nst) {
				if (cst == 1 || cst == nst)
					System.out.print(val + "\t");
				else
					System.out.print(val1 + "\t");

				cst = cst + 1;
			}
			System.out.println();
			row = row + 1;
			nsp = nsp - 1;
			nst = nst + 2;
		}

	}

}
