package algorithms;

import java.util.Scanner;

public class decimal_octal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ans = 0;
		int mul = 1;
		while (n > 0) {
			int rem = n % 8;
			ans = ans + rem * mul;
			mul = mul * 10;
			n = n / 8;
		}
		System.out.println(ans);

	}

}
