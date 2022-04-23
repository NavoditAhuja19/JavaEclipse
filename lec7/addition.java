package lec7;

import java.util.ArrayList;

public class addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] n = { 9, 9, 9, 9 };
		int[] m = { 7, 6 };

		addition(n, m);

	}

	public static void addition(int[] n, int[] m) {
		int val = 0, ans, rem = 0;
		int[] temp;
		ArrayList<Integer> list = new ArrayList<>();
		if (m.length > n.length) {
			temp = m;
			m = n;
			n = temp;
		}

		for (int i = n.length - 1, j = m.length - 1; i >= 0 || j >= 0; i--, j--) {
			val = 0;
			if (j == -1) {
				j = 0;
				m[j] = 0;
			}
			val = n[i] + m[j];
			if (val > 9) {
				ans = val % 10;
				rem = val / 10;
				if(i > 0)
					n[i - 1] = n[i - 1] + rem;
				val = ans;
			}

			list.add(0, val);
		}
		if (rem > 0)
			list.add(0, rem);
		System.out.println(list);

	}
}
