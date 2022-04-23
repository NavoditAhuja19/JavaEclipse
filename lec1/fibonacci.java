package lec1;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		int c;
		System.out.print( a);
		System.out.print(" "+ b);
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i = 2;
		while (i <= n) {
			c = a + b;
			System.out.print(" " +c);
			
			i = i + 1;
			a=b;
			b=c;

		}

	}

}
