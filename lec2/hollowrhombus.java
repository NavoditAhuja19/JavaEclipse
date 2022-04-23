package lec2;

import java.util.Scanner;

public class hollowrhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nst = n;
		int nsp = n - 1;
		while (row <= n) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp = csp + 1;
			}
			int cst = 1;
			while (cst <= nst) {
				if (row == 1 || cst == nst || cst == 1 || row == n)
					System.out.print("*");
				else
					System.out.print(" ");
				cst = cst + 1;
			}
			System.out.println();

			nsp = nsp - 1;

			row = row + 1;
		}

	}

}
