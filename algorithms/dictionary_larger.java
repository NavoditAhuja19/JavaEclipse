package algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class dictionary_larger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();

		ArrayList<String> br = new ArrayList<>();
		br = permutation2(str, "", str, br);
		// System.out.println(br);
		for (int j = 0; j < br.size(); j++) {
			for (int k = 0; k < br.size() - j - 1; k++) {
				if (compare(br.get(k), br.get(k + 1)) > 0) {
					String temp = br.get(k);
					br.set(k, br.get(k + 1));
					br.set(k + 1, temp);

				}

			}

		}
		
	
		for (String val:br)
			System.out.println(val );

	}

	public static ArrayList<String> permutation(String ques, String ans, String str, ArrayList<String> mr) {

		if (ques.length() == 0) {
			if (ans.compareTo(str) > 0)
				mr.add(ans);
			return mr;
		}

		char ch = ques.charAt(0);
		String roq = ques.substring(1);
		for (int i = 0; i <= ans.length(); i++) {
			mr = permutation(roq, ans.substring(0, i) + ch + ans.substring(i), str, mr);

		}
		return mr;

	}

	public static ArrayList<String> permutation2(String ques, String ans, String str, ArrayList<String> mr) {
		if (ques.length() == 0) {
			if (ans.compareTo(str) > 0)
				mr.add(ans);
			return mr;
		}

		for (int i = 0; i < ques.length(); i++) {

			char ch = ques.charAt(i);
			String roq = ques.substring(0, i) + ques.substring(i + 1);
			mr = permutation2(roq, ans + ch, str, mr);

		}
		return mr;
	}

	public static int compare(String s1, String s2) {

		if (s1.compareTo(s2) < 0)
			return -1;
		else
			return 1;

	}

}
