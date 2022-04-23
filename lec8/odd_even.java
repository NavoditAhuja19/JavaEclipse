package lec8;

import java.util.Scanner;

public class odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		String str1 = odd_even(str);

		System.out.println(str1);

	}

	public static String odd_even(String str) {
		char ch;
		StringBuilder sb = new StringBuilder(str);
		for (int i = 0; i < str.length(); i++) {
			//ch = sb.charAt(i);
			if (i % 2 == 0) {
				ch = str.charAt(i);
				ch--;

				sb.setCharAt(i, ch);
			} else {
				ch = str.charAt(i);
				ch++;
				
				sb.setCharAt(i, ch);

			}

		}
		return sb.toString();
	}

}
