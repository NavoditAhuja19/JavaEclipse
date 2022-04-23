package lec1;

import java.util.Scanner;

public class odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println("no is " + n);
		if (n % 2 == 0) {
			System.out.println("even");

		} else {
			System.out.println("odd");
		}
	}

}
