package lec3;

import java.util.Scanner;

public class inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int pos = 1;
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;

			int abc = pos * (int) Math.pow(10, rem - 1);
			sum = sum + abc;
			n = n / 10;
			pos = pos + 1;

		}
		System.out.println("inverse " + sum);
	}

}
