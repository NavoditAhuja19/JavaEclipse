package lec1;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(" number is " + n);
		int a = 2;
		int flag = 0;
		while (a < n) {
			if (n % a == 0) {
				flag = 1;
			}

			a = a + 1;

		}
		if (flag == 0) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
	}

}
