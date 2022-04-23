package lec7;

import java.util.ArrayList;
import java.util.Scanner;

public class palindromecnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		substring(str);

	}

	public static void substring(String a) {
		int cnt = 0;

		for (int k = 0; k <= a.length() - 1; k++) {
			for (int i = k; i <= a.length() - 1; i++) {
				String s2 = "";
				for (int j = k; j <= i; j++) {

					s2 = a.charAt(j) + s2;

				}
				if (palindrome(s2))
					cnt++;

			}

		}
		System.out.println(cnt);
	}

	public static boolean palindrome(String a) {
		int flag = 0;
		for (int i = 0, j = (a.length() - 1); (i <= j); i++, j--) {
			if (a.charAt(i) != a.charAt(j)) {
				flag = 1;
				break;
			}

		}
		if (flag == 0) {
			return true;
		} else
			return false;

	}

}
