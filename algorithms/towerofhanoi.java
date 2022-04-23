package algorithms;

import java.util.Scanner;

public class towerofhanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\

		int count;
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		count = display(n, "T1", "T2", "T3");

		System.out.println(count);
		scn.close();
	}

	public static int display(int n, String s, String d, String a) {
		if (n == 1) {
			System.out.println("Move 1th disc from " + s + " to " + d);
			return 1;
		}
		int count = 0;
		count += display(n - 1, s, a, d);
		System.out.println("Move " + n + "th disc from " + s + " to " + d + " ");
		count += display(n - 1, a, d, s);
		return count + 1;
	}

}
