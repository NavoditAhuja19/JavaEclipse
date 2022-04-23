package lec1;

import java.util.Scanner;

public class gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("enter two numbers");
		int n = scn.nextInt();
		int b = scn.nextInt();
		if (n > b) {
			int i = b;
			while (i > 0) {
				if (n % i == 0 && b % i == 0) {
					System.out.println(i);
					break;
				}
				i = i - 1;
			}

		} else {
			int i = n;
			while (i > 0) {
				if (n % i == 0 && b % i == 0) {
					System.out.println(i);
					break;
				}
				i = i - 1;

			}

		}
	}

}
