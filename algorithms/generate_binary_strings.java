package algorithms;

import java.util.Scanner;

public class generate_binary_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for (int i = 0; i < t; i++) {
		
			String S1=scn.next();
			
			g_strings(S1, "");
			System.out.println();
		}
	}

	public static void g_strings(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans+" ");
			return;
		}

		char ch = ques.charAt(0);

		String roq = ques.substring(1);
		if (ch == '?') {
			g_strings(roq, ans + "0");
			g_strings(roq, ans + "1");
		} else {
			g_strings(roq, ans + ch);

		}

	}

}
