package lec7;

import java.util.ArrayList;

public class intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] n = { 10, 20, 20, 30, 35, 40, 40, 50 };
		int[] m = { 5, 7, 9, 10, 10, 10, 20, 25, 37, 40, 40, 40 };

		intersection(n, m);

	}

	public static void intersection(int[] n, int[] m) {
		int i = 0;
		int j = 0, cnt = 0;
		ArrayList<Integer> list = new ArrayList<>();

		while (i < n.length && j < m.length) {
			if (n[i] == m[j]) {
				list.add(cnt, n[i]);
				i++;
				j++;
				cnt++;

			} else if (m[j] < n[i])
				j++;
			else
				i++;

		}
		System.out.println(list);

	}
}
