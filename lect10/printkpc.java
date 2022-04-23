
package lect10;

import java.util.ArrayList;
import java.util.Scanner;

public class printkpc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String s1=scn.next();

		int count = print_kpc(s1, "", 0);

		System.out.println(count);
	}

	public static int print_kpc(String ques, String ans, int count) {

		if (ques.length() == 0) {
			count++;
			System.out.println(ans);
			return count;
		}
		char ch = ques.charAt(0);
		String roq = ques.substring(1);
		String code = getCode(ch);
		for (int i = 0; i < code.length(); i++) {

			count = print_kpc(roq, ans + code.charAt(i), count);

		}

		return count;

	}

	public static String getCode(char ch) {
		if (ch == '1') {
			return "abc";
		} else if (ch == '2') {
			return "def";
		} else if (ch == '3') {
			return "ghi";
		} else if (ch == '4') {
			return "jkl";
		} else if (ch == '5') {
			return "mno";
		} else if (ch == '6') {
			return "pqrs";
		} else if (ch == '7') {
			return "tqv";
		}
		else if (ch == '8') {
			return "wx";
		}
		else if (ch == '9') {
			return "yz";
		}else {
			return "";
		}
// 1 -> abc , 2 -> def , 3 -> ghi , 4 -> jkl , 5 -> mno , 6 -> pqrs , 7 -> tuv ,
// 8 -> wx , 9 -> yz

	}

}
