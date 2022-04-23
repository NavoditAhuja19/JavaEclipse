package lec9;

import java.util.ArrayList;

public class asciisubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getass("ab"));
	}

	public static ArrayList<String> getass(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;

		}
		char ch = str.charAt(0);
		int ch1 = ch;
		String ros = str.substring(1);

		ArrayList<String> rr = getass(ros);
		ArrayList<String> mr = new ArrayList<>();
		for (String val : rr) {
			mr.add(val);
			mr.add(val + ch);
			mr.add(val + ch1);
		}
		return mr;

	}

}
