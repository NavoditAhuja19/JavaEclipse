package leetcode;

public class validpalindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean validPalindrome(String s) {
		return validPalindrome(s, 0, s.length() - 1, 0);
	}

	private boolean validPalindrome(String str, int si, int ei, int cnt) {
		if (cnt > 1) {
			return false;
		}
		if (si > ei && cnt <= 1) {
			return true;
		}

		boolean ans = false;
		if (str.charAt(si) == str.charAt(ei)) {
			ans = validPalindrome(str, si + 1, ei - 1, cnt);
		} else {
			boolean r1 = validPalindrome(str, si + 1, ei, cnt + 1);
			boolean r2 = validPalindrome(str, si, ei - 1, cnt + 1);
			ans = r1 || r2;
		}
		return ans;
	}

	public boolean isPalindrome(String s) {

		int cnt = 0;
		for (int i = 0, j = s.length() - 1; i < j;) {
			char start = s.charAt(i);
			char end = s.charAt(j);

			if (start != end && cnt == 0) {
				j--;
				cnt++;
				continue;
			}
			if (start != end && cnt == 1) {
				i++;
				j++;
				cnt++;

				continue;
			}

			if (start != end && cnt >= 1) {
				return false;
			}
			i++;
			j--;

		}
		return true;
	}

}
