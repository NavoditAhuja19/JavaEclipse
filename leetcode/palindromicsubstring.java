package leetcode;

public class palindromicsubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(longestPalindrome("babad"));
	}

	public static String longestPalindrome(String a) {
		int max = Integer.MIN_VALUE;
		String ans = "";

		int si = 0;
		int ei = 0;
		for (int k = 0; k <= a.length() - 1; k++) {
			for (int i = k + 1; i <= a.length(); i++) {

				if (palindrome(a, k, i)) {
					if ((i-k) > max) {
						max = i-k;
						si = k;
						ei = i;
					}
				}

			}

		}
		System.out.println(max);
		ans = a.substring(si, ei);
		return ans;
	}

	public static boolean palindrome(String str, int si, int ei) {
		int flag = 0;
		for (int i = si, j = ei - 1; (i <= j); i++, j--) {
			if (str.charAt(i) != str.charAt(j)) {
				flag = 1;
				break;
			}

		}
		if (flag == 0) {
			return true;
		} else
			return false;

	}

}
