package lec2;

import java.util.Scanner;

public class fibbonaccipattern {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int nst = 1;
		int a = 0;
		int b = 1;
		int s = 0;

		while (row <= n) {
			int cst = 1;
			while (cst <= nst) {

				System.out.print(a + "\t");
				s = a + b;
				a = b;
				b = s;
				cst = cst + 1;
			}
			System.out.println();
			row = row + 1;
			nst = nst + 1;

		}
	}
}
