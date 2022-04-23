package leetcode;

import java.util.ArrayList;
import java.util.List;

public class MaxLengthConcatenatedStringUniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> arr = new ArrayList<>();
		arr.add("un");
		arr.add("iq");
		arr.add("ue");

		System.out.println(maxLength(arr));
	}

	public static int maxLength(List<String> arr) {

		maxLength(arr, 0, "");
		return max;
	}

	static int max = Integer.MIN_VALUE;

	private static void maxLength(List<String> arr, int index, String ans) {

		int count = ans.length();
		if (uniquestring(ans)) {
			System.out.println(ans);
			if (count > max) {
				max = count;
			}

		}

		for (int i = index; i < arr.size(); i++) {
			maxLength(arr, i + 1, ans + arr.get(i));
		}

	}

	private static boolean uniquestring(String ans) {
		int[] freq = new int[26];
		for (int i = 0; i < ans.length(); i++) {

			char ch=ans.charAt(i);
			if (freq[(int) (ch - 'a') ] > 0) {
				return false;
			}
			freq[(int) (ch - 'a') ]++;
		}
		return true;
	}

}
