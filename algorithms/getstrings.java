package algorithms;

import java.util.ArrayList;
import java.util.Scanner;

import javax.lang.model.type.NullType;

public class getstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(getstrings(str));
	}

	public static ArrayList<String> getstrings(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();

			br.add("");
			return br;

		}
		ArrayList<String> mr = new ArrayList<>();

		if (str.length() > 1) {

			char ch = str.charAt(0);
			String ros = str.substring(1);
			String s1 = str.substring(0, 2);
			String ros1 = str.substring(2);

			ArrayList<String> rr1 = getstrings(ros);
			for (String val : rr1) {

				String s = getCode(ch);

				mr.add(s + "" + val);

			}

			ArrayList<String> rr2 = getstrings(ros1);

			for (String val : rr2) {
				if(s1.compareTo("26")<=0)
				{
				int vals = Integer.parseInt(s1);

				
					mr.add((char) ('a' + vals - 1) + "" + val);
				
				}
			}

		} else if (str.length() == 1) {

			char ch = str.charAt(0);
			String S = getCode(ch);
			mr.add(S);
		}
		return mr;

	}

	public static String getCode(char ch) {
		if (ch == '1') {
			return "a";
		}
		if (ch == '2') {
			return "b";
		}
		if (ch == '3') {
			return "c";
		}
		if (ch == '4') {
			return "d";
		}
		if (ch == '5') {
			return "e";
		}
		if (ch == '6') {
			return "f";
		}
		if (ch == '7') {
			return "g";
		}
		if (ch == '8') {
			return "h";
		}
		if (ch == '9') {
			return "i";
		} else {
			return "";
		}
	}

}