package lec1;

import java.util.Scanner;

public class naturalsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i = 1;
		int sum = 0;
		while (i <= n) {
			sum = sum + i;
			i = i + 1;

		}
		System.out.print("sum of  " + n);
		System.out.println(" natural number is " + sum);

	}

}
