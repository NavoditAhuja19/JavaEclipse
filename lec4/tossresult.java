package lec4;

import java.util.Scanner;

public class tossresult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int notoss = notoss(n);
		int val;
		char ch;
		for (int i = 0; i < notoss; i++) {
			int temp = i;
			for (int j = 1; j <= n; j++) {
				val = temp % 2;
				temp = temp / 2;
				if (val == 0) {
					ch = 'H';
				} else {
					ch = 'T';

				}
				System.out.print(ch);

			}
			System.out.println();
		}

	}

	public static int notoss(int n) {
		int toss = 0;
		toss = (int) Math.pow(2, n);
		return toss;
	}

}
