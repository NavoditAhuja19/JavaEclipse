package lec4;

import java.util.Scanner;

public class function1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int lo = scn.nextInt();
		int hi = scn.nextInt();
		printprimes(lo, hi);

	}

	public static void printprimes(int lo, int hi) {
		for (int i = lo; i <= hi; i++) {
			if (isprime(i)) {
				System.out.println(i);
			}

		}
	}

	public static boolean isprime(int n) {
		int a = 2;
		int flag = 1;
		while (a < n) {
			if (n % a == 0) {
				flag = 0;
				break;

			}
			a++;

		}
		if (flag == 0)

			return false;

		return true;
	}

}
