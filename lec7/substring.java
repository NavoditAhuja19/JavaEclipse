package lec7;

import java.util.Scanner;

public class substring {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
	//	System.out.println("hello" + args[0]);
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		substring(str);

	}

	public static void substring(String a) {
		for (int k = 0; k <= a.length() - 1; k++) {
			for (int i = k; i <= a.length() - 1; i++) {
				for (int j = k; j <= i; j++) {
					System.out.print(a.charAt(j) );

				}
				System.out.println();
			}

		}
	}

}
