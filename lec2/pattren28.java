package lec2;

import java.util.Scanner;

public class pattren28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nst = 1;
		int nsp = n - 1;
		int val = 1;
		while (row <= n) {
			val = row;
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
			row = row + 1;
			nsp = nsp - 1;
			nst = nst + 2;
		}

	}

}
