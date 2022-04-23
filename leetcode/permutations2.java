package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permutations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1, 1, 3 };
		System.out.println(permuteUnique(nums));
	}

	public static List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> main = new ArrayList<>();
		boolean[] available = new boolean[nums.length];
		Arrays.fill(available, true);
		Arrays.sort(nums);
		permute(nums, available, main, new ArrayList<>());
		return main;
	}

	private static void permute(int[] nums, boolean[] availabe, List<List<Integer>> main, List<Integer> temp) {

		if (temp.size() == nums.length) {
			main.add(new ArrayList<>(temp));
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			if (!availabe[i]) {
				continue;
			}
			if(i>0&&nums[i]==nums[i-1]&&availabe[i-1]) {
				continue;
			}
			availabe[i] = false;
			temp.add(nums[i]);
			permute(nums, availabe, main, temp);
			temp.remove(temp.size() - 1);
			availabe[i] = true;

		}

	}

}
