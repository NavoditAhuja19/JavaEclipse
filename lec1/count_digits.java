package lec1;

import java.util.Scanner;

public class count_digits {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int b = scn.nextInt();
		int a, cnt = 0;
		while (n > 0) {
			a = n % 10;
			if (a == b) {
				cnt = cnt + 1;
			}
			n = n / 10;

		}
		System.out.println(cnt);
	}

}
