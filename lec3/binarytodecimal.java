package lec3;

import java.util.Scanner;

public class binarytodecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ans = 0;
		int mul = 1;
		while (n > 0) {
			int rem = n % 2;
			ans = ans + rem * mul;
			mul = mul * 10;
			n = n / 2;
		}
		System.out.println(ans);

	}

}
