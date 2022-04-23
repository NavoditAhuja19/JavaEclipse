package lec4;

import java.util.Scanner;

public class function2armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int lo = scn.nextInt();
		int hi = scn.nextInt();
		printarmstrong(lo, hi);

	}

	public static void printarmstrong(int lo, int hi) {
		for (int i = lo; i <= hi; i++) {
			if (isarmstrong(i)) {
				System.out.println(i);
			}

		}
	}

	public static boolean isarmstrong(int n) {
		int cnt = cnt(n);
		int a = n;
		int ans = 0;
		while (a > 0) {
			int rem = a % 10;

			ans = ans + (int) Math.pow(rem, cnt);
			a = a / 10;

		}
		if (ans == n)
			return true;
		else
			return false;
	}

	public static int cnt(int n) {

		int cnt = 0;
		while (n > 0) {
			n = n / 10;
			cnt++;
		}
		return cnt;
	}

}
