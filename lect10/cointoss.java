package lect10;

import java.util.ArrayList;

public class cointoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(coin_toss(3));
	}

	public static ArrayList<String> coin_toss(int n) {

		if (n == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		ArrayList<String> rr = coin_toss(n - 1);

		ArrayList<String> mr = new ArrayList<>();
		for (String val : rr) {

			mr.add("h" + val);
			mr.add("t" + val);

		}

		return mr;

	}

}