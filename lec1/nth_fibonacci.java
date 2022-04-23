package lec1;

import java.util.Scanner;

public class nth_fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		int c;
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i = 2;
		while (i <= n) {
			c = a + b;
			i = i + 1;
			a = b;
			b = c;
		}
		System.out.println(b);

	}

}
