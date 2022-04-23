package lec4;

import java.util.Scanner;

public class printsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int cnt = cnt(n);
		int numsets = numsets(cnt);

		int val;
		int set;

		for (int i = 0; i < numsets; i++) {
			int temp = i;
			int num = n;

			for (int j = 1; j <= cnt; j++) {

				val = temp % 2;
				temp = temp / 2;

				int rem = num % 10;
				num=num/10;
				if (val != 0) {
					set = val * rem;
					System.out.print(set);
				} else
					System.out.print("");

			}
			System.out.println();
		}

	}

	public static int numsets(int n) {
		int count = 0;
		count = (int) Math.pow(2, n);
		return count;
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
