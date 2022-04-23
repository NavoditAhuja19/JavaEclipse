package lect11;

public class cointossPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cointoss(3, "");

	}

	public static void cointoss(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return;

		}

		cointoss(n - 1, "H" + ans);
		cointoss(n - 1, "T" + ans);

	}

}
