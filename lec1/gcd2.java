package lec1;

import java.util.Scanner;

public class gcd2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int divisor = scn.nextInt();
		int dividend = scn.nextInt();
		int rem;
		while (dividend % divisor != 0) {
			rem = dividend % divisor;
			dividend = divisor;
			divisor = rem;

		}
		System.out.println(divisor);

	}
}