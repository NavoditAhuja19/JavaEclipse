package leetcode;

import java.util.ArrayList;
import java.util.List;

public class palindromepartitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(partition("aaabaa"));
	}

	public static List<List<String>> partition(String s) {
		List<List<String>> main = new ArrayList<>();

		partition(s, main, new ArrayList<>());
		return main;
	}

	private static void partition(String ques, List<List<String>> main, List<String> temp) {
		if (ques.length() == 0) {
			main.add(new ArrayList<>(temp));
			return;
		}
		for (int i = 1; i <= ques.length(); i++) {
			String part = ques.substring(0, i);
			String roq = ques.substring(i);
			if (ispalindrome(part)) {
				temp.add(part);
				partition(roq, main, temp);
				temp.remove(temp.size() - 1);
			}
		}

	}

	private static boolean ispalindrome(String part) {
		for (int i = 0, j = part.length() - 1; i < part.length() / 2; i++, j--) {
			if (part.charAt(i) != part.charAt(j)) {
				return false;
			}
		}
		return true;
	}

}
