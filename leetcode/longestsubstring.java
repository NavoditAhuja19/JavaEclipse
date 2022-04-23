package leetcode;

import java.util.HashMap;

public class longestsubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(lengthOfLongestSubstring("abcabcd"));
	}

	public static int lengthOfLongestSubstring(String s) {

		int omax = Integer.MIN_VALUE;
		int flag = 0;
		for (int k = 0; k <= s.length(); k++) {
			HashMap<Character, Integer> map = new HashMap<>();
			int l = 1;
			int max = Integer.MIN_VALUE;
			for (int i = k; i <= s.length(); i++) {
				if (i < s.length() && !map.containsKey(s.charAt(i))) {
					map.put(s.charAt(i), l);
					l++;
				} else if (i < s.length() && map.containsKey(s.charAt(i))) {
					if (max < l - 1)
						max = l - 1;
					break;

				} else if (i == s.length()) {
					if (max < l - 1)
						max = l - 1;
					flag = 1;
					break;

				}
			}
			
			if (omax < max) {
				omax = max;
			}
			if (flag == 1) {
				break;
			}
		}
		return omax;

	}

}
