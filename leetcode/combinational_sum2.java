package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinational_sum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates= {10,1,2,7,6,1,5};
		int target=8;
		System.out.println(combinationSum2(candidates, target));

	}

	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> main = new ArrayList<>();
		Arrays.sort(candidates);
		combinationSum2(candidates, target, 0, main, new ArrayList<>());
		return main;
	}

	private static void combinationSum2(int[] candidates, int target, int idx, List<List<Integer>> main,
			List<Integer> temp) {

		if (target == 0) {
			main.add(new ArrayList<>(temp));
			return;
		}
		if (target < 0||idx == candidates.length ) {
			return;
		}
		for (int i = idx; i < candidates.length; i++) {

			if (i ==idx || candidates[i] != candidates[i - 1]) {
				
				temp.add(candidates[i]);

				combinationSum2(candidates, target - candidates[i], i+1, main, temp);

				temp.remove(temp.size() - 1);
			}

		}

	}

}
