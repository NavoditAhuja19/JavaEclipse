package lect11;

public class permutationPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// permutation("abc", "");
		permutation2("abc", "");
	}

	public static void permutation(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = ques.charAt(0);
		String roq = ques.substring(1);
		for (int i = 0; i <= ans.length(); i++) {
			permutation(roq, ans.substring(0, i) + ch + ans.substring(i));

		}

	}

	public static void permutation2(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < ques.length(); i++) {

			char ch = ques.charAt(i);
			String roq = ques.substring(0, i) + ques.substring(i + 1);
			permutation2(roq, ans + ch);

		}

	}

}
