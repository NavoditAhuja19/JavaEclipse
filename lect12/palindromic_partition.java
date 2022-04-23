package lect12;

public class palindromic_partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palindromic_paartition("nitin", "");

	}

	public static void palindromic_paartition(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 1; i <= ques.length(); i++) {
			String part = ques.substring(0, i);
			String roq = ques.substring(i);
			if (ispalindrome(part)) {
				palindromic_paartition(roq, ans+part + " ");
			}

		}
	}

	public static boolean ispalindrome(String str) {
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}

		return true;
	}

}
