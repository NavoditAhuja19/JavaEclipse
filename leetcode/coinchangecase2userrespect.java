
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class coinchangecase2userrespect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates = { 2,3,6,7 };
		int target = 10;
		System.out.println(coinchange(candidates, target));

	}

	public static List<List<Integer>> coinchange(int[] candidates, int target) {
		List<List<Integer>> main = new ArrayList<>();
	//	Arrays.sort(candidates);
		coinchange(candidates, target, 0, main, new ArrayList<>());
		return main;
	}

	private static void coinchange(int[] candidates, int target, int idx, List<List<Integer>> main,
			List<Integer> temp) {

		if (target == 0) {
			main.add(new ArrayList<>(temp));
			return;
		}
		if (target < 0 || idx == candidates.length) {
			return;
		}
		for (int i = idx; i < candidates.length; i++) {

			temp.add(candidates[i]);

			coinchange(candidates, target - candidates[i], i + 1, main, temp);

			temp.remove(temp.size() - 1);

		}

	}

}
