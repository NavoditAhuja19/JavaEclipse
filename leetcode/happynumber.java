package leetcode;

import java.util.HashMap;

public class happynumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isHappy(19));
	}

	public static boolean isHappy(int n) {
		int flag = 0;
		HashMap<Integer, Boolean> map = new HashMap<>();
		while (n > 1) {
			// System.out.println(n);
			int a = n;
			n = 0;
			while (a > 0) {
				int rem = a % 10;
				a = a / 10;
				n += (rem * rem);
			}
			if (map.containsKey(n)) {
				flag = 1;
				break;
			}
			map.put(n, true);

		}
		if (flag == 1) {
			return false;
		}
		return true;

	}

}
