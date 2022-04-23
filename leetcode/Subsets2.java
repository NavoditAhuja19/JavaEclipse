package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets2 {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 2 };
		System.out.println(subsetsWithDup(nums));
	}

	public static List<List<Integer>> subsetsWithDup(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> main = new ArrayList<>();
		subsets2(nums, 0, main, new ArrayList<>());
		return main;

	}

	private static void subsets2(int[] nums, int index, List<List<Integer>> main, List<Integer> temp) {

		main.add(new ArrayList<>(temp));
		for (int i = index; i < nums.length; i++) {

			if (i > index && nums[i] == nums[i - 1]) {
				continue;
			}
			temp.add(nums[i]);
			subsets2(nums, i + 1, main, temp);

			temp.remove(temp.size() - 1);

		}

	}
}
