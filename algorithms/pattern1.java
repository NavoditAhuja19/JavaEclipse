package algorithms;

import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nst = 1;
		int val = 1;
		int val1 = 0;
		while (row <= n) {
			int cst = 1;
			while (cst <= nst) {
				if (row % 2 == 0) {
					if (cst == 1 || cst == nst)
						System.out.print(val);
					else
						System.out.print(val1);
				}
				else
					System.out.print(val);
				cst=cst+1;
			}
			System.out.println();
			row=row+1;
			nst=nst+1;

		}

	}

}
