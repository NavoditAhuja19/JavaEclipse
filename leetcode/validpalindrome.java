package leetcode;

public class validpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}

	public  boolean isPalindrome(String s) {

		for (int i = 0, j = s.length() - 1; i < j;) {
			char start = Character.toLowerCase(s.charAt(i));
			char end = Character.toLowerCase(s.charAt(j));

			if (!Character.isAlphabetic(start) && !Character.isDigit(start)) {
				i++;
				continue;
			}
			if (!Character.isAlphabetic(end) && !Character.isDigit(end)) {
				j--;
				continue;
			}
			if (start != end) {
				return false;
			}
			i++;
			j--;

		}
		return true;
	}

}
