package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class dictionary_smaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();

		int[] arr = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		Arrays.sort(arr);
		String s1 = "";
		for (int i = 0; i < str.length(); i++) {
			s1 = s1 + (char) arr[i];
		}
		permutation2(s1, "", str);

	}

	public static void permutation2(String ques, String ans, String str) {
		if (ques.length() == 0) {
			if (ans.compareTo(str) < 0)
				System.out.println(ans);
			return;
		}

		for (int i = 0; i < ques.length(); i++) {

			char ch = ques.charAt(i);
			String roq = ques.substring(0, i) + ques.substring(i + 1);
			permutation2(roq, ans + ch, str);

		}

	}

}
