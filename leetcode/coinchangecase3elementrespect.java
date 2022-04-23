package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class coinchangecase3elementrespect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates= {10,1,2,7,6,1,5};
		int target=8;
		System.out.println(combinationSum2(candidates, target));

	}

	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> main = new ArrayList<>();
		Arrays.sort(candidates);
		boolean[] check = new boolean[candidates.length];
		Arrays.fill(check, true);
		combinationSum2(candidates, target, 0, main, new ArrayList<>(), check);
		return main;
	}

	private static void combinationSum2(int[] candidates, int target, int idx, List<List<Integer>> main,
			List<Integer> temp, boolean[] check) {

		if (target == 0) {
			main.add(new ArrayList<>(temp));
			return;
		}
		if (target < 0 || idx == candidates.length) {
			return;
		}
		// yes
		if (idx == 0 || ((candidates[idx] != candidates[idx - 1])
				|| (candidates[idx] == candidates[idx - 1]) && check[idx] && !check[idx - 1])) {

			temp.add(candidates[idx]);
			check[idx] = false;
			combinationSum2(candidates, target - candidates[idx], idx + 1, main, temp, check);

			check[idx] = true;
			temp.remove(temp.size() - 1);
		}

		// no

		combinationSum2(candidates, target, idx + 1, main, temp, check);

	}

}
