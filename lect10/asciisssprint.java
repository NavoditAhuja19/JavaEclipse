package lect10;

import java.util.Scanner;

public class asciisssprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		Scanner scn = new Scanner(System.in);
		String s1 = scn.next();
		count = asciiss(s1, "", count);
		System.out.println();
		System.out.println(count);
	}

	public static int asciiss(String ques, String ans, int count) {

		if (ques.length() == 0) {
			count++;
			System.out.print(ans + " ");
			return count;
		}
		char ch = ques.charAt(0);
		int ch1 = ch;
		String roq = ques.substring(1);
		count = asciiss(roq, ans, count);
		count = asciiss(roq, ans + ch, count);
		count = asciiss(roq, ans + ch1, count);

		return count;

	}

}
