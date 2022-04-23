package lect11;

public class cointossPrintnoconsecutivehead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cointoss(3, "");
		 cointossnoh(3, "", false);

	}

	public static void cointoss(int n, String ans) {
		if (n == 0) {

			int flag = 0;
			for (int i = 0; i + 2 <= ans.length(); i++) {
				if ((ans.substring(i, i + 2).equals("HH")) == true) {
					flag = 1;
				}

			}

			if (flag == 0)
				System.out.println(ans);

			// if (ans.indexOf("HH") == -1)
			// System.out.println(ans);
			return;

		}

		cointoss(n - 1, "H" + ans);
		cointoss(n - 1, "T" + ans);

	}

	public static void cointossnoh(int n, String ans, boolean noconsecutivehead) {
		if (n == 0) {
			System.out.println(ans);
			return;

		}
		if (noconsecutivehead) {

			cointossnoh(n - 1, "T" + ans, false);

		} else {
			cointossnoh(n - 1, "H" + ans, true);
			cointossnoh(n - 1, "T" + ans, false);
		}
	}

}
