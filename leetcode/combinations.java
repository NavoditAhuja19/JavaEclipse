package leetcode;

import java.util.ArrayList;
import java.util.List;

public class combinations {
	public static void main(String[] args) {

		System.out.println(combine(4, 2));
	}

	public static List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> main = new ArrayList<>();
		combinationSum3(n, k, 1, main, new ArrayList<>());

		return main;
	}

	private static void combinationSum3(int n, int k, int value, List<List<Integer>> main, List<Integer> temp) {

		if (k == 0) {
			main.add(new ArrayList<>(temp));
			return;
		}
		if (n < value) {
			return;
		}
		for (int i = value; i <= n; i++) {
			temp.add(i);
			combinationSum3(n, k - 1, i + 1, main, temp);
			temp.remove(temp.size() - 1);
		}

	}
}
