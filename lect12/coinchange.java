package lect12;

public class coinchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		coin_change(new int[] { 2, 3, 6, 7 }, 0, 10, "");

	}

	public static void coin_change(int[] denom, int idx, int amount, String ans) {
		if (idx == denom.length || amount < 0) {
			return;
		}
		if (amount == 0) {
			System.out.println(ans);
			return;
		}
		// include
		coin_change(denom, idx, amount - denom[idx], ans + denom[idx]);
		// exclude
		coin_change(denom, idx + 1, amount, ans);

	}

}
